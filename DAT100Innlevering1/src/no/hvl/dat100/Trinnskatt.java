package no.hvl.dat100;

import static javax.swing.JOptionPane.showInputDialog;

public class Trinnskatt {

	static int skatteTrinnMin[] = { 208051, 292851, 670001, 937901, 1350001 };
	static int skatteTrinnMax[] = { 292850, 670000, 637900, 1350000, Integer.MAX_VALUE };
	static double trinnSkat[] = { 0.017, 0.040, 0.136, 0.166, 0.176 };

	public static double skatteTrinn(double bruttolønn, int trinn) {

		if (skatteTrinnMin[trinn] <= bruttolønn) {
			double skattForTrinn = (Math.min(skatteTrinnMax[trinn], bruttolønn) - skatteTrinnMin[trinn])
					* trinnSkat[trinn];
			return skattForTrinn;
		}
		return 0;
	}

	public static double beregnSkatt(double bruttolønn) {
		double totalSkatt = 0;
		for (int i = 0; i < trinnSkat.length; i++) {
			double skattForTrinn = skatteTrinn(bruttolønn, i);
			totalSkatt += skattForTrinn;
			if (skattForTrinn == 0) {
				break;
			}
		}
		return totalSkatt;
	}

	public static void main(String[] args) {

		double bruttolønn = Double.valueOf(showInputDialog("Skriv inn bruttolønn: ")),
				skatt = beregnSkatt(bruttolønn);

		System.out.println("Bruttoinntekt: " + bruttolønn);
		System.out.println("Skattebeløp: " + skatt);
		System.out.println("Prosent: " + (skatt / bruttolønn) * 100 + "%");
	}

}
