package modelo;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import visualização.EntradaSaida;

public class Fabrica {

	ArrayList<Carro> listaDeCarros = new ArrayList<Carro>();

	public ArrayList<Carro> getListaDeCarros() {
		return listaDeCarros;
	}

	public void setListaDeCarros(ArrayList<Carro> listaDeCarros) {
		this.listaDeCarros = listaDeCarros;
	}

	public void fabricarCarro(Carro carros, String nome, String cor) {
		if (listaDeCarros.size() == 0) {
			this.listaDeCarros.add(carros);
		} else {
			int valida = 0;
			for (int i = 0; i < listaDeCarros.size(); i++) {

				Carro carro = this.listaDeCarros.get(i);

				if (carro.getNome().contains(nome) && carro.getCor().contains(cor)) {
					valida = valida + 1;
				}
			}
			if (valida == 0) {
				this.listaDeCarros.add(carros);
			} else {
				EntradaSaida.mostraMsgCarroExistente();
			}
		}
	}

	public void venderCarro() {
		if (listaDeCarros.size() == 0) {
			EntradaSaida.mostraMsgErro();
		} else {
			String nomeVenda = EntradaSaida.solicitaNomeVenda();
			String corVenda = EntradaSaida.solicitaCorVenda();
			for (int i = 0; i < listaDeCarros.size(); i++) {

				Carro carro = this.listaDeCarros.get(i);

				if (carro.getNome().contains(nomeVenda) && carro.getCor().contains(corVenda)) {
					this.listaDeCarros.remove(carro);

				}else {
					JOptionPane.showMessageDialog(null, "Este carro ainda não foi fabricado, ou já foi vendido");
				}

			}
		}
	}

	public String criarInformacoes() {
		if (listaDeCarros.size() == 0) {
			String info = "Ainda não há carros fabricados!";
			return info;
		} else {
			String informacoes = "";
			for (Carro carro : this.listaDeCarros) {
				informacoes += "Nome do carro: " + carro.getNome() + "\n" + "cor do carro: " + carro.getCor() + "\n"
						+ "------------------------------------\n";
			}

			return informacoes;
		}
	}
}
