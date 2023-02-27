//Faça um programa que receba um vetor de valores e mostre a quantidade de  valores negativos. 
//Os valores e o tamanho do vetor devem ser informados pelo usuário.

import javax.swing.JOptionPane;

public class Ex1 {

	public static void main(String[] args) {

		JOptionPane.showMessageDialog(null, "O programa recebe um vetor com valores, e mostra a quantidade de números negativos");
	
	
		int tamanhoVetor = 0;
		int qntdNegativos = 0;
		while (tamanhoVetor < 1) {
			tamanhoVetor = Integer.parseInt(JOptionPane.showInputDialog("Informe o tamanho do vetor: "));
		}

		double[] vetor = new double[tamanhoVetor];
		for (int i = 0; i < tamanhoVetor; i++) {
			vetor[i] = Integer
					.parseInt(JOptionPane.showInputDialog("informe um valor para adicionar ao vetor[" + (i + 1) + "]"));
			if (vetor[i] < 0) {
				qntdNegativos = qntdNegativos + 1;
			}
		}
		JOptionPane.showMessageDialog(null, qntdNegativos,
				"A quantidade de numeros negativos informadas " + "pelo usuario é de:",
				JOptionPane.INFORMATION_MESSAGE);

	}

}
