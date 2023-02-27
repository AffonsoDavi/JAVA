//Faça um programa que solicite o ano de nascimento de um usuário e seja mostrada a sua idade em 2021. 
//Não é necessário considerar se o usuário já fez ou não aniversário. 
//Um método deve ser criado para solicitar o ano de nascimento ao usuário e retorná-lo, 
//e outro método deve ser criado para receber o ano de nascimento, calcular a idade atual e mostrá-la.

import javax.swing.JOptionPane;

public class Ex1 {
	

	public static void main(String[] args) {
		
		JOptionPane.showMessageDialog(null, "O programa consiste em perguntar ao usuario qual o seu ano de "
				+ "nascimento e após informa qual a idade dele até o ano de 2021");
     int ano = solicitarAno();
     calculaIdade(ano);
     
	}
 public static int solicitarAno() {
	int ano= Integer.parseInt(
				JOptionPane.showInputDialog("Informe seu ano de nascimento"));
	return ano;
	
 }
 
 public static void calculaIdade(int ano) {
	int  idade = 2021- ano;
	 JOptionPane.showMessageDialog(null, "sua idade atual é de: "+ idade+" anos");
	
 }
}
