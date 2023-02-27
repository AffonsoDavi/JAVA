package visualizacao;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class EntradaSaida {

	public static int solicitaCodigo() {
		int codigo = Integer.parseInt(JOptionPane.showInputDialog("Informe o código do produto"));
		return codigo;

	}

	public static String solicitaDescricao() {
		String descricao = JOptionPane.showInputDialog(null, "Informe a descrição do produto");
		return descricao;

	}

	public static double solicitaPreco() {
		double preco = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o preço do produto"));
		return preco;

	}

	public static String solicitaData() {
		String data = JOptionPane.showInputDialog(null, "Informe a data da venda");
		return data;
	}

	public static int solicitaQtde() {
		int qntde = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade do produto"));
		return qntde;

	}

	public static void exibirEstoque(String lista) {
		JOptionPane.showMessageDialog(null, lista);
	}

	public static void exibirCupons(String lista) {
		JOptionPane.showMessageDialog(null, lista);
	}

	public static void exibirPrecoCupons(String valor) {
		JOptionPane.showMessageDialog(null, "O valor total dos cupons é de: R$ " + valor);
	}

	public static int solicitaOpcao() {
		String[] opcao = { "Cadastrar Produto", "Vender Produto", "Ver produtos", "Ver cupons",
				"Exibir valor total dos cupons", "Sair do programa" };
		JComboBox<String> menu = new JComboBox<String>(opcao);
		JOptionPane.showConfirmDialog(null, menu, "solicite a opção desejada", JOptionPane.OK_CANCEL_OPTION);
		return menu.getSelectedIndex();
	}
}
