//Fa�a um programa que solicite o ano de nascimento de um usu�rio e seja mostrada a sua idade em 2021. 
//N�o � necess�rio considerar se o usu�rio j� fez ou n�o anivers�rio. 
//Um m�todo deve ser criado para solicitar o ano de nascimento ao usu�rio e retorn�-lo, 
//e outro m�todo deve ser criado para receber o ano de nascimento, calcular a idade atual e mostr�-la.

import javax.swing.JOptionPane;

public class Ex1 {
	

	public static void main(String[] args) {
		
		JOptionPane.showMessageDialog(null, "O programa consiste em perguntar ao usuario qual o seu ano de "
				+ "nascimento e ap�s informa qual a idade dele at� o ano de 2021");
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
	 JOptionPane.showMessageDialog(null, "sua idade atual � de: "+ idade+" anos");
	
 }
}
