package no.hvl.dat100.matriser;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {

		// Går gjennom radene i matrisen: {rad[], rad[], ..., rad[]}
		for (int[] rad : matrise) {
			// Går gjennom alle elementene i hver rad, altså kolonnene.
			for (int kol : rad) {
				System.out.print(kol + " ");
			}
			System.out.println();
		}
	}

	// b)
	public static String tilStreng(int[][] matrise) {
		String s = "";

		for (int i = 0; i < matrise.length; i++) {
			for (int j =  0; j < matrise[i].length; j++) {

				// Hvis index viser til siste element i raden.
				if (j == matrise[i].length - 1) {
					s += matrise[i][j];

				} else {
					s += matrise[i][j] + " ";
				}
			}
			// Legger til ny linje / rad
			s += "\n";
		}
		return s;
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {

		// Ny utgangsmatrise med lik størrelse som inngangsmatrisen
		int[][] returMat = new int[matrise.length][matrise[0].length];

		for (int i = 0; i < matrise.length; i++) {
			for (int j = 0; j < matrise[i].length; j++) {

				returMat[i][j] = matrise[i][j] * tall;
			}
		}
	return returMat;
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {

		boolean c = true;

		if (a == b){

		c = true;

		}else{

		c = false;

		}
		return c;

		
	}
	
	// e)
	public static int[][] speile(int[][] matrise) {

		// TODO

		throw new UnsupportedOperationException("Metoden speile ikke implementert");
	
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {


		// Resultatet får like mange rader som a og kolonner som b.
		int[][] resultat = new int[a.length][b[0].length];

		// Regner ut hvert element i resultatmatrisen.
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b[0].length; j++) {
				for (int k = 0; k < a[0].length; k++) {
					resultat[i][j] += a[i][k] * b[k][j];
				}
			}
		}

		return resultat;
	}
}
