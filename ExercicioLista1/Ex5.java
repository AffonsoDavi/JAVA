import javax.swing.JOptionPane;

//Fa�a um algoritmo que pe�a ao usu�rio 10 n�meros e mostre posteriormente quantos s�o pares 
//e a soma deles, bem como quantos s�o �mpares e a soma deles.
public class Ex5 {

	public static void main(String[] args) {

		int somaImpares = 0;
		int somaPares = 0;
		int totalPares = 0;
		int totalImpares = 0;
		int[] num = new int[10];

		JOptionPane.showMessageDialog(null,"Este programa pede 10 n�meros ao usu�rio e posteriormente informa:"
				+ "\nQuantos s�o pares e a soma deles"
				+ "\nE quantos s�o �mpares e a soma deles.");
		for (int i = 0; i < 10; i++) {
			num[i] = Integer.parseInt(JOptionPane.showInputDialog("informe o " + (i + 1) + "� n�mero: "));
			if ((num[i] % 2) == 0) {
				totalPares = totalPares + 1;
				somaPares = somaPares + num[i];
			} else {
				totalImpares = totalImpares + 1;
				somaImpares = somaImpares + num[i];
			}
		}
		JOptionPane.showMessageDialog(null,
				"Foram informados " + totalPares + " n�meros Pares e a soma de todos os n�meros pares � de: " + somaPares +
				"\nForam informados " + totalImpares + " n�meros �mpares e a soma de todos os n�meros �mpares � de: " + somaImpares);
	}

}
