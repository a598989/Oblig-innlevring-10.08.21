package no.hvl.dat100;

import javax.swing.JOptionPane;


public class Oblig3 {

	public static void main(String[] args) {
		String nummer = JOptionPane.showInputDialog("Skriv inn tall: ");
		
		
		int n = Integer.parseInt(nummer); 
		long fakultet = 1;
		
		
		while(n <= 0) {
			JOptionPane.showMessageDialog(null,"Tallet ditt er mindre enn null, og kan ikke fakulteres");
			nummer = JOptionPane.showInputDialog("Skriv inn tall: ");
			n = Integer.parseInt(nummer);
		}
		
		while (n > 1) {
			fakultet *= n;
			n--;
		}
		
		System.out.println(nummer + "! = " + fakultet);
		

	}


		
}

