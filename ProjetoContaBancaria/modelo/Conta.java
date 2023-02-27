package modelo;

import java.text.DecimalFormat;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Conta {
	private String titularDaConta;
	private int tipo; // 1 conta corrente /2 conta poupança
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
					"Não é possivel realizar esta operação" + "\nMotivo:" + "\nSeu limite é R$: -1000", null,
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
			tipo = "Poupança";
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
			extrato = "Você ainda não fez nenhuma movimentação";
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
				+ "\nOperação: " + tipo 
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
			extratoDep = "Você ainda não fez nenhuma movimentação de depósito";
		} else {
			for (int i = 0; i < listaDeMovimentacao.size(); i++) {
				Movimentacao movi = listaDeMovimentacao.get(i);
				if (movi.getTipo() == 2) {
					extratoDep += "\n*************************************************" 
							+ "\nOperação: Deposito"
							+ "\nValor: " + movi.getValor() 
							+ "\nData: " + movi.getData()
							+ "\n*************************************************";
				}else if(movi.getTipo() ==1) {
					valida = 1;
				}
				if (valida == 1) {
					extratoDep = "Você ainda não fez nenhuma movimentação";
				}
			}
		}
		return extratoDep;
		
	}

	public String gerarExtratoSaques() {
		String extratoSaq = "";
		int valida = 0;
		if (listaDeMovimentacao.size() == 0) {
			extratoSaq = "Você ainda não fez nenhuma movimentação";
		} else {
			for (int i = 0; i < listaDeMovimentacao.size(); i++) {
				Movimentacao movi = listaDeMovimentacao.get(i);
				if (movi.getTipo() == 1) {
					extratoSaq += "\n*************************************************" 
							+ "\nOperação: Saque"
							+ "\nValor: " + movi.getValor() 
							+ "\nData: " + movi.getData()
							+"\n*************************************************";
				}else if(movi.getTipo() ==2) {
					valida = 1;
				}
			}
			if (valida == 1) {
				extratoSaq = "Você ainda não fez nenhuma movimentação";
			}
		}
		return extratoSaq;
		
	}
}
