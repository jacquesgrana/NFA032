
public class TRIANGLE {
	protected POINT point1;
	protected POINT point2;
	protected POINT point3;
	
	public TRIANGLE(POINT monPoint1, POINT monPoint2, POINT monPoint3) {
		this.point1 = monPoint1;
		this.point2 = monPoint2;
		this.point3 = monPoint3;
	}
	
	public double longueur() {
		double longueur = 0;
		// longueur = P2-P1
		longueur = Math.sqrt(((this.point2.getAbscisse() - this.point1.getAbscisse()) * (this.point2.getAbscisse() - this.point1.getAbscisse())) + ((this.point2.getOrdonnee() - this.point1.getOrdonnee()) * (this.point2.getOrdonnee() - this.point1.getOrdonnee())));
		// longueur += P3-P2
		longueur += Math.sqrt(((this.point3.getAbscisse() - this.point2.getAbscisse()) * (this.point3.getAbscisse() - this.point2.getAbscisse())) + ((this.point3.getOrdonnee() - this.point2.getOrdonnee()) * (this.point3.getOrdonnee() - this.point2.getOrdonnee())));
		// longueur += P1-P3
		longueur += Math.sqrt(((this.point1.getAbscisse() - this.point3.getAbscisse()) * (this.point1.getAbscisse() - this.point3.getAbscisse())) + ((this.point1.getOrdonnee() - this.point3.getOrdonnee()) * (this.point1.getOrdonnee() - this.point3.getOrdonnee())));
		
		return longueur;
	}
	
}
