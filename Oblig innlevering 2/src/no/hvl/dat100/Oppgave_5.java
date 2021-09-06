package no.hvl.dat100;

import javax.swing.*;

public class Oppgave_5 {

	public static void main(String[] args) {
		String poeng = JOptionPane.showInputDialog("Poeng: ");
		
		
		char karakter = 'F';
		
		
		int i = Integer.parseInt(poeng);

		if (i <= 100 && i >= 90) { 
			karakter = 'A';
		
		} else if (i <= 89 && i >= 80) {
			karakter = 'B';
			

		} else if (i <= 79 && i >= 60) {
			karakter = 'C';
			
			
			
		} else if (i <= 59 && i >= 50 ) {
			karakter = 'D';
			
			
		} else if (i <= 49 && i >= 40) {
			karakter = 'E';
			
			
		} else if (i <= 39 && i >= 0)  {
			karakter = 'F';
			
		}
		JOptionPane.showMessageDialog(null, karakter);
		
	} 
	
}