import java.text.DecimalFormat;

import javax.swing.JOptionPane;

//Escreva um programa que receba quatro notas do aluno e as insira em um vetor. 
//Depois, calcule a média aritmética entre as quatro notas e mostre o "conceito" do aluno conforme as instruções: 
//9.0 ou maior = Conceito A
//entre 8.0 e 8.9 = Conceito B
//entre 7.0 e 7.9 = Conceito C
//menor que 7.0 = Conceito D

public class Ex2 {

	public static void main(String[] args) {
		
		JOptionPane.showMessageDialog(null,"O programa recebe 4 notas, calcula a média aritética de um aluno e depois informa seu conceito");
		double[] notas = new double[4];
		double somaNotas = 0;
		double media;
		String decMedia= "";

		for (int i = 0; i < 4; i++) {
			do {
				notas[i] = Integer.parseInt(JOptionPane.showInputDialog("insira a " + (i + 1) + "º nota do aluno"));
			} while (notas[i] < 0 || notas[i] > 10);
			somaNotas = somaNotas + notas[i];
		}
		
		media = somaNotas / 4;
		decMedia = new DecimalFormat("#,##0.00").format(media);

		if (media >= 9) {
			JOptionPane.showMessageDialog(null, "O aluno atingiu o conceito A com a media: " + decMedia);
		} else if (media >= 8 && media <= 8.9) {
			JOptionPane.showMessageDialog(null, "O aluno atingiu o conceito B com a media: " + decMedia);
		} else if (media >= 7 && media <= 7.9) {
			JOptionPane.showMessageDialog(null, "O aluno atingiu o conceito C com a media: " + decMedia);
		} else if (media < 7) {
			JOptionPane.showMessageDialog(null, "O aluno atingiu o conceito D com a media: " + decMedia);
		}
	}
}
