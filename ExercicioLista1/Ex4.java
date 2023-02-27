import javax.swing.JOptionPane;

//Faça um algoritmo que mostre a soma de todos os valores pares 
//entre o intervalo de dois números digitados pelo usuário.
public class Ex4 {

	public static void main(String[] args) {

		int num1=0;
		int num2=0;
		int aux=0;
		int somaPares=0;
		JOptionPane.showMessageDialog(null,"DIGITE DOIS NUMEROS E SERÁ MOSTRADO A SOMA DE TODOS OS VALORES PARES ENTRE OS DOIS NUMEROS");
		num1 = Integer.parseInt(JOptionPane.showInputDialog("informe o 1º numero:"));
		num2 = Integer.parseInt(JOptionPane.showInputDialog("informe o 2º numero:"));

		if (num2 < num1){
			aux = num1;
			num1 = num2;
			num2 = aux;
		}
			for (int i = num1; i <= num2; i++) {
				if ((i % 2) == 0) {
					somaPares = somaPares + i;
				
			}
		}
			JOptionPane.showMessageDialog(null, "A soma dos valores pares é de: " + somaPares);
		
	}
}