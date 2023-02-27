import javax.swing.JOptionPane;

//Faça um programa que peça ao usuário para informar 03 números
//e mostre o menor entre eles. Considere que o usuário não poderá informar números iguais.
public class Ex3 {

	public static void main(String[] args) {
		int num1=0;
		int num2=0;
		int num3=0;
		
		JOptionPane.showMessageDialog(null,"Este programa pede 3 números ao usuario e informa o menor entre os mesmos");
		num1 = Integer.parseInt(JOptionPane.showInputDialog("informe o 1º numero:"));

		do {
			num2 = Integer.parseInt(JOptionPane.showInputDialog("informe o 2º numero:"));
		} while (num2 == num1);

		do {
			num3 = Integer.parseInt(JOptionPane.showInputDialog("informe o 3º numero:"));
		} while (num3 == num2 || num3 == num1);
		if (num1 < num2 && num1 < num3) {
			JOptionPane.showMessageDialog(null, "o menor numero, é o numero 1");
		} else if (num2 < num1 && num2 < num3) {
			JOptionPane.showMessageDialog(null, "o menor numero, é o numero 2");
		} else {
			JOptionPane.showMessageDialog(null, "o menor numero, é o numero 3");
		}
	}
}
