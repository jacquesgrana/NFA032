
public class Exo1 {

	public static void main(String[] args) {
		// saisir capital de départ
		System.out.println("Saisir le capital de départ");
		double capitalDepart = Lire.d();
		// saisir le nombre d'années
		System.out.println("Saisir le nombre d'années");
		int nombreAnnees = Lire.i();
		
		// afficher le resultat pour nb années
		double capital = calculCapital(nombreAnnees, capitalDepart);
		System.out.println("Capital au bout de " + nombreAnnees + " années : " + capital);
	}
	
	public static double calculCapital(int n, double monCapital) {
		if (n == 0) {
			return monCapital;
		}
		else {
			return calculCapital(n-1, monCapital) * 1.05;
		}
	}

}
