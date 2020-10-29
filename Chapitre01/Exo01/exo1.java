
public class exo1 {

	public static void main(String[] args) {
		RECTANGLE rectangle1 = new RECTANGLE ("rectangle 1",10,5);
		RECTANGLE rectangle2 = new RECTANGLE ("rectangle 2",3,16);
		System.out.println(rectangle1.getNom() + " / perimètre : " + rectangle1.calculPerimetre() + " / surface : " + rectangle1.calculSurface());
		System.out.println(rectangle2.getNom() + " / perimètre : " + rectangle2.calculPerimetre() + " / surface : " + rectangle2.calculSurface());
		
		if (rectangle1.calculPerimetre() != rectangle2.calculPerimetre()) {
			if (rectangle1.calculPerimetre() > rectangle2.calculPerimetre()) {
				System.out.println("le rectangle n1 a le plus grand périmètre");
			}
			else {
				System.out.println("le rectangle n2 a le plus grand périmètre");
			}
		}
		
		if (rectangle1.calculSurface() != rectangle2.calculSurface()) {
			if (rectangle1.calculSurface() > rectangle2.calculSurface()) {
				System.out.println("le rectangle n1 a la plus grande surface");
			}
			else {
				System.out.println("le rectangle n2 a la plus grande surface");
			}
		}
	}
}
