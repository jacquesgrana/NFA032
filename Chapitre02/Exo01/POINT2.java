
public class POINT2 {
private String nom;
protected double abscisse;
protected double ordonnee;

public POINT2 (String monNom, double monAbscisse, double monOrdonnee) {
	this.nom = monNom;
	this.abscisse = monAbscisse;
	this.ordonnee = monOrdonnee;
}

public double distance() {
	return Math.sqrt((this.abscisse * this.abscisse) + (this.ordonnee * this.ordonnee));
}

}
