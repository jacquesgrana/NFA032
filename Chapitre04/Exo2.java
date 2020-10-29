
public class Exo2 {

	public static void main(String[] args) {
		System.out.println("Saisir n");
		int nombreIteration = Lire.i();
		
		int resultat = calculSuite(nombreIteration);
		System.out.println();
		System.out.println("Résultat : " + resultat);

	}

	
	public static int calculSuite(int n) {
		if (n == 0) {
			return 1;
		}
		else {
			if (n == 1) {
				return 4;
			}
			else {
				return 8*calculSuite(n-1) - 3*calculSuite(n-2);
			}
		}
	}
}
