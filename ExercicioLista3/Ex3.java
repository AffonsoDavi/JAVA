

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

//Faça um programa que a partir do valor de uma compra, faça o cálculo de um desconto para o usuário. 
//O programa deve solicitar o valor total da compra por meio de um método, que deverá retorná-lo. 
//Um método deve ser criado para receber o valor da compra e mostrar o valor final com desconto, considerando:
//Até R$100 - sem desconto, o valor permanece o mesmo
//De R$100,01 a R$200 - desconto de 20%
//Acima de R$200 - desconto de 30%

public class Ex3 {

	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "O programa recebe o valor de uma compra e então"
				+ "\ncalcula um determinado desconto, dependendo do valor da compra");
		double preco = 0;
		
		preco = Double.parseDouble(JOptionPane.showInputDialog(null, "Qual o valor da compra?"));

		if (preco <= 100) {

			mostraMensagem(preco, preco);
		} else if (preco >= 100.01 && preco <= 200) {

			double desconto = calculaDescontoDe100(preco);
			mostraMensagem(desconto, preco);

		} else if (preco > 200){
			double desconto = calculaDescontoDe200(preco);
			mostraMensagem(desconto, preco);
		}
	}

	public static double calculaDescontoDe100(double preco) {
		double desconto = (preco - (preco / 100) * 20);
		return desconto;
	}

	public static double calculaDescontoDe200(double preco) {
		double desconto = (preco - (preco / 100) * 30);
		return desconto;
	}

	public static void mostraMensagem(double valorFinal, double preco) {
		DecimalFormat df = new DecimalFormat("0.00");
		if (preco <= 100) {
			JOptionPane.showMessageDialog(null, "O preço final continua o mesmo valor de: "+ preco);
			}else if (preco >= 100.01 && preco <= 200) {
				JOptionPane.showMessageDialog(null, "O preço final ficou com 20% de desconto,"
						+"\nficando no valor de: " +df.format(valorFinal));
			}else if (preco > 201){
				JOptionPane.showMessageDialog(null, "O preço final ficou com 30% de desconto,"
						+ "\nficando no valor de: "+df.format(valorFinal));
			}
		
	}
}