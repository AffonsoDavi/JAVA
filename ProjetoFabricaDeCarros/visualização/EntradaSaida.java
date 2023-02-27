package visualiza��o;

import java.util.ArrayList;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;

import modelo.Fabrica;

public class EntradaSaida {

	public static int qtdeCarros() {
		int qtdeCarro = Integer.parseInt(JOptionPane.showInputDialog("Quantos carros deseja fabricar?"));
		return qtdeCarro;
	}

	public static void msgAlerta() {
		JOptionPane.showMessageDialog(null, "Voc� deve fabricar ao menos 1 carro.", null, JOptionPane.WARNING_MESSAGE);
	}

	public static int solicitaOpcao() {
		String[] opcao = { "Fabricar carro", "Vender carro", "Ver carros", "Sair do Programa" };
		JComboBox<String> menu = new JComboBox<String>(opcao);
		JOptionPane.showConfirmDialog(null, menu, "Selecione a op��o desejada", JOptionPane.OK_CANCEL_OPTION);
		return menu.getSelectedIndex();
	}

	public static String solicitaNome(int i) {
		return JOptionPane.showInputDialog("Informe o nome do " + i + "� carro");
	}

	public static String solicitaCor(int i) {
		return JOptionPane.showInputDialog("Informe a cor do " + i + "� carro");
	}

	public static String solicitaNomeVenda() {
		String carroVenda = JOptionPane.showInputDialog("Qual o nome do carro que voc� gostaria de vender?");
		return carroVenda;
	}
	
	public static String solicitaCorVenda() {
		String carroVenda = JOptionPane.showInputDialog("Qual a cor do carro que voc� gostaria de vender?");
		return carroVenda;
	}
	
	public static void mostraInformacoes(String informacoes) {
		JOptionPane.showMessageDialog(null, informacoes, "Informa��o dos carros", JOptionPane.INFORMATION_MESSAGE);
	}
	
	public static void mostraMsgCarroExistente() {
		JOptionPane.showMessageDialog(null, "seu carro ja existe",null,  JOptionPane.WARNING_MESSAGE);
	}
	
	public static void mostraMsgErro() {		
		JOptionPane.showMessageDialog(null, "N�o � poss�vel executar esta a��o",null,  JOptionPane.WARNING_MESSAGE);
	}
	
}
