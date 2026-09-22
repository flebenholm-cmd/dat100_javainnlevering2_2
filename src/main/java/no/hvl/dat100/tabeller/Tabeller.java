package no.hvl.dat100.tabeller;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {

		// TODO
		int[] tab1 = {1,2,3,4,5};
		System.out.print("[");
		for (int i = 0; i<tab1.length; i++) {
			int t1 = tab1[i];

			System.out.print(t1 + ", ");

		}
		System.out.print("]");
	}

	// b)
	public static String tilStreng(int[] tabell) {

		// Start på s
		String s = "[";

		for (int i = 0; i<tabell.length; i++) {
			// Ved siste element i tabellen
			if (i == tabell.length-1) {
				// Legger til tall uten komma i s
				s += tabell[i];
			} else {
				// Legger til tall med komma i s
				s += tabell[i] + ",";
			}
		}
		// Ende på s
		s += "]";

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
		for (int i = 0; i<tabell.length; i++) {
			if (tabell[i] == tall) {
				return i;
			}
		}
		return -1;
	}

	// f)
	public static int[] reverser(int[] tabell) {
		// Deklarerer og initialiserer ny tabell.
		int[] returTab = new int[tabell.length];
		// Revers indeks
		int revIndex;

		for (int i = 0; i<tabell.length; i++) {

			revIndex = tabell.length - 1 - i;

			returTab[i] = tabell[revIndex];
		}
		return returTab;
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
