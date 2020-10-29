
public class RUNPOINT {

	public static void main(String[] args) {
		POINT3 point1 = new POINT3 ("p1", 2, 10, 7);
		POINT3 point2 = new POINT3 ("p2", 2, 7, 10);

		System.out.println("distance à l'origine de P1 : " + point1.distance());
		System.out.println("distance à l'origine de P2 : " + point2.distance());
		
		if (point1.distance() == point2.distance()) {
			System.out.println("Les points sont à la même distance");
		}
		else {
			if (point1.distance() > point2.distance()) {
				System.out.println("P1 est plus loin que P2");
			}
			else {
				System.out.println("P2 est plus loin que P1");
			}
		}
	}

}
