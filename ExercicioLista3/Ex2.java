import java.text.DecimalFormat;

import javax.swing.JOptionPane;

//Fa�a um programa que receba as tr�s notas de um aluno e pergunte ao professor qual m�dia ele deseja calcular: 
//aritm�tica ou ponderada. Se for a m�dia ponderada, os pesos de cada nota devem ser informados.
//Cada m�dia dever� ser calculada por um m�todo;
//Os dois m�todos devem receber como par�metros as notas;
//No caso do m�todo da m�dia ponderada, al�m das notas, o m�todo dever� receber tamb�m os pesos, que devem ser previamente solicitados ao usu�rio;
//Os dois m�todos devem retornar a m�dia;
//Um m�todo deve ser criado para receber a m�dia final e mostrar se o aluno est� aprovado ou reprovado,
//considerando que a m�dia m�nima para aprova��o � 7.

public class Ex2 {

	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null,
				"O programa consiste em perguntar ao usuario se ele deseja ver sua m�dia aritm�tica ou a ponderada,"
						+ "\nAo ser informado o programa mostra a m�dia escolhida!");

		double peso1 = 0;
		double peso2 = 0;
		double peso3 = 0;
		double nota1 = 0;
		double nota2 = 0;
		double nota3 = 0;
		int escolha = 0;
		double media =0;
		do {
			escolha = Integer.parseInt(JOptionPane.showInputDialog(null, "Escolha qual m�dia voc� deseja ver:"
					+ "\nDigite (1) para aritmetica" 
					+ "\nDigite (2) para ponderada"));
		} while (escolha != 1 && escolha != 2);
		
		do {
			nota1 = Double
					.parseDouble(JOptionPane.showInputDialog("informe a nota 1"));
		} while (nota1 > 10 || nota1 < 0);
		do {
			nota2 = Double.parseDouble(JOptionPane.showInputDialog("informe a nota 2"));
		} while (nota2 > 10 || nota2 < 0);
		do {
			nota3 = Double.parseDouble(JOptionPane.showInputDialog("informe a nota 3"));
		} while (nota3 > 10 || nota3 < 0);
		
		switch (escolha) {

		case 1:
			double mediaAritmetica = calculaAritmetica(nota1, nota2, nota3);
			media = mediaAritmetica;
			mostrarResultado(media); 
			break;

		case 2:
			do {
				peso1 = Double.parseDouble(JOptionPane.showInputDialog("informe o PESO da nota 1"));
			} while (peso1 > 10 || peso1 < 0);
			do {
				peso2 = Double.parseDouble(JOptionPane.showInputDialog("informe o PESO da nota 2"));
			} while (peso2 > 10 || peso2 < 0);
			do {
				peso3 = Double.parseDouble(JOptionPane.showInputDialog("informe o PESO nota 3"));
			} while (peso3 > 10 || peso3 < 0);

			double mediaPonderada = calculaMediaPonderada(nota1, nota2, nota3, peso1, peso2, peso3);
			media =0;
			media = mediaPonderada;
			mostrarResultado(media);
			break;
		}

	}

	public static double calculaMediaPonderada(double nota1, double nota2, double nota3, double peso1, double peso2, double peso3) {
		double mediaPonderada = (((nota1 * peso1) + (nota2 * peso2) + (nota3 * peso3)) / (peso1 + peso2 + peso3));

		return mediaPonderada;

	}

	public static double calculaAritmetica(double nota1, double nota2, double nota3) {
		double mediaAritmetica = ((nota1 + nota2 + nota3) / 3);

		return mediaAritmetica;

	}
	
	public static void mostrarResultado(double media) {
		DecimalFormat df = new DecimalFormat("0.00");
		if (media >= 7) {
		JOptionPane.showMessageDialog(null, "A m�dia final foi de: "+ df.format(media)+ " e o aluno est� aprovado");
		}else {
			JOptionPane.showMessageDialog(null, "A m�dia final foi de: "+ df.format(media)+ " e o aluno est� reprovado");
		}
	}
	
	

}
