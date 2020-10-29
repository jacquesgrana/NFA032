
public class POINT3 extends POINT2 {
	private double hauteur;

	public POINT3 (String monNom, double monAbscisse, double monOrdonnee, double maHauteur) {
		super(monNom,monAbscisse,monOrdonnee);
		this.hauteur = maHauteur;
	}
	
	public double distance() {
		return Math.sqrt((this.abscisse * this.abscisse) + (this.ordonnee * this.ordonnee) + (this.hauteur * this.hauteur));
	}
}
