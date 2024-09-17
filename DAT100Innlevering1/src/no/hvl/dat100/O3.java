package no.hvl.dat100;

import static javax.swing.JOptionPane.showInputDialog;

public class O3 {

	public static int beregnFakultet(int tall) {

		int fakultet = 1;
		for (int i = 2; i <= tall; i++)
			fakultet *= i;

		return fakultet;
	}
	
	public static void main(String[] args) {
		
		int tall = Integer.valueOf(showInputDialog("fakultet av: "));	
		System.out.println("Fakultet: " + beregnFakultet(tall));
	}

}
