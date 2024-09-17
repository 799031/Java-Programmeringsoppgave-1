package no.hvl.dat100;

import static javax.swing.JOptionPane.showInputDialog;

public class Karakterskala {
	
	static String karakterer[] = { "F", "E", "D", "C", "B", "A" };
	static int minGrense[] = { 0, 40, 50, 60, 80, 90 };
	static int maxGrense[] = { 39, 49, 59, 79, 89, 100 };
	
	static int studentNr;
	public static boolean printKarakter(int poeng, int min, int max, String karakter) {

		if (min <= poeng && poeng <= max) {
			System.out.println("Student nr: "+studentNr+" fikk karakter: " + karakter);
			return true;
		}
		return false;
	}

	public static boolean karakter(int poeng) {

		if (poeng < 0 || poeng > 100) {
			System.out.println("ikke gyldig poeng verdi prøv på nytt");
		} else {

			for (int i = 0; i < karakterer.length; i++) {
				if (printKarakter(poeng, minGrense[i], maxGrense[i], karakterer[i])) {
					return true;
				}
			}
		}
		return false;
	}

	public static void main(String[] args) {
		
		int antallStudenter = 10;
		for (int i = 0; i < antallStudenter; i++) {
			studentNr = i;
			
			while(!karakter(Integer.valueOf(showInputDialog("Skriv student nummer "+studentNr+" sin poengsum: "))));
		}

	}
}
