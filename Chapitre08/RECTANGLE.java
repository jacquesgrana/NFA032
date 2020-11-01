
public class RECTANGLE implements INTERFACE_FIGURE {
	private double largeur;
	private double longueur;
	
	public RECTANGLE(double maLargeur, double maLongueur) {
		this.largeur = maLargeur;
		this.longueur = maLongueur;
	}
	public double perimetre() {
		double perimetre = 0;
		perimetre = 2 * ( this.largeur + this.longueur);
		return perimetre;
	}
	public double getLargeur() {
		return this.largeur;
	}
	public void setLargeur(double maLargeur) {
		this.largeur = maLargeur;
	}
	public double getLongueur() {
		return this.longueur;
	}
	public void setLongueur(double maLongueur) {
		this.longueur = maLongueur;
	}
}
