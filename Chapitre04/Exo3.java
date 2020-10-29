
public class Exo3 {

	public static void main(String[] args) {
		// faire tant que a < b
		int a = 0, b = 0, pgcd = 0;
		do {
			// saisir a et b
			System.out.println("Saisir a :");
			a = Lire.i();
			System.out.println("Saisir b :");
			b = Lire.i();
		}
		while (a<b);
			
		// pgcd = calculPgcd(a,b);
		pgcd = calculPgcd(a,b,b);
		// afficher résultat
		System.out.println("Pgcd de " + a + " et " + b + " : " + pgcd);

	}

	private static int calculPgcd(int a, int b, int ancienReste) {
		int r = a % b;
		if (r == 0) {
			return ancienReste;
		}
		else {
			return calculPgcd(b,r,r);
			
		}
		
		
	}

}
