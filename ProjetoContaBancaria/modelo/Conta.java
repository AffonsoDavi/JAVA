package modelo;

import java.text.DecimalFormat;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Conta {
	private String titularDaConta;
	private int tipo; // 1 conta corrente /2 conta poupan�a
	private double saldo;
	private ArrayList<Movimentacao> listaDeMovimentacao = new ArrayList<Movimentacao>();
	DecimalFormat df = new DecimalFormat("0.00");

	public String getTitularDaConta() {
		return titularDaConta;
	}

	public void setTitularDaConta(String titularDaConta) {
		this.titularDaConta = titularDaConta;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public ArrayList<Movimentacao> getListaDeMovimentacao() {
		return listaDeMovimentacao;
	}

	public void setListaDeMovimentacao(ArrayList<Movimentacao> listaDeMovimentacao) {
		this.listaDeMovimentacao = listaDeMovimentacao;
	}

	public void depositar(double valorDep, Movimentacao movi) {
		setSaldo(getSaldo() + valorDep);

		this.listaDeMovimentacao.add(movi);
	}

	public void sacar(double valorSaq, Movimentacao movi) {
		if (getSaldo() - valorSaq < -1000) {
			JOptionPane.showMessageDialog(null,
					"N�o � possivel realizar esta opera��o" + "\nMotivo:" + "\nSeu limite � R$: -1000", null,
					JOptionPane.ERROR_MESSAGE);
		} else {
			setSaldo(getSaldo() - valorSaq);
			this.listaDeMovimentacao.add(movi);
		}

	}

	public double gerarSaldo() {
		double saldo = getSaldo();
		return saldo;
	}

	public String gerarDadosDaConta() {
		String tipo = "";
		if (getTipo() == 1) {
			tipo = "Corrente";
		} else {
			tipo = "Poupan�a";
		}
		String info = "                      # Conta " + tipo + " #"
				+ "\n _-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_" 
				+ "\nTitular da Conta: " + getTitularDaConta()
				+ "\nSaldo: " + df.format(getSaldo())
				+"\n_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_";
		return info;
	}

	public String gerarExtrato() {
		String extrato = "";
		if (listaDeMovimentacao.size() == 0) {
			extrato = "Voc� ainda n�o fez nenhuma movimenta��o";
		} else {
			String tipo = "";
			for (int i = 0; i < listaDeMovimentacao.size(); i++) {
				Movimentacao movi = listaDeMovimentacao.get(i);
				if (movi.getTipo() == 1) {
					tipo = "Saque";
				} else {
					tipo = "Deposito";
				}
				extrato += "\n*************************************************" 
				+ "\nOpera��o: " + tipo 
				+ "\nValor: "+ movi.getValor() 
				+ "\nData: " + movi.getData()
				+"\n*************************************************";
			}
		}
		return extrato;
	}

	public String gerarExtratoDepositos() {
		int valida = 0;
		String extratoDep = "";
		if (listaDeMovimentacao.size() == 0) {
			extratoDep = "Voc� ainda n�o fez nenhuma movimenta��o de dep�sito";
		} else {
			for (int i = 0; i < listaDeMovimentacao.size(); i++) {
				Movimentacao movi = listaDeMovimentacao.get(i);
				if (movi.getTipo() == 2) {
					extratoDep += "\n*************************************************" 
							+ "\nOpera��o: Deposito"
							+ "\nValor: " + movi.getValor() 
							+ "\nData: " + movi.getData()
							+ "\n*************************************************";
				}else if(movi.getTipo() ==1) {
					valida = 1;
				}
				if (valida == 1) {
					extratoDep = "Voc� ainda n�o fez nenhuma movimenta��o";
				}
			}
		}
		return extratoDep;
		
	}

	public String gerarExtratoSaques() {
		String extratoSaq = "";
		int valida = 0;
		if (listaDeMovimentacao.size() == 0) {
			extratoSaq = "Voc� ainda n�o fez nenhuma movimenta��o";
		} else {
			for (int i = 0; i < listaDeMovimentacao.size(); i++) {
				Movimentacao movi = listaDeMovimentacao.get(i);
				if (movi.getTipo() == 1) {
					extratoSaq += "\n*************************************************" 
							+ "\nOpera��o: Saque"
							+ "\nValor: " + movi.getValor() 
							+ "\nData: " + movi.getData()
							+"\n*************************************************";
				}else if(movi.getTipo() ==2) {
					valida = 1;
				}
			}
			if (valida == 1) {
				extratoSaq = "Voc� ainda n�o fez nenhuma movimenta��o";
			}
		}
		return extratoSaq;
		
	}
}
