import javax.swing.JOptionPane;

//Escreva um programa que leia um n�mero inteiro e apresente um menu para o usu�rio escolher:
//Verificar se o n�mero � m�ltiplo de algum outro n�mero (pedir ao usu�rio esse n�mero);
//Verificar se o n�mero � par;
//Verificar se o n�mero est� entre 0 e 1000;
//Sair
//Ap�s as entradas de dados, deve ser mostrado ao usu�rio o resultado da respectiva op��o escolhida,
//e novamente o menu. Para a op��o �4- Sair�, utilize System.exit(0);

public class Ex3 {

	public static void main(String[] args) {

		JOptionPane.showMessageDialog(null,"O programa pede um n�mero e depois da as seguintes op��es ao usu�rio:"
				+ "\n*Verificar se o numero � multiplo de outro n�mero"
				+ "\n*Verificar se o n�mero � par"
				+ "\n*Verificar se o n�mero esta entre 0 e 1000"
				+ "\n*E da a op��o de sair");
		int num = 0;
		int multiplo = 0;
		int opcao = 0;
		num = Integer.parseInt(JOptionPane.showInputDialog("informe um numero inteiro:"));
		do {
			opcao = 0;
			while (opcao < 1 || opcao > 4) {
				opcao = Integer.parseInt(JOptionPane.showInputDialog("escolha uma op��o" 
				+ "\n 1 Verificar se o n�mero � m�ltiplo de algum outro n�mero"							
				+ "\n 2 Verificar se o n�mero � par" 
				+ "\n 3 Verificar se o n�mero est� entre 0 e 1000"								
				+ "\n 4 Sair"));
			}
			
			switch (opcao) {

			case 1:
				multiplo = Integer.parseInt(JOptionPane.showInputDialog("Informe um numero para: "
						+ "\n verificar se o numero informado anteriormente � " 
						+ "\n um multiplo deste numero:"));
				if (num % multiplo == 0) {
					JOptionPane.showMessageDialog(null, "O numero: " + num + ", � multiplo do numero: " + multiplo);
				} else {
					JOptionPane.showMessageDialog(null, "O numero: " + num + ", N�o � multiplo do numero: " + multiplo);
				}
				break;
			case 2:
				if (num % 2 == 0) {
					JOptionPane.showMessageDialog(null, "O numero: " + num + ", � par");
				} else {
					JOptionPane.showMessageDialog(null, "O numero: " + num + ", N�o � par");
				}
				break;
			case 3:
				if (num >= 0 && num <= 1000) {
					JOptionPane.showMessageDialog(null, "O numero: " + num + ", Esta entre 0 e 1000");
				} else {
					JOptionPane.showMessageDialog(null, "O numero: " + num + ", N�o esta entre 0 e 1000");
				}
				break;
			case 4:
				System.exit(0);
				break;
			}
		} while (opcao != 4);
	}
}
