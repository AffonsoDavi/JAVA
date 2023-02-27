import java.text.DecimalFormat;

import javax.swing.JOptionPane;

//Fa�a um programa que solicite alguns dados dos usu�rios que frequentam um clube. 
//O programa deve solicitar a idade, se a pessoa � fumante ou n�o (1- SIM, 2- N�O), 
//seu sal�rio l�quido e h� quanto tempo frequenta o clube (em meses). 
//O usu�rio dever� digitar �encerrar� quando n�o tiver mais pessoas para registrar. 
//Como dados de sa�da, o programa deve exibir:
//A m�dia das idades das pessoas;
//A m�dia salarial das pessoas;
//Quantos s�o fumantes e quantos n�o s�o fumantes;
//A porcentagem de pessoas que frequentam o clube h� mais de 03 meses. 

public class Ex5 {

	public static void main(String[] args) {

		JOptionPane.showMessageDialog(null,
				"O programa consiste em pedir alguns dados de pessoas que frequentam um clube" + "\ne ao final mostre:"
						+ "\n* A m�dia das idades;" + "\n* A m�dia salarial;" + "\n* Quantos fumantes e quantos n�o;"
						+ "\n* A porcentagem de pessoas q v�o no clube a mais de 3 meses");

		int idade = 0;
		int fumante = 0;
		int salarioLiquido = 0;
		int tempoMeses = 0;
		String fim = "";
		int mediaIdades = 0;
		int mediaSalarial = 0;
		int fumam = 0;
		int naoFumam = 0;
		int frequentadores = 0;
		int porcentagem = 0;
		int pessoas = 1;
		DecimalFormat df = new DecimalFormat("0.00");

		// ciclo para fazer o registrto de pessoas ate n ter mais ngm
		do {

			// pede a idade de cada membro do cluble
			idade = Integer.parseInt(JOptionPane.showInputDialog("informe a idade da " + pessoas + "� pessoa"));

			mediaIdades = mediaIdades + idade;
			mediaIdades = mediaIdades / pessoas;
			// ciclo para nao deixar o usuario digitar errado e pede se a pessoa fuma ou nao
			do {
				fumante = Integer.parseInt(JOptionPane.showInputDialog(
						"Informe se a " + pessoas + "� pessoa � fumante, digite (1) para sim e (2) para n�o"));
				// calculo de quantos fumam e quantos nao
				if (fumante == 1) {
					fumam = fumam + 1;
				} else {
					naoFumam = naoFumam + 1;
				}

			} while ((fumante != 1) && (fumante != 2));
			// pede o salario de cada membro do clube
			salarioLiquido = Integer
					.parseInt(JOptionPane.showInputDialog("informe o sal�rio l�quido da " + pessoas + "� pessoa"));
			// calcula a media salarial
			mediaSalarial = mediaSalarial + salarioLiquido;
			mediaSalarial = mediaSalarial / pessoas;
			// pede o tempo q cada um frequenta o clube e ja calcula a porcentagem de
			// quantos estao a mais de 3 meses
			tempoMeses = Integer.parseInt(
					JOptionPane.showInputDialog("informe quantos meses a " + pessoas + "� pessoa frequnta o clube"));

			if (tempoMeses >= 3) {
				frequentadores = frequentadores + 1;
			}
			porcentagem = frequentadores * 100 / pessoas;

			// verifica se tem mais algum membro para registrar
			fim = JOptionPane.showInputDialog("Caso n�o houver mais pessoas para cadastrar, digite encerrar");
			pessoas = pessoas + 1;
		} while (fim.equalsIgnoreCase("encerrar") == false); // encerra o ciclo se nao houver mais membros para
																// registrar

		// informa a media de idades
		JOptionPane.showMessageDialog(null, "A media das idades de todos os membros do clube � de: " + df.format(mediaIdades));

		// inforam a media salarial
		JOptionPane.showMessageDialog(null, "A media salarial de todos os membros do clube � de : " + df.format(mediaSalarial));

		// informa quantos fumam e quantos n�o fumam
		JOptionPane.showMessageDialog(null, "A quantidade de pessoas fumantes que frequentam o clube � de:" + "\n"
				+ fumam + "\nA quantidade de pessoas que n�o fumam � de: " + "\n" + naoFumam);
		// informa a porcetagem de pessoas q frequentam o clube a mais de 3 meses
		JOptionPane.showMessageDialog(null, porcentagem + "%");
	}
}
