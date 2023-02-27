import javax.swing.JOptionPane;

public class IntroducaoJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero;
		int[] valores = new int[10];
		// RECEBER E GUARDAR OS 10 NUMERO
		numero = 0;
		for (int i = 0; i < 10; i++) {
			do {
				valores[i] = Integer.parseInt(JOptionPane.showInputDialog("informe o " + (i + 1) + "º valor: "));
			} while (valores[i] < 0);

			if (numero < valores[i]) {
				numero = valores[i];
			}
		}

		// CRIANDO VARIAVEL PARA ARMAZENAR SE USUARIO DESEJA ENCERRAR O PROGRAMA
		String repetir;
		// INICIO DA ESTRUTURA DE REPETIÇÃO PARA O MENU
		do {
			// SOLICITANDO OPCAO DO MENU
			int opcao = Integer.parseInt(JOptionPane.showInputDialog("O que você deseja ver?"
					+ "\n 1 - Todos os valores" 
					+ "\n 2 - Somente o pirmeiro valor" 
					+ "\n 3 - Somente o último valor"
					+ "\n 4 - Ver os valores pares" 
					+ "\n 5 - Somente o  maior valor"));

			// programação do menu
			switch (opcao) {
			// Mostrando todos os valores
			case 1:
				for (int i = 0; i < 10; i++) {
					JOptionPane.showMessageDialog(null, valores[i], " valor" + (i + 1),JOptionPane.INFORMATION_MESSAGE);
				}
				break;
			// mostrando somente o primeiro valor
			case 2:
				JOptionPane.showMessageDialog(null, valores[0], "primeiro valor", JOptionPane.INFORMATION_MESSAGE);
				break;
			// mostrando somente o ultimo valor
			case 3:
				JOptionPane.showMessageDialog(null, valores[9], "ultimo valor", JOptionPane.INFORMATION_MESSAGE);
				break;
			// mostrando somente os valores pares
			case 4:
				String valoresPares = "";
				for (int i = 0; i < 10; i++) {
					if (valores[i] % 2 == 0) {
						if (valoresPares != "") {
							valoresPares += ", ";
						}
						valoresPares += valores[i];
					}
				}
				JOptionPane.showMessageDialog(null, valoresPares, "valores pares", JOptionPane.INFORMATION_MESSAGE);
				break;
			// MOSTRANDO SOMENTE O MAIOR VALOR
			case 5:
				JOptionPane.showMessageDialog(null, numero, "Maior valor", JOptionPane.INFORMATION_MESSAGE);
				break;                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            
			// caso a opção seja inválida
			default:
				JOptionPane.showMessageDialog(null, "opção inválida", "Erro", JOptionPane.INFORMATION_MESSAGE);
				break;
			}

			// solicitação se usuario deseja voltar ao menu
			repetir = JOptionPane.showInputDialog(
					"Deseja voltar ao menu?" + "\n Digite S para sim ou outro caractere para encerrar");
			// FIM DA ESTRUTURA DE REPETICAO PARA O MENU
		} while (repetir.equals("S") || repetir.equals("s"));
	}
}
