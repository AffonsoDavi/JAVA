import javax.swing.JOptionPane;

//Faça um algoritmo que peça ao usuário 10 números e mostre posteriormente quantos são pares 
//e a soma deles, bem como quantos são ímpares e a soma deles.
public class Ex5 {

	public static void main(String[] args) {

		int somaImpares = 0;
		int somaPares = 0;
		int totalPares = 0;
		int totalImpares = 0;
		int[] num = new int[10];

		JOptionPane.showMessageDialog(null,"Este programa pede 10 números ao usuário e posteriormente informa:"
				+ "\nQuantos são pares e a soma deles"
				+ "\nE quantos são ímpares e a soma deles.");
		for (int i = 0; i < 10; i++) {
			num[i] = Integer.parseInt(JOptionPane.showInputDialog("informe o " + (i + 1) + "º número: "));
			if ((num[i] % 2) == 0) {
				totalPares = totalPares + 1;
				somaPares = somaPares + num[i];
			} else {
				totalImpares = totalImpares + 1;
				somaImpares = somaImpares + num[i];
			}
		}
		JOptionPane.showMessageDialog(null,
				"Foram informados " + totalPares + " números Pares e a soma de todos os números pares é de: " + somaPares +
				"\nForam informados " + totalImpares + " números Ímpares e a soma de todos os números ímpares é de: " + somaImpares);
	}

}
