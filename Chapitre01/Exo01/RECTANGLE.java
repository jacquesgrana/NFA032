
public class RECTANGLE {
private String nom;
private double largeur, longueur;

	public RECTANGLE (String nom,double largeur,double longueur) {
		this.nom = nom;
		this.largeur = largeur;
		this.longueur = longueur;
	}
	
	public String getNom () {
		return this.nom;
	}
	
	public double getLargeur () {
		return this.largeur;
	}
	
	public double getLongueur () {
		return this.longueur;
	}
	
	public void setNom (String monNom) {
		this.nom = monNom;
	}
	
	public void setLargeur (double maLargeur) {
		this.largeur = maLargeur;
	}
	
	public void setLongueur (double maLongueur) {
		this.longueur = maLongueur;
	}
	
	public double calculPerimetre () {
		double perimetre = 0;
		perimetre = 2 * (this.largeur + this.longueur);
		return perimetre;
	}
	
	public double calculSurface () {
		double surface = 0;
		surface = this.largeur * this.longueur;
		return surface;
	}

}
