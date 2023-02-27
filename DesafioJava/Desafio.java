import java.util.Random;

import javax.swing.JOptionPane;

public class Desafio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String texto = "";
		texto = "_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-##BATALHA NAVAL##_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_"
				+ "\n!!!O JOGO FUNCIONA DA SEGUINTE FORMA:" + "\n"
				+ "\nO COMPUTADOR VAI GERAR 2 NAVIOS DE TAMANHOS DIFERENTES."
				+ "\n*UM DO TAMANHO DE 2 CASAS E O OUTRO NO TAMANHO DE 3 CASAS.\")"
				+ "\n*VOCE TERA 15 CHANCES PARA ACERTAS E DESRTRUIR OS 2 NAVIOS"
				+ "\n*NOTA - QUANDO ERRAR APARECERÁ '-'\""
				+ "\n      - SE ACERTAR O NAVIO DE 3 CASAS APARECERÁ UMA DAS LETRAS DA PALAVRA 'BUM'"
				+ "\n      - SE ACERTAR O NAVIO DE 2 CASAS APARECERÁ UM 'X'\""
				+ "\n      - VOCÊ VENCE ACERTANDO TODOS AS CASAS EM QUE OS NAVIOS ESTÃO"
				+ "\n      - SE PASSAR DE 15 JOGADAS VOCÊ PERDE" + "\n      - NA LINHA ESCOLHA UM NUMERO DE 1 A 5"
				+ "\n      - NA COLUNA ESCOLHA UM NUMERO DE 1 A 5" + "\n"
				+ "\n_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-##BATALHA NAVAL##_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_";

		JOptionPane.showMessageDialog(null, texto);

		String[][] criar = criarJogo();

		String[][] jogo = pegarJogo(criar);
		String tabela = mostrar(jogo);
		JOptionPane.showMessageDialog(null, tabela);

		int linha = pedirLinha();
		int coluna = pedirColuna();
		String[][] jogoAtualizado = mostrarJogoAtualizado(linha, coluna, criar);
		int vitoria = validarVitoria(criar, linha, coluna);
		tabela = mostrar(jogoAtualizado);
		JOptionPane.showMessageDialog(null, tabela);

	}

	public static String[][] criarJogo() {
		String[][] criar = new String[6][6];
		Random random = new Random();

		for (int i = 1; i < 6; i++) {
			for (int c = 1; c < 6; c++) {
				criar[i][c] = "|   |       ";
			}
		}

		int n = random.nextInt(4) + 1;
		int m = random.nextInt(5) + 1;

		criar[n][m] = "1         ";
		if (n >= 1 && n <= 3) {
			n = n + 1;
			criar[n][m] = "2         ";
			n = n + 1;
			criar[n][m] = "3         ";
		} else {
			n = n - 1;
			criar[n][m] = "2         ";
			n = n - 1;
			criar[n][m] = "3         ";
		}

		return criar;
	}

	public static String[][] pegarJogo(String[][] criar) {
		String[][] jogo = new String[6][6];
		for (int i = 1; i < 6; i++) {
			for (int c = 1; c < 6; c++) {
				if (criar[i][c].equals("1         ") || criar[i][c].equals("2         ")
						|| criar[i][c].equals("3         ")) {
					jogo[i][c] = "|   |       ";
				}

				else {
					jogo[i][c] = "|   |       ";
				}
			}
		}
		return jogo;
	}

	public static int validarVitoria(String[][] criar, int linha, int coluna) {
		int vitoria = 0;
		if (criar[linha][coluna].equals("1         ") || criar[linha][coluna].equals("2         ")
				|| criar[linha][coluna].equals("3         ")) {
			vitoria = vitoria + 1;
		}
		return vitoria;
	}

	public static int pedirLinha() {
		int linha = 0;
		linha = Integer.parseInt(JOptionPane.showInputDialog("Digite em qual linha você deseja jogar"));
		return linha;
	}

	public static int pedirColuna() {
		int coluna = 0;
		coluna = Integer.parseInt(JOptionPane.showInputDialog("Digite em qual coluna você deseja jogar"));
		return coluna;
	}

	public static String mostrar(String[][] jogoAtualizado) {

		String tabela = "";
		for (int i = 1; i < 6; i++) {
			for (int c = 1; c < 6; c++) {
				tabela += jogoAtualizado[i][c];

			}
			tabela += "\n";
		}

		return tabela;
	}

	public static String[][] mostrarJogoAtualizado(int linha, int coluna, String[][] jogoAtualizado) {
		for (int i = 0; i < 6; i++) {
			for (int c = 0; c < 6; c++) {

			}
		}
		return jogoAtualizado;
	}
}
