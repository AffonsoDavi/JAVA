import javax.swing.JOptionPane;

//Faça uma solução que alimente um vetor com 10 valores inteiros e
//também que solicite ao usuário a entrada de dados de um valor inteiro qualquer. 
//A solução deverá fazer uma busca do valor, informado pelo usuário, no vetor e imprima a posição 
//em que este foi encontrado ou se não foi encontrado.

public class Ex7 {

	public static void main(String[] args) {

		int[] inteiros = new int[10];
		int qualquer = 0;
		int fim = -1;
		
		JOptionPane.showMessageDialog(null, "Este programa deve ser inserido 10 valores inteiros"
				+ "\nem seguida inserir um número aleatorio para verificar se algum valor dos vetores é igual");
		
		for (int i = 0; i < 10; i++) {
			inteiros[i] = Integer.parseInt(JOptionPane.showInputDialog("informe o " + (i + 1) + "º numero do vetor: "));
			if (qualquer == inteiros[i]) {
				fim = i;
			}
		}
		
		qualquer = Integer.parseInt(JOptionPane
				.showInputDialog("INFORME O NUMERO ALEATORIO PARA TENTAR " + "LOCALIZA-LO DENTRO DOS VETORES "));
		
		
		if (fim >= 0) {
			JOptionPane.showMessageDialog(null, "O valor aleatorio digitado se encontra no vetor: inteiros[" + fim + "]");
		} else {
			JOptionPane.showMessageDialog(null, "O valor aleatorio não se encontra em nenhum vetor");
		}

	}
}
