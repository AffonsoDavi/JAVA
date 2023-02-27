import javax.swing.JOptionPane;

//Escreva um programa que leia um número inteiro e apresente um menu para o usuário escolher:
//Verificar se o número é múltiplo de algum outro número (pedir ao usuário esse número);
//Verificar se o número é par;
//Verificar se o número está entre 0 e 1000;
//Sair
//Após as entradas de dados, deve ser mostrado ao usuário o resultado da respectiva opção escolhida,
//e novamente o menu. Para a opção “4- Sair”, utilize System.exit(0);

public class Ex3 {

	public static void main(String[] args) {

		JOptionPane.showMessageDialog(null,"O programa pede um número e depois da as seguintes opções ao usuário:"
				+ "\n*Verificar se o numero é multiplo de outro número"
				+ "\n*Verificar se o número é par"
				+ "\n*Verificar se o número esta entre 0 e 1000"
				+ "\n*E da a opção de sair");
		int num = 0;
		int multiplo = 0;
		int opcao = 0;
		num = Integer.parseInt(JOptionPane.showInputDialog("informe um numero inteiro:"));
		do {
			opcao = 0;
			while (opcao < 1 || opcao > 4) {
				opcao = Integer.parseInt(JOptionPane.showInputDialog("escolha uma opção" 
				+ "\n 1 Verificar se o número é múltiplo de algum outro número"							
				+ "\n 2 Verificar se o número é par" 
				+ "\n 3 Verificar se o número está entre 0 e 1000"								
				+ "\n 4 Sair"));
			}
			
			switch (opcao) {

			case 1:
				multiplo = Integer.parseInt(JOptionPane.showInputDialog("Informe um numero para: "
						+ "\n verificar se o numero informado anteriormente é " 
						+ "\n um multiplo deste numero:"));
				if (num % multiplo == 0) {
					JOptionPane.showMessageDialog(null, "O numero: " + num + ", É multiplo do numero: " + multiplo);
				} else {
					JOptionPane.showMessageDialog(null, "O numero: " + num + ", Não é multiplo do numero: " + multiplo);
				}
				break;
			case 2:
				if (num % 2 == 0) {
					JOptionPane.showMessageDialog(null, "O numero: " + num + ", É par");
				} else {
					JOptionPane.showMessageDialog(null, "O numero: " + num + ", Não é par");
				}
				break;
			case 3:
				if (num >= 0 && num <= 1000) {
					JOptionPane.showMessageDialog(null, "O numero: " + num + ", Esta entre 0 e 1000");
				} else {
					JOptionPane.showMessageDialog(null, "O numero: " + num + ", Não esta entre 0 e 1000");
				}
				break;
			case 4:
				System.exit(0);
				break;
			}
		} while (opcao != 4);
	}
}
