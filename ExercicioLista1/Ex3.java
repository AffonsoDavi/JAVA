import javax.swing.JOptionPane;

//Fa�a um programa que pe�a ao usu�rio para informar 03 n�meros
//e mostre o menor entre eles. Considere que o usu�rio n�o poder� informar n�meros iguais.
public class Ex3 {

	public static void main(String[] args) {
		int num1=0;
		int num2=0;
		int num3=0;
		
		JOptionPane.showMessageDialog(null,"Este programa pede 3 n�meros ao usuario e informa o menor entre os mesmos");
		num1 = Integer.parseInt(JOptionPane.showInputDialog("informe o 1� numero:"));

		do {
			num2 = Integer.parseInt(JOptionPane.showInputDialog("informe o 2� numero:"));
		} while (num2 == num1);

		do {
			num3 = Integer.parseInt(JOptionPane.showInputDialog("informe o 3� numero:"));
		} while (num3 == num2 || num3 == num1);
		if (num1 < num2 && num1 < num3) {
			JOptionPane.showMessageDialog(null, "o menor numero, � o numero 1");
		} else if (num2 < num1 && num2 < num3) {
			JOptionPane.showMessageDialog(null, "o menor numero, � o numero 2");
		} else {
			JOptionPane.showMessageDialog(null, "o menor numero, � o numero 3");
		}
	}
}
