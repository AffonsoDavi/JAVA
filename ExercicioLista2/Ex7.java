import java.text.DecimalFormat;

import javax.swing.JOptionPane;

//Um estudante do ensino médio gostaria de controlar melhor suas notas nas disciplinas exatas. 
//Ele gostaria de poder enxergar suas notas dos 4 bimestres com exatamente duas casas decimais 
//e em formato de matriz, como no exemplo a seguir:
//Além disso, o estudante gostaria de poder escolher algumas opções de visualização de acordo com o menu abaixo:
//Todas as notas de todas as disciplinas;
//Qual a maior nota e em qual disciplina foi;
//A média das notas de alguma disciplina (solicitar qual);
//As notas de um dos bimestres (solicitar qual);
//Encerrar.
//Faça um programa que permita cadastrar as notas de acordo com o exemplo 
//(considerando a ordem das disciplinas) e forneça os dados supracitados. 
//O menu deve ser exibido repetitivamente, até que o usuário deseje encerrar o programa.

public class Ex7 {

	public static void main(String[] args) {

		JOptionPane.showMessageDialog(null,
				"O programa serve para controlar as notas de cada bimestre de um aluno, das disciplinas de: matematica, fisica e quimica"
						+ "\nE em seguida da as opções para o usuário de:"
						+ "\n*Ver Todas as notas de todas as disciplinas;"
						+ "\n*Ver Qual a maior nota e em qual disciplina foi;"
						+ "\n*Ver A média das notas de alguma disciplina" + "\n*Ver As notas de um dos bimestres");

		double[][] notas = new double[4][3];
		String[] materia = new String[3];
		double maior = 0;
		String mat = "";
		int opcao = 0;
		double mediaNotas = 0;
		DecimalFormat df = new DecimalFormat("0.00");
		
		materia[0] = "Matematica";
		materia[1] = "Física";
		materia[2] = "Química";
		// MATRIZ PARA INFORMAR AS NOTAS DO ALUNO
		for (int l = 0; l < 4; l++) {
			for (int c = 0; c < 3; c++) {
				do { // laço para pedir somente uma nota entre 0 e 10
					notas[l][c] = Double.parseDouble(JOptionPane.showInputDialog(
							"Informe a nota do " + (l + 1) + "º bimestre, na materia de: " + materia[c]));
				} while ((notas[l][c] < 0) || (notas[l][c] > 10));

				// verifica qual a maior nota e EM QUAL materia
				if (maior < notas[l][c]) {
					maior = notas[l][c];
					mat = materia[c];
				}
			}
		}
		String materias = "Matematica   Física   Química" + "\n";
		do { // LAÇO PARA REPETIR A OPCAO PARA O USUARIO
			opcao = Integer.parseInt(JOptionPane.showInputDialog("Qual das opções abaixo você deseja ver?"
					+ "\n(1) Todas as notas de todas as disciplinas;"
					+ "\n(2) Qual a maior nota e em qual disciplina foi;" 
					+ "\n(3) A média de uma determinada matéria;"
					+ "\n(4) As notas de um bimestre;" + "\n(5) Encerrar."));

			switch (opcao) {
			// OPCAO 1 MOSTRA TODAS AS NOTAS EM CADA MATERIA
			case 1:
				String resultado = "";

				for (int l = 0; l < 4; l++) {
					for (int c = 0; c < 3; c++) {

						resultado += "      " + notas[l][c];
						resultado += "         ";
					}
					resultado += "\n";
				}
				JOptionPane.showMessageDialog(null, materias + resultado);
				break;
			// OPCAO DOIS MOSTRA A MAIOR NOTA EM QUAL MATERIA FOI
			case 2:
				JOptionPane.showMessageDialog(null, "A maior nota foi: " + maior + ", na matéria de: " + mat);
				break;
			// OPCAO 3 MOSTRA SOMENTE AS NOTAS DOS BIMESTRES DE UMA RESPECTIVA MATERIA
			case 3:
				String opcao2 = "";
				// ESCOLHE A MATERIA PARA VER A MÉDIA
				opcao2 = JOptionPane.showInputDialog("Qual matéria você deseja ver sua média? " 
				+ "\n(matematica, fisica ou quimica?");
				switch (opcao2) {
				case "matematica":
					mediaNotas = (notas[0][0] + notas[1][0] + notas[2][0] + notas[3][0]) / 4;
					JOptionPane.showMessageDialog(null, "As notas de matemática são: " + df.format(mediaNotas));
					break;
				case "fisica":
					mediaNotas = (notas[0][1] + notas[1][1] + notas[2][1] + notas[3][1]) / 4;
					JOptionPane.showMessageDialog(null, "As notas de fisica são: " + df.format(mediaNotas));
					break;
				case "quimica":
					mediaNotas = (notas[0][2] + notas[1][2] + notas[2][2] + notas[3][2]) / 4;
					JOptionPane.showMessageDialog(null, "As notas de quimica são: " + df.format(mediaNotas));
					break;
				default:
					JOptionPane.showMessageDialog(null, "opcão inválida");
					break;
				}
				break;
			// OPCAO 4 MOSTRA AS NOTAS DE UM BIMESTRE EM ESPECIFICO
			case 4:
				int opcao3 = 0;
				do {
					opcao3 = Integer.parseInt(JOptionPane
							.showInputDialog("Qual bimestre você quer ver suas notas? " + "\n(1, 2, 3 ou 4?"));
				} while (opcao3 < 1 || opcao3 > 3);
				String resultados = "";
				for (int l = opcao3 - 1; l < opcao3; l++) {
					for (int c = 0; c < 3; c++) {
						resultados += "      " + notas[l][c];
						resultados += "         ";
					}
					resultados += "\n";
				}
				// ESCOLHE O BIMESTRE Q O ALUNO DESEJA VER SUAS NOTAS
				switch (opcao3) {
				// BIMESTRE 1
				case 1:
					JOptionPane.showMessageDialog(null, materias + resultados);
					break;
				// BIMESTRE 2
				case 2:
					JOptionPane.showMessageDialog(null, materias + resultados);
					break;
				// BIMESTRE 3
				case 3:
					JOptionPane.showMessageDialog(null, materias + resultados);
					break;
				case 4:
					JOptionPane.showMessageDialog(null, materias + resultados);
					break;
				}
				break;

			// OPCAO 5 ENCERRA O PROGRAMA
			case 5:
				System.exit(0);
				break;
			default:
				JOptionPane.showMessageDialog(null, "opcão inválida");
				break;
			}
		} while (opcao != 5); // O LAÇO PARA AO DIGITAR 5 :D
	}

}
