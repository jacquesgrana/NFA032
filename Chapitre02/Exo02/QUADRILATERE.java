public class QUADRILATERE extends TRIANGLE {
	private POINT point4;
	
	public QUADRILATERE (POINT monPoint1, POINT monPoint2, POINT monPoint3, POINT monPoint4) {
		super(monPoint1,monPoint2,monPoint3);
		this.point4 = monPoint4;
	}
	
	
	public double longueur() {
		double longueur = 0;
		// longueur = P2-P1
		longueur = Math.sqrt(((this.point2.getAbscisse() - this.point1.getAbscisse()) * (this.point2.getAbscisse() - this.point1.getAbscisse())) + ((this.point2.getOrdonnee() - this.point1.getOrdonnee()) * (this.point2.getOrdonnee() - this.point1.getOrdonnee())));
		// longueur += P3-P2
		longueur += Math.sqrt(((this.point3.getAbscisse() - this.point2.getAbscisse()) * (this.point3.getAbscisse() - this.point2.getAbscisse())) + ((this.point3.getOrdonnee() - this.point2.getOrdonnee()) * (this.point3.getOrdonnee() - this.point2.getOrdonnee())));
		// longueur += P4-P3
		longueur += Math.sqrt(((this.point4.getAbscisse() - this.point3.getAbscisse()) * (this.point4.getAbscisse() - this.point3.getAbscisse())) + ((this.point4.getOrdonnee() - this.point3.getOrdonnee()) * (this.point4.getOrdonnee() - this.point3.getOrdonnee())));
		// longueur += P1-P4
		longueur += Math.sqrt(((this.point1.getAbscisse() - this.point4.getAbscisse()) * (this.point1.getAbscisse() - this.point4.getAbscisse())) + ((this.point1.getOrdonnee() - this.point4.getOrdonnee()) * (this.point1.getOrdonnee() - this.point4.getOrdonnee())));
		return longueur;
	}
}
