package no.hvl.dat100.lab6.matriser;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {

		for (int[] i : matrise) {
			for (int j : i) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

	// b)
	public static String tilStreng(int[][] matrise) {
		String matriseTxt = "";

		for (int[] i : matrise) {
			for (int j : i) {
				matriseTxt += j + " ";
			}
			matriseTxt += "\n";
		}
		return matriseTxt;
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
		int[][] nyMatrise = new int[matrise.length][matrise.length];
		
		
		for (int i = 0; i < nyMatrise.length; i++) {
			for (int j = 0; j < nyMatrise.length; j++) {
				nyMatrise[i][j] = matrise[i][j] * tall;
			}
		}
		
		return nyMatrise;
	}
	/* Skjønner ikke hvorfor det blir feil på denne koden:
	 
 	public static int[][] skaler(int tall, int[][] matrise) {
	int[][] nyMatrise = matrise;
	int a = 0;
	int sum = 0;

	for (int[] i : nyMatrise) {
		for (int j = 0; j < nyMatrise.length; j++) {
			sum = i[j] * tall;
			i[j] = sum;
			nyMatrise[a] = i;
		}
		a++;
	}

	return nyMatrise;
}
 */

	// d)
	public static boolean erLik(int[][] a, int[][] b) {

		boolean erlik = true;
		
		if (a != b) {
			erlik = false;
		}
		
		return erlik;
	}

	// e)
	public static int[][] speile(int[][] matrise) {

		// TODO
		throw new UnsupportedOperationException("speile ikke implementert");

	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {

		// TODO
		throw new UnsupportedOperationException("multipliser ikke implementert");

	}
}
