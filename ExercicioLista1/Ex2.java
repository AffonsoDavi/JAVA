import javax.swing.JOptionPane;

//Desenvolva um programa que pergunte qual � a maioridade civil do seu �estado/pa�s�
//e que posteriormente o usu�rio informe sua idade. Como resultado, 
//o programa deve informar se ele � ou n�o maior de idade.

public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int maiorIdade=0;
		int idade=0;
		
		JOptionPane.showMessageDialog(null, "Este programa pede a maioridade do seu estado/pa�s e informa ao usu�rio se o mesmo � maior de idade");

		maiorIdade = Integer.parseInt(JOptionPane.showInputDialog("Informe qual a maioridade do seu estado/pa�s"));
		idade = Integer.parseInt(JOptionPane.showInputDialog("Informe a sua idade, para verificar se voc� � ou nao maior de idade"));
		
		if (idade >= maiorIdade) {
			JOptionPane.showMessageDialog(null, "O usu�rio que informou sua idade, � maior de idade");
		}else{
			JOptionPane.showMessageDialog(null, "O usu�rio que informou sua idade, � menor de idade");
		}
	}
}
