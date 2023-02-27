import javax.swing.JOptionPane;

//Crie uma calculadora que permita o c�lculo de uma equa��o, sem limite de execu��es definido, da seguinte maneira:
//1. Pe�a o primeiro valor ,
//2. Pe�a o c�lculo que deseja fazer (entre as 4 opera��es b�sicas),
//3. Pe�a um segundo valor 
//4. Efetue o c�lculo,
//5. Pe�a se o usu�rio quer continuar calculando. Se ele responder que sim, 
//volte para o passo 2 usando o resultado do c�lculo da linha 4 como primeiro valor, e se disser que n�o, mostre o resultado final . 
//Exemplo de uso para o algoritmo: 4 + 3 = 7 x 4 = 28 / 14 = 2.

public class Ex6 {

	public static void main(String[] args) {

		JOptionPane.showMessageDialog(null,"Este programa funciona como uma calculadora"
				+ "\nquando o usu�rio deseja continuar calculando"
				+ "\no resultado se torna o numero inicial da equa��o ");
		int num1 = 0;
		int num2 = 0;
		String operacao= "";
		String fim= "";
		int resultado = 0;

		num1 = Integer.parseInt(JOptionPane.showInputDialog("informe o 1� n�mero: "));

		do {
			
			do {
			 operacao = JOptionPane.showInputDialog("informe o a opera��o desejada " + "( +, - , / , *)");
			} while ((operacao.equals("+") == false) && (operacao.equals("-") == false) && (operacao.equals("*") == false) && (operacao.equals("/") == false));
			
			num2 = Integer.parseInt(JOptionPane.showInputDialog("informe o 2� n�mero: "));

			switch (operacao) {
			case "+":
				resultado = num1 + num2;
				break;
			case "-":
				resultado = num1 - num2;
				break;
			case "/":
				resultado = num1 / num2;
				break;
			case "*":
				resultado = num1 * num2;
				break;
			default:
				JOptionPane.showMessageDialog(null, "Opc�o inv�lida");
				break;
			}
			JOptionPane.showMessageDialog(null, "A opera��o " + num1 + operacao + num2 + " � de: " + resultado);
			
			fim = JOptionPane.showInputDialog("Se voc� deseja continuar o calculo Digite (sim)");
						
			if (fim.equalsIgnoreCase("sim")== true) {
				num1 = resultado;
				
				JOptionPane.showMessageDialog(null, "Voc� desejou realizar um novo calculo e o Numero inicia �: " + num1);
			}
		} while (fim.equals("sim") == true);
		
		JOptionPane.showMessageDialog(null, "O resultado final da opera��o � de: " +   resultado);                                                                      
	}

}
