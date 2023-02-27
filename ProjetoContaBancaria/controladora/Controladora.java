package controladora;

import visualizacao.*;

import java.sql.Date;
import java.text.DecimalFormat;

import modelo.*;

public class Controladora {
	
	Conta conta = new Conta();
	DecimalFormat df = new DecimalFormat("0.00");
	public void exibeMenu() {
		int opcao = 0;

		String nome = EntradaSaida.solicitaNome();// solicita o nome do titular da conta
		int tipoConta = EntradaSaida.solicitaTipoConta() + 1;
		this.conta.setTitularDaConta(nome);
		this.conta.setTipo(tipoConta);
		do {
			Movimentacao movi = new Movimentacao();
			String data= "";
			opcao = EntradaSaida.solicitaOpcao();
			
			switch (opcao) {
			case 0: // deposito
				double valorDep = EntradaSaida.solicitarInformacoesDeposito(); //informa valor deposito
		
				data = EntradaSaida.solicitaDatas(); // informa a data do deposito
				movi.setData(data); 
				movi.setValor(valorDep);
				movi.setTipo(2);
				conta.depositar(valorDep, movi);
				break;

			case 1: // saque	
				double valorSaq = EntradaSaida.solicitarInformacoesSaque(); //informa valor deposito
			
				 data = EntradaSaida.solicitaDatas(); // informa a data do deposito
				movi.setData(data); 
				movi.setValor(valorSaq); 
				movi.setTipo(1);
				conta.sacar(valorSaq, movi); 
				break;

			case 2: // exibir saldo
				double saldo = this.conta.gerarSaldo();
				EntradaSaida.exibirSaldo(df.format(saldo));
				
				break;

			case 3: // exibir dados da conta
				String dados =this.conta.gerarDadosDaConta();
				EntradaSaida.exibirDadosDaConta(dados);
				break;

			case 4: // exibir extrato
				String extrato = this.conta.gerarExtrato();
				EntradaSaida.exibirExtratoCompleto(extrato);
				break;

			case 5: // exibir extrato depositos
				String extratoDep = this.conta.gerarExtratoDepositos();
				EntradaSaida.exibirExtratoCompleto(extratoDep);
				break;

			case 6: // exibir extrato saques
				String extratoSaq = this.conta.gerarExtratoSaques();
				EntradaSaida.exibirExtratoCompleto(extratoSaq);
				break;

			case 7: // sair do programa
				break;

			}

		} while (opcao != 7);
	}
}
