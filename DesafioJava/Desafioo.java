import java.util.Random;

import javax.swing.JOptionPane;

public class Desafioo {

	public static void main(String[] args) {

		/// EXPLICA O PROGRAMA
		mostrarExplicacao();

		//// STRING Q INICIA O JOGO
		String[][] navios = new String[6][6];
		/// METODO PEGA A VARIAVEL 'NAVIOS' COMO PARAMETRO E ADICIONA O LOCAL DOS NAVIOS
		colocarNavios(navios);

		/// STRING ONDE VAI SER MOSTRADO O JOGO
		String[][] jogo = new String[6][6];
		jogo = tabuleiroJogo();

		int vitoria = 0;
		int linha = 0;
		int coluna = 0;
		int jogadas = 15;
		while ((jogadas != 0) && (vitoria != 4)) { // ACABA O LOOP QUANDO ACERTAR OS NAVIOS OU ACABAR AS JOGADA POR
												// COMPLETO
			// MOSTRA QUANTAS JOGADAS AINDA RESTAM
			mostrarJogadas(jogadas);
			jogadas = jogadas - 1;	
			
			mostrarJogo(jogo); // STRING PARA MOSTRAR O JOGO ATUIALIZADO CONFORME O JOGADO

			do { /// LOOP PARA VERIFICAR A SE A LINHA E A COLUNA JA FORAM JOGADOS
				linha = pedirLinha(); // METODO PARA PEDIR A LINHA
				coluna = pedirColuna(); // METODO PARA PEDIR A COLUNA
			} while ((jogo[linha][coluna].equals("| X |    ")) || (jogo[linha][coluna].equals("| - |       ")));

			// VERIFICA SE A LINHA E A COLUNA QUE FOR ESCOLHIDA, FOR CONFORME ONDE ESTA OS
			// NAVIOS
			if ((navios[linha][coluna].equals("1")) || (navios[linha][coluna].equals("2"))
					|| (navios[linha][coluna].equals("3")) || (navios[linha][coluna].equals("4"))) {
				/// ADICIONA UM 'X' EM CASO DE ACERTO DO NAVIO
				jogo[linha][coluna] = "| X |    ";
				vitoria = vitoria + 1;

			} else {
				/// ADICIONA UM '-' EM CASO DE ERRO
				jogo[linha][coluna] = "| - |       ";
			}

		}

		mostrarFinal(vitoria, jogadas, jogo);

	}

	public static void mostrarJogadas(int jogadas) {
		if (jogadas < 15) {
			JOptionPane.showMessageDialog(null, "Restam somente: " + jogadas + " jogadas");
			
		}
	}

	public static void mostrarFinal(int vitoria, int jogadas, String[][] jogo) {
		if (vitoria == 4) { //// SE O JOGADOR ESTIVER ACERTADO MOSTRA NA TELA Q VENCEU
			JOptionPane.showMessageDialog(null, "você venceu!! Restando somente: " + jogadas + " jogadas");
		} else { /// SE O JOGADOR NAO CONSEGUIR ACERTAR OS NAVIOS TODOS, MOSTRA Q ELE PERDEU
			JOptionPane.showMessageDialog(null, "você perdeu! Acabou suas jogadas!");
		}
		/// MOSTRA O RESULTADO FINAL DO CODIGO
		JOptionPane.showMessageDialog(null, "Para ver como o tabuleiro do jogo finalizou aperte ENTER");
		mostrarJogo(jogo);
	}

	public static String[][] tabuleiroJogo() {
		/// LOOP PARA MUDAR AS CASAS ONDE SE ENCONTRA OS NAVIOS E ENTAO 'CAMUFLA-LOS'
		String[][] jogo = new String[6][6];
		for (int i = 1; i < 6; i++) {
			for (int c = 1; c < 6; c++) {
				jogo[i][c] = "|   |       ";

				jogo[1][0] = "L1  ";
				jogo[2][0] = "L2  ";
				jogo[3][0] = "L3  ";
				jogo[4][0] = "L4  ";
				jogo[5][0] = "L5  ";
			}
		}
		return jogo;
	}

	public static void mostrarExplicacao() {
		String texto = "";
		texto = "_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-##BATALHA NAVAL##_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_"
				+ "\n!!!O JOGO FUNCIONA DA SEGUINTE FORMA:" + "\n"
				+ "\nO COMPUTADOR VAI GERAR 2 NAVIOS COM O TAMANHO DE DUAS CASAS."
				+ "\n*VOCE TERA 15 CHANCES PARA ACERTAS E DESRTRUIR OS 2 NAVIOS"
				+ "\n*NOTA - QUANDO ERRAR APARECERÁ | - |" + "\n      - QUANDO ACERTAR UM DOS NAVIOS APARECERA UM | x |"
				+ "\n      - VOCÊ VENCE ACERTANDO TODOS AS CASAS EM QUE OS NAVIOS ESTÃO"
				+ "\n      - SE PASSAR DE 15 JOGADAS VOCÊ PERDE" + "\n      - NA LINHA ESCOLHA UM NUMERO DE 1 A 5"
				+ "\n      - NA COLUNA ESCOLHA UM NUMERO DE 1 A 5" + "\n"
				+ "\n_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-##BATALHA NAVAL##_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_";
		JOptionPane.showMessageDialog(null, texto);

	}

	public static void colocarNavios(String[][] navios) {
		// LOOP PARA CRIAR O JOGO
		for (int i = 1; i < 6; i++) {
			for (int c = 1; c < 6; c++) {
				navios[i][c] = " ";
			}
		}
		/// AQUI GERA ALEATORIO OS LUGARES DA MATRIZ PARA POSICIONAR O 1º NAVIO
		Random random = new Random();
		int x = 3;
		int y = random.nextInt(4) + 1;

		navios[x][y] = "1";
		x = x + 1;
		navios[x][y] = "2";

		/// AQUI GERA ALEATORIO OS LUGARES DA MATRIZ PARA POSICIONAR O 2º NAVIO SEM
		/// OCUPAR O LUGAR DO 1º NAVIO
		int n = 2;
		int m = random.nextInt(5) + 1;
		navios[n][m] = "3";
		m = m + 1;
		navios[n][m] = "4";
	}

	public static void mostrarJogo(String[][] mostrar) {
////MOSTRA O JOGO CONFORME A MATRIZ ESCOLHIDA0
		String tabela = "       C1       C2       C3       C4       C5" + "\n";
		for (int i = 1; i < 6; i++) {
			for (int c = 0; c < 6; c++) {
				tabela += mostrar[i][c];

			}
			tabela += "\n";
		}
		JOptionPane.showMessageDialog(null, tabela);

	}

////PEDE  A LINHA QUE O JOGADOR QUER JOGAR
	public static int pedirLinha() {
		int linha = 0;
		do { /// VALIDA SE ESTA ENTRE 1 E 5
			linha = Integer.parseInt(JOptionPane.showInputDialog("Digite em qual linha você deseja jogar"));
		} while (linha < 1 || linha > 5);
		return linha;
	}

////PEDE  A LINHA QUE O JOGADOR QUER JOGAR
	public static int pedirColuna() {
		int coluna = 0;
		do {/// VALIDA SE ESTA ENTRE 1 E 5
			coluna = Integer.parseInt(JOptionPane.showInputDialog("Digite em qual coluna você deseja jogar"));
		} while (coluna < 1 || coluna > 5);
		return coluna;
	}
}