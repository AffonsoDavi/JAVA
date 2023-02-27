import javax.swing.JOptionPane;
//Faça um programa que carregue os valores das vendas de uma loja no primeiro semestre do ano. 
//Considere para tal uma matriz [6,4], sendo que são 06 meses e 04 semanas por mês. 
//Ao final, mostre na tela: 
//● Total de vendas do semestre
//● Total vendido em cada mês

public class Ex8 {

	public static void main(String[] args) {

		JOptionPane.showMessageDialog(null, "Este programa serve para lançar as vendas de uma loja,"
				+ "\nno primeiro semestre do ano e mostra no final o:"
				+ "\n*total vendido do semestre"
				+ "\n*total vendido em cada mês");
		double totalSemestre = 0;
		double[] totalMes = new double[6];
		double[][] valores = new double[6][4];

		for (int l = 0; l < 6; l++) {
			for (int c = 0; c < 4; c++) {

				valores[l][c] = Double.parseDouble(JOptionPane.showInputDialog(
						"Qual o valor das vendas no " + (l + 1) + "º mês, " + "na " + (c + 1) + "º semana?"));
				
				totalMes[l] = totalMes[l] + valores[l][c];
			}
			totalSemestre = totalSemestre + totalMes[l];
		}
		
		for (int l = 0; l < 6; l++) {
			JOptionPane.showMessageDialog(null, totalMes[l], "O total de vendas do " + (l + 1) + "º mês é de: ",
					JOptionPane.INFORMATION_MESSAGE);
		}
		JOptionPane.showMessageDialog(null, totalSemestre, "O valor total de vendas do semestre é de: ",
				JOptionPane.INFORMATION_MESSAGE);
	}
}
