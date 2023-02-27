import java.text.DecimalFormat;

import javax.swing.JOptionPane;

//Faça um programa que receba as três notas de um aluno e pergunte ao professor qual média ele deseja calcular: 
//aritmética ou ponderada. Se for a média ponderada, os pesos de cada nota devem ser informados.
//Cada média deverá ser calculada por um método;
//Os dois métodos devem receber como parâmetros as notas;
//No caso do método da média ponderada, além das notas, o método deverá receber também os pesos, que devem ser previamente solicitados ao usuário;
//Os dois métodos devem retornar a média;
public class Ex2Modo2 {

	public static void main(String[] args) {

		double[] notas = new double[3];
		double[] pesos = new double[3];
		int escolha = 0;
		double media = 0;

		JOptionPane.showMessageDialog(null,
				"O programa consiste em perguntar ao usuario se ele deseja ver sua média aritmética ou a ponderada,"
						+ "\nAo ser informado o programa mostra a média escolhida!");
		do {
			escolha = Integer.parseInt(JOptionPane.showInputDialog(null, "Escolha qual média você deseja ver:"
					+ "\nDigite (1) para aritmetica" + "\nDigite (2) para ponderada"));
		} while (escolha != 1 && escolha != 2);
		
		for (int i = 0; i < 3; i++) {
			do {
				notas[i] = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a " + (i + 1) + "º NOTA"));
			} while (notas[i] > 10 || notas[i] < 0);
		}
		if (escolha == 2) {
			for (int c = 0; c < 3; c++) {
				do {
					pesos[c] = Double
							.parseDouble(JOptionPane.showInputDialog(null, "Informe o PESO da prova " + (c + 1)));
				} while (pesos[c] > 10 || pesos[c] < 0);
			}
		}
		switch (escolha) {

		case 1:
			 media = calculaAritmetica(notas);			
			mostrarResultado(media);
			break;

		case 2:
			 media = calculaMediaPonderada(notas, pesos);			
			mostrarResultado(media);
			break;
		}
	}

	public static double calculaMediaPonderada(double[] notas, double[] pesos) {
		double media = (((notas[0] * pesos[0]) + (notas[1] * pesos[1]) + (notas[2] * pesos[2]))
				/ (pesos[0] + pesos[1] + pesos[2]));
		return media;
	}

	public static double calculaAritmetica(double[] notas) {
		double media = ((notas[0] + notas[1] + notas[2]) / 3);
		return media;
	}

	public static void mostrarResultado(double media) {
		DecimalFormat df = new DecimalFormat("0.00");
		if (media >= 7) {
			JOptionPane.showMessageDialog(null,"A média final foi de: " + df.format(media) + " e o aluno está aprovado");
		} else {
			JOptionPane.showMessageDialog(null,
					"A média final foi de: " + df.format(media) + " e o aluno está reprovado");
		}
	}
}
