import javax.swing.JOptionPane;

//Crie uma calculadora que permita o cálculo de uma equação, sem limite de execuções definido, da seguinte maneira:
//1. Peça o primeiro valor ,
//2. Peça o cálculo que deseja fazer (entre as 4 operações básicas),
//3. Peça um segundo valor 
//4. Efetue o cálculo,
//5. Peça se o usuário quer continuar calculando. Se ele responder que sim, 
//volte para o passo 2 usando o resultado do cálculo da linha 4 como primeiro valor, e se disser que não, mostre o resultado final . 
//Exemplo de uso para o algoritmo: 4 + 3 = 7 x 4 = 28 / 14 = 2.

public class Ex6 {

	public static void main(String[] args) {

		JOptionPane.showMessageDialog(null,"Este programa funciona como uma calculadora"
				+ "\nquando o usuário deseja continuar calculando"
				+ "\no resultado se torna o numero inicial da equação ");
		int num1 = 0;
		int num2 = 0;
		String operacao= "";
		String fim= "";
		int resultado = 0;

		num1 = Integer.parseInt(JOptionPane.showInputDialog("informe o 1º número: "));

		do {
			
			do {
			 operacao = JOptionPane.showInputDialog("informe o a operação desejada " + "( +, - , / , *)");
			} while ((operacao.equals("+") == false) && (operacao.equals("-") == false) && (operacao.equals("*") == false) && (operacao.equals("/") == false));
			
			num2 = Integer.parseInt(JOptionPane.showInputDialog("informe o 2º número: "));

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
				JOptionPane.showMessageDialog(null, "Opcão inválida");
				break;
			}
			JOptionPane.showMessageDialog(null, "A operação " + num1 + operacao + num2 + " é de: " + resultado);
			
			fim = JOptionPane.showInputDialog("Se você deseja continuar o calculo Digite (sim)");
						
			if (fim.equalsIgnoreCase("sim")== true) {
				num1 = resultado;
				
				JOptionPane.showMessageDialog(null, "Você desejou realizar um novo calculo e o Numero inicia é: " + num1);
			}
		} while (fim.equals("sim") == true);
		
		JOptionPane.showMessageDialog(null, "O resultado final da operação é de: " +   resultado);                                                                      
	}

}
