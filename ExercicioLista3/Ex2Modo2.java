import java.text.DecimalFormat;

import javax.swing.JOptionPane;

//Fa�a um programa que receba as tr�s notas de um aluno e pergunte ao professor qual m�dia ele deseja calcular: 
//aritm�tica ou ponderada. Se for a m�dia ponderada, os pesos de cada nota devem ser informados.
//Cada m�dia dever� ser calculada por um m�todo;
//Os dois m�todos devem receber como par�metros as notas;
//No caso do m�todo da m�dia ponderada, al�m das notas, o m�todo dever� receber tamb�m os pesos, que devem ser previamente solicitados ao usu�rio;
//Os dois m�todos devem retornar a m�dia;
public class Ex2Modo2 {

	public static void main(String[] args) {

		double[] notas = new double[3];
		double[] pesos = new double[3];
		int escolha = 0;
		double media = 0;

		JOptionPane.showMessageDialog(null,
				"O programa consiste em perguntar ao usuario se ele deseja ver sua m�dia aritm�tica ou a ponderada,"
						+ "\nAo ser informado o programa mostra a m�dia escolhida!");
		do {
			escolha = Integer.parseInt(JOptionPane.showInputDialog(null, "Escolha qual m�dia voc� deseja ver:"
					+ "\nDigite (1) para aritmetica" + "\nDigite (2) para ponderada"));
		} while (escolha != 1 && escolha != 2);
		
		for (int i = 0; i < 3; i++) {
			do {
				notas[i] = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a " + (i + 1) + "� NOTA"));
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
			JOptionPane.showMessageDialog(null,"A m�dia final foi de: " + df.format(media) + " e o aluno est� aprovado");
		} else {
			JOptionPane.showMessageDialog(null,
					"A m�dia final foi de: " + df.format(media) + " e o aluno est� reprovado");
		}
	}
}
