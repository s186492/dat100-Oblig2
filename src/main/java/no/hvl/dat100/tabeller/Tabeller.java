package no.hvl.dat100.tabeller;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {

			for(int i = 0; i < tabell.length; i++) {
				System.out.println(tabell[i] + "");
			}

	}

	// b)
	public static String tilStreng(int[] tabell) {

		String resultat = "[";
		for(int i = 0; i < tabell.length; i++) {
			resultat+= tabell[i];
			if (i < tabell.length - 1) {
				resultat += ",";
			}
		}
		resultat += "]";
		return resultat;
	}

	// c)
	public static int summer(int[] tabell) {

		int sum = 0;
		for (int i = 0; i < tabell.length; i++) {
			sum += tabell[i];
		}
		return sum;
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {

		Boolean inneholderTall = false;
		for (int i = 0; i < tabell.length; i++) {
			if (tall == tabell[i]) {
				inneholderTall = true;
			}
		}
		return inneholderTall;
	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {

		for (int i = 0; i < tabell.length; i++) {
			if (tabell[i] == tall) {
				return i;
			} 
		}
		return -1;
	}

	// f)
	public static int[] reverser(int[] tabell) {
		int motsattTabell[] = new int [tabell.length];
		
		for (int i = 0; i < tabell.length; i++) {
			motsattTabell[tabell.length - 1 - i] = tabell[i];
		}
		return motsattTabell;
		
	}

	// g)
	public static boolean erSortert(int[] tabell) {
	
		for (int i = 0; i < tabell.length - 1; i++) {
			if (tabell[i] > tabell[i + 1]) {
				return false;
			}
		}
		return true;

	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {
		int sammensattTabell[] = new int [tabell1.length + tabell2.length];
		
		for (int i = 0; i < tabell1.length; i++) {
			sammensattTabell[i] = tabell1[i];
		}
		
		for (int j = 0; j < tabell2.length; j++) {
			sammensattTabell[tabell1.length + j] = tabell2[j];
		}
		return sammensattTabell;
		
	}
}
