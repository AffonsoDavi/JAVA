package visualizacao;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class EntradaSaida {
	public static double solicitarInformacoesDeposito() {
		double valor = Double
				.parseDouble(JOptionPane.showInputDialog(null, "Qual o valor do depósito que você deseja efetuar?"));
		return valor;
	}

	public static int solicitaTipoConta() {
		String[] tipo = { "Conta corrente", "Conta Poupança" };
		JComboBox<String> menu = new JComboBox<String>(tipo);
		JOptionPane.showConfirmDialog(null, menu, "Selecione o tipo de conta:", JOptionPane.OK_CANCEL_OPTION);
		return menu.getSelectedIndex();
	}

	public static String solicitaDatas() {
		String data = JOptionPane.showInputDialog("Informe a data da transferencia");
		return data;
	}

	public static double solicitarInformacoesSaque() {
		double valor = Double
				.parseDouble(JOptionPane.showInputDialog(null, "Qual o valor do saque que você deseja efetuar?"));
		return valor;
	}

	public static void exibirSaldo(String saldo) {
		JOptionPane.showMessageDialog(null, "Seu saldo é de: R$ " + saldo);
	}

	public static void exibirDadosDaConta(String dados) {
		JOptionPane.showMessageDialog(null, dados);

	}

	public static void exibirExtratoCompleto(String extrato) {
		JOptionPane.showMessageDialog(null, extrato);

	}

	public static void exibirExtratoDeDepositos(String extratoDep) {
		JOptionPane.showMessageDialog(null, extratoDep);

	}

	public static String exibirExtratoDeSaques(String extratoSaq) {
		JOptionPane.showMessageDialog(null, extratoSaq);
		return null;
	}

	public static int solicitaOpcao() {
		String[] opcao = { "Depositar", "Sacar", "Exibir Saldo", "Exibir Dados da Conta", "Exibir Extrato",
				"Exibir Extrato Depositos", "Exibir Extrato Saques", "Sair do Programa" };
		JComboBox<String> menu = new JComboBox<String>(opcao);
		JOptionPane.showConfirmDialog(null, menu, "Selecione a opção desejada", JOptionPane.OK_CANCEL_OPTION);
		return menu.getSelectedIndex();
	}

	public static String solicitaNome() {
		String nome = JOptionPane.showInputDialog("Informe o nome completo do titular da conta");
		return nome;
	}
}
