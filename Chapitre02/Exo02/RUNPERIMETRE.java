
public class RUNPERIMETRE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		POINT pointTr1 = new POINT("point triangle 1", 0, 2);
		POINT pointTr2 = new POINT("point triangle 2", 1, 0);
		POINT pointTr3 = new POINT("point triangle 3", 4, 4);
		TRIANGLE monTriangle = new TRIANGLE (pointTr1, pointTr2, pointTr3);
		System.out.println("Périmètre du triangle : " + monTriangle.longueur());
		
		POINT pointQu1 = new POINT("point quadrilatère 1", 0, 2);
		POINT pointQu2 = new POINT("point quadrilatère 2", 1, 0);
		POINT pointQu3 = new POINT("point quadrilatère 3", 4, 4);
		POINT pointQu4 = new POINT("point quadrilatère 4", 5, 6);
		
		QUADRILATERE monQuadrilatere = new QUADRILATERE (pointQu1, pointQu2, pointQu3,pointQu4);
		System.out.println("Périmètre du quadrilatère : " + monQuadrilatere.longueur());

	}

}
