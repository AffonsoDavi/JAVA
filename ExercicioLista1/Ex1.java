import javax.swing.JOptionPane;

//Faça um algoritmo que peça para o usuário inserir uma quantidade em horas, 
//outra em minutos e mais uma em segundos e mostre quantos segundos esse horário contém.
public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int horas=0;
		int minutos=0;
		int segundos=0;
		int totalSegundos=0;
		
		JOptionPane.showMessageDialog(null, "Este programa realiza a convenção de horas, minutos e segundos, tudo para Segundos");
		horas = Integer.parseInt(JOptionPane.showInputDialog("Informe uma quantidade em horas"));
		minutos = Integer.parseInt(JOptionPane.showInputDialog("Informe uma quantidade em minutos"));
		segundos = Integer.parseInt(JOptionPane.showInputDialog("Informe uma quantidade em segundos"));
		totalSegundos = ((horas * 3600) + (minutos * 60) + segundos);
		JOptionPane.showMessageDialog(null, "o tempo total de: " + horas + " hora(as), " + minutos + " minuto(os) e " + segundos + " segundo(os) é de: " + totalSegundos);
	}
}
