import javax.swing.JOptionPane;

//Fa�a uma solu��o que alimente um vetor com 10 valores inteiros e
//tamb�m que solicite ao usu�rio a entrada de dados de um valor inteiro qualquer. 
//A solu��o dever� fazer uma busca do valor, informado pelo usu�rio, no vetor e imprima a posi��o 
//em que este foi encontrado ou se n�o foi encontrado.

public class Ex7 {

	public static void main(String[] args) {

		int[] inteiros = new int[10];
		int qualquer = 0;
		int fim = -1;
		
		JOptionPane.showMessageDialog(null, "Este programa deve ser inserido 10 valores inteiros"
				+ "\nem seguida inserir um n�mero aleatorio para verificar se algum valor dos vetores � igual");
		
		for (int i = 0; i < 10; i++) {
			inteiros[i] = Integer.parseInt(JOptionPane.showInputDialog("informe o " + (i + 1) + "� numero do vetor: "));
			if (qualquer == inteiros[i]) {
				fim = i;
			}
		}
		
		qualquer = Integer.parseInt(JOptionPane
				.showInputDialog("INFORME O NUMERO ALEATORIO PARA TENTAR " + "LOCALIZA-LO DENTRO DOS VETORES "));
		
		
		if (fim >= 0) {
			JOptionPane.showMessageDialog(null, "O valor aleatorio digitado se encontra no vetor: inteiros[" + fim + "]");
		} else {
			JOptionPane.showMessageDialog(null, "O valor aleatorio n�o se encontra em nenhum vetor");
		}

	}
}
