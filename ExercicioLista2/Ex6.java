import javax.swing.JOptionPane;
import java.text.DecimalFormat;
//Uma empresa deseja saber alguns dados sobre suas vendas no passado. 
//Faça um programa que armazene em um vetor o valor total das vendas de cada um dos 12 meses do ano 
//(que deverá ser informado pelo usuário) e mostre:
//O mês com a maior venda;
//O mês com a menor venda;
//A média das vendas do ano todo;
//A média das vendas dos meses pares;
//A média das vendas do 2º semestre.

public class Ex6 {

	public static void main(String[] args) {

		JOptionPane.showMessageDialog(null,
				"O programa consiste em pedir o valor total das vendas de cada mês do ano de uma empresa."
						+ "\nE em seguinda informar:" + "\n*O mês com a maior venda;" + "\n*O mês com a menor venda;"
						+ "\n*A média das vendas do ano todo;" + "\n*A média das vendas dos meses pares;"
						+ "\n*A média das vendas do 2º semestre.");

		double[] meses = new double[12];
		int maior = 0;
		int menor = 0;
		double totalAno = 0;
		double mediaVendasAno = 0;
		String decMediaVendasAno = "";
		double mediaMesesPares = 0;
		String decMediaMesesPares = "";
		double totalPares = 0;
		double mediaSegundoSemestre = 0;
		String decMediaSegundoSemestre = "";
		double totalSegSemestre = 0;

		for (int i = 0; i < 12; i++) {
			meses[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe o rendimento do " + (i + 1) + "º mes:"));
			// verifica qual o mes q teve maior lucro
			if (meses[i] > meses[maior]) {
				maior = i;
			}
			// verifica qual o mes teve o menor lucro
			if (meses[i] < meses[menor]) {
				menor = i;
			}
			// calcula a media vendida durante todo o ano
			totalAno = totalAno + meses[i];
			mediaVendasAno = totalAno / 12;
			decMediaVendasAno = new DecimalFormat("#,##0.00").format(mediaVendasAno);

			// calcula a media vendida somente dos meses pares
			if (i % 2 == 0) {
				totalPares = totalPares + meses[i];
				mediaMesesPares = totalPares / 6;
				decMediaMesesPares = new DecimalFormat("#,##0.00").format(mediaMesesPares);
			}
		}

		for (int i = 6; i < 12; i++) {
			totalSegSemestre = totalSegSemestre + meses[i];
			mediaSegundoSemestre = totalSegSemestre / 6;
			decMediaSegundoSemestre = new DecimalFormat("#,##0.00").format(mediaSegundoSemestre);
		}
		// informa qual foi o mes com maior lucro
		JOptionPane.showMessageDialog(null, "O mês com a maior venda foi o: " + "\n" + (maior + 1) + "º mês");
		// informa qual o mes com o menor lucro
		JOptionPane.showMessageDialog(null, "O mês com a menor venda foi o: " + "\n" + (menor + 1) + "º mês");
		// informa qual a media vendida no ano todo
		JOptionPane.showMessageDialog(null, "A média de vendas do ano todo foi de: " + "\n" + decMediaVendasAno);
		// informa a media dos meses pares
		JOptionPane.showMessageDialog(null,
				"A média de vendas de todos os meses pares foi de: " + "\n" + decMediaMesesPares);
		// informa a media vendida no 2º semestre
		JOptionPane.showMessageDialog(null,
				"A média de vendas do segundo semestre foi de: " + "\n" + decMediaSegundoSemestre);
	}
}
