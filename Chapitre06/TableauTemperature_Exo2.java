
public class TableauTemperature_Exo2 {

	public static void main(String[] args) {
		double[] tableauTemp = new double[10];
		double tempSaisie;
		
		System.out.println("Saisir 10 températures");
		System.out.println();
		
		for(int i=0; i<10; i++) {
			
			try {
				System.out.println("Température n°" + (i+1) + " :");
				tempSaisie = Lire.d();
				tableauTemp[i] = verifTemp(tempSaisie);
			}
			catch(TemperatureKO t) {
				System.out.println("Température incorrecte !");
				i--;
			}
		}
		
		System.out.println("Températures saisies");
		System.out.println();
		
		for(int i=0; i<10; i++) {
			System.out.println("Température n°" + (i+1) + " : " + tableauTemp[i]);
		}
		
	}
	
	

	

	private static double verifTemp(double tempSaisie) throws TemperatureKO {
		// TODO Auto-generated method stub
		if ((tempSaisie > 40) || (tempSaisie < 30)) {
			throw new TemperatureKO();
		}
		return tempSaisie;
	}
	
	
}



