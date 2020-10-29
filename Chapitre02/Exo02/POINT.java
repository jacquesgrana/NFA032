
public class POINT {
	private String nom;
	private double abscisse;
	private double ordonnee;

	public POINT (String monNom, double monAbscisse, double monOrdonnee) {
		this.nom = monNom;
		this.abscisse = monAbscisse;
		this.ordonnee = monOrdonnee;
	}
	
	public String getNom() {
		return this.nom;
	}
	
	public double getAbscisse() {
		return this.abscisse;
	}
	
	public double getOrdonnee() {
		return this.ordonnee;
	}
}
