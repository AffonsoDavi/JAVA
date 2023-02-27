
import java.text.DecimalFormat;

import javax.swing.JOptionPane;

//Fa�a um programa que a partir do valor de uma compra, fa�a o c�lculo de um desconto para o usu�rio. 
//O programa deve solicitar o valor total da compra por meio de um m�todo, que dever� retorn�-lo. 
//Um m�todo deve ser criado para receber o valor da compra e mostrar o valor final com desconto, considerando:
//At� R$100 - sem desconto, o valor permanece o mesmo
//De R$100,01 a R$200 - desconto de 20%
//Acima de R$200 - desconto de 30%

public class Ex3Modo2 {

	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "O programa recebe o valor de uma compra e ent�o"
				+ "\ncalcula um determinado desconto, dependendo do valor da compra");
		double preco = 0;
		int porcentagem = 0;
		
		preco = Double.parseDouble(JOptionPane.showInputDialog(null, "Qual o valor da compra?"));
		
		double desconto = calculaDesconto(preco, porcentagem);
		
		mostraMensagem(desconto, preco);

	}

	public static double calculaDesconto(double preco, int porcentagem) {
		if (preco >= 100.01 && preco <= 200) {
			porcentagem = 20;
		} else if (preco > 200) {
			porcentagem = 30;
		}
		double desconto = (preco - (preco / 100) * porcentagem);
		return desconto;
	}

	public static void mostraMensagem(double valorFinal, double preco) {
		DecimalFormat df = new DecimalFormat("0.00");
		if (preco <= 100) {
			JOptionPane.showMessageDialog(null, "O pre�o final continua o mesmo valor de: " + preco);
		} else if (preco > 100.01 && preco <= 200) {
			JOptionPane.showMessageDialog(null,
					"O pre�o final ficou com 20% de desconto," + "\nficando no valor de: " + df.format(valorFinal));
		} else if (preco > 200) {
			JOptionPane.showMessageDialog(null,
					"O pre�o final ficou com 30% de desconto," + "\nficando no valor de: " + df.format(valorFinal));
		}

	}
}