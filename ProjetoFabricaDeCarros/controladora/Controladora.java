package controladora;

import modelo.*;
import visualização.*;

public class Controladora {

	Fabrica fabrica = new Fabrica();

	public void exibeMenu() {
		int opcao;
		do {
			opcao = EntradaSaida.solicitaOpcao();
			
			switch (opcao) {
			case 0: // fabricar carro

				int qtdeCarro = EntradaSaida.qtdeCarros();
				while (qtdeCarro < 1) {
					EntradaSaida.msgAlerta();
					qtdeCarro = EntradaSaida.qtdeCarros();
				}

				for (int i = 0; i < qtdeCarro; i++) {
					Carro carro = new Carro();
					String nome = EntradaSaida.solicitaNome((i + 1));
					String cor = EntradaSaida.solicitaCor((i + 1));
					carro.setNome(nome);
					carro.setCor(cor);
					this.fabrica.fabricarCarro(carro, nome, cor);
				}
				// System.out.println("nome: " + carro.getNome() + " cor: " + carro.getCor());

				break;
			case 1:
					this.fabrica.venderCarro();
				
				break;
			case 2:
				String informacoes = this.fabrica.criarInformacoes();
				EntradaSaida.mostraInformacoes(informacoes);
				break;
			case 3:
				System.out.println("mostrar 3");
				System.exit(0);
				break;
			}
		} while (opcao != 3);

	}

}
