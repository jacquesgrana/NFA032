
public class RunFigure {

	public static void main(String[] args) {
		double maLargeur, maLongueur;
		double monRayon;
		double monCote1, monCote2, monCote3;
		RECTANGLE monRectangle;
		CERCLE monCercle;
		TRIANGLE monTriangle;
		
		System.out.println("Rectangle :");
		System.out.println("Saisir la largeur :");
		maLargeur = Lire.d();
		System.out.println("Saisir la longueur :");
		maLongueur = Lire.d();
		monRectangle = new RECTANGLE (maLargeur, maLongueur);
		System.out.println();
		System.out.println("Périmètre du rectangle : " + monRectangle.perimetre());
		
		System.out.println();
		System.out.println("Cercle :");
		System.out.println("Saisir le rayon :");
		monRayon = Lire.d();
		monCercle = new CERCLE (monRayon);
		System.out.println();
		System.out.println("Périmètre du cercle : " + monCercle.perimetre());
		
		System.out.println();
		System.out.println("Triangle :");
		System.out.println("Saisir le côté n°1 :");
		monCote1 = Lire.d();
		System.out.println("Saisir le côté n°2 :");
		monCote2 = Lire.d();
		System.out.println("Saisir le côté n°3 :");
		monCote3 = Lire.d();
		monTriangle = new TRIANGLE (monCote1, monCote2, monCote3);
		System.out.println();
		System.out.println("Périmètre du triangle : " + monTriangle.perimetre());
	}

}
