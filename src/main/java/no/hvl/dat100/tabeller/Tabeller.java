package no.hvl.dat100.tabeller;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {

		// TODO
		int[] tab1 = {1,2,3,4,5};
		for (int i = 0; i<tab1.length; i++) {
			int t1 = tab1[i];
			System.out.print("[");
			System.out.print(t1 + " , ");
			System.out.print("]");
		}
	}

	// b)
	public static String tilStreng(int[] tabell) {

		// TODO

		tabell = new int[3];
		String s = "[" + tabell[0] + "," + tabell[1] + "," + tabell[2] + "]";
		return s;
	}

	// c)
	public static int summer(int[] tabell) {

		// TODO
		int sum = 0;
		for (int i = 0; i<tabell.length; i++) {
			sum += tabell[i];
		}
		return sum;
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {

		// TODO
		throw new UnsupportedOperationException("Metoden finnesTall ikke implementert");

	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {

		// TODO
		throw new UnsupportedOperationException("Metoden posisjonTall ikke implementert");
	}

	// f)
	public static int[] reverser(int[] tabell) {

		// TODO
		throw new UnsupportedOperationException("Metoden reverser ikke implementert");
	}

	// g)
	public static boolean erSortert(int[] tabell) {

		// TODO
		throw new UnsupportedOperationException("Metoden erSortert ikke implementert");
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {

		// TODO
		throw new UnsupportedOperationException("Metoden settSammen ikke implementert");

	}
}
