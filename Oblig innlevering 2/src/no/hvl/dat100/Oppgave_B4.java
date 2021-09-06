package no.hvl.dat100;

import javax.swing.*;

public class Oppgave_B4 {
	public static void main(String[] args) {
		String in = JOptionPane.showInputDialog("Brutto");
		long brutto = Long.parseLong(in);
		double sats = 0.0;
		
		if(brutto >= 164101 && brutto <=230950) {
			sats = 0.93;
		} else if (brutto >= 230951 && brutto <= 580650) {
			sats = 2.41;
		} else if (brutto>= 934051) {
			sats = 14.52;
		}
		
		double netto = brutto * (sats / 100);
		JOptionPane.showMessageDialog(null,"Sats: " + sats + "\nNetto:" + netto);

	}

}
