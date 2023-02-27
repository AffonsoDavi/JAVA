package controle;

import java.util.ArrayList;

import javax.swing.JOptionPane;
import visualizacao.EntradaSaida;
import modelo.*;

public class Controladora {

	private Casa casa = null;

	public void exibeMenu() {
		int opcao;
		int valida = 0;
		do {

			opcao = EntradaSaida.solicitaOpcao();
			if (valida < 1) {
				while (opcao != 0 && opcao != 3) {
					EntradaSaida.validaConstrucao();
					opcao = EntradaSaida.solicitaOpcao();
				}
				valida = 1;
			}

			switch (opcao) {

			case 0:

				this.casa = new Casa();

				String descricao = EntradaSaida.solicitaDescricao("casa", 0);
				String cor = EntradaSaida.solicitaCor();
				int qtdePortas = 0;
				int qtdeJanelas = 0;
				while (qtdePortas < 1) {
					qtdePortas = EntradaSaida.solicitaQtdeAberturas("portas");
				}
				while (qtdeJanelas < 1) {
					qtdeJanelas = EntradaSaida.solicitaQtdeAberturas("janelas");
				}
				ArrayList<Aberturas> listaDePortas = new ArrayList<Aberturas>();
				for (int i = 0; i < qtdePortas; i++) {
					Porta porta = new Porta();
					porta.setDescricao(EntradaSaida.solicitaDescricao("porta", (i + 1)));
					porta.setEstado(EntradaSaida.solicitaEstado("porta"));
					listaDePortas.add(porta);
				}

				ArrayList<Aberturas> listaDeJanelas = new ArrayList<Aberturas>();
				for (int i = 0; i < qtdeJanelas; i++) {
					Janela janela = new Janela();
					janela.setDescricao(EntradaSaida.solicitaDescricao("janela", (i + 1)));
					janela.setEstado(EntradaSaida.solicitaEstado("janela"));
					listaDeJanelas.add(janela);
				}
				this.casa.constroiCasa(descricao, cor, listaDePortas, listaDeJanelas);

				break;

			case 1:
				String tipoAbertura = EntradaSaida.solicitaTipoAbertura();

				ArrayList<Aberturas> listaDeAberturas = new ArrayList<Aberturas>();

				if (tipoAbertura.equals("porta")) {
					listaDeAberturas = this.casa.getListaDePortas();
				} else {
					listaDeAberturas = this.casa.getListaDeJanelas();
				}

				int posicao = EntradaSaida.solicitaAberturaMover(listaDeAberturas);
				int novoEstado = 0;

				if (posicao != -1) {
					novoEstado = EntradaSaida.solicitaEstado(tipoAbertura);
					Aberturas abertura = this.casa.retornaAbertura(posicao, tipoAbertura);
					this.casa.moverAbertura(abertura, novoEstado);
					System.out.println("Novo estado da " + tipoAbertura + ": " + abertura.getEstado());
				} else {
					EntradaSaida.exibeMsgAbertura();
				}

				break;

			case 2:
				String informacoes = this.casa.geraInfoCasa();
				EntradaSaida.exibeInfoCasa(informacoes);
				break;
			}
		} while (opcao != 3);
		EntradaSaida.exibeMsgEncerraPrograma();

		System.exit(0);
	}
}
