import javax.swing.JOptionPane;

//Desenvolva um programa que pergunte qual é a maioridade civil do seu “estado/país”
//e que posteriormente o usuário informe sua idade. Como resultado, 
//o programa deve informar se ele é ou não maior de idade.

public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int maiorIdade=0;
		int idade=0;
		
		JOptionPane.showMessageDialog(null, "Este programa pede a maioridade do seu estado/país e informa ao usuário se o mesmo é maior de idade");

		maiorIdade = Integer.parseInt(JOptionPane.showInputDialog("Informe qual a maioridade do seu estado/país"));
		idade = Integer.parseInt(JOptionPane.showInputDialog("Informe a sua idade, para verificar se você é ou nao maior de idade"));
		
		if (idade >= maiorIdade) {
			JOptionPane.showMessageDialog(null, "O usuário que informou sua idade, é maior de idade");
		}else{
			JOptionPane.showMessageDialog(null, "O usuário que informou sua idade, é menor de idade");
		}
	}
}
