import java.text.DecimalFormat;

import javax.swing.JOptionPane;

//Sabe-se que o lat�o � constitu�do de 70% de cobre e 30% de zinco. 
//Fa�a um programa que permita ao usu�rio informar uma quantidade de 
//lat�o em quilos e forne�a o total de cobre e zinco necess�rios para fabricar essa quantidade.
public class Ex4 {

	public static void main(String[] args) {

		JOptionPane.showMessageDialog(null,"O programa calcula quanto de zinco e quanto de cobre se utiliza para fazer um barril,"
				+ "\ncom base em quantos kg tem o barril no total");
		double cobre;
		double zinco;
		double quilos;
		DecimalFormat df = new DecimalFormat("0.00");
		
		//String decZinco="";
	//	String decCobre="";
		
		quilos = Double.parseDouble(JOptionPane.showInputDialog("informe quantos kg o lat�o tem:"));
		cobre = quilos  * 0.70;
		//decCobre = new DecimalFormat("#,##0.00").format(cobre);
		zinco = quilos  * 0.30;
	//	decZinco = new DecimalFormat("#,##0.00").format(zinco);
		JOptionPane.showMessageDialog(null, "A quantidade de cobre necessaria � de: " + df.format(cobre) + "kg"
				+ "\nE a quantidade de zinco necessaria � de: " + df.format(zinco) + "kg");
		
	}

}
