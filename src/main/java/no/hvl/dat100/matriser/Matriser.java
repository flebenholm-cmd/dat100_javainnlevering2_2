package no.hvl.dat100.matriser;

import no.hvl.dat100.tabeller.Tabeller;

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

		// TODO
		throw new UnsupportedOperationException("Metoden erLik ikke implementert");
		
	}
	
	// e)
	public static int[][] speile(int[][] matrise) {

		int[][] returMat = new int[matrise.length][matrise[0].length];

		for (int i = 0; i < matrise.length; i++) {
			for (int j = 0; j < matrise[i].length; j++) {
				returMat[i][j] = matrise[j][i];
			}

		}
		return returMat;
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {

		// TODO
		throw new UnsupportedOperationException("Metoden multipliser ikke implementert");
	
	}
}
