
public class RunTriplet {

	public static void main(String[] args) {
		int monInt1, monInt2, monInt3;
		double monReel1, monReel2, monReel3;
		char monCar1, monCar2, monCar3;
		
		System.out.println("Triplet d'entiers");
		System.out.println();
		System.out.println("Saisir la valeur n°1");
		monInt1 = Lire.i();
		Integer monInteger1 = monInt1;
		System.out.println("Saisir la valeur n°2");
		monInt2 = Lire.i();
		Integer monInteger2 = monInt2;
		System.out.println("Saisir la valeur n°3");
		monInt3 = Lire.i();
		Integer monInteger3 = monInt3;
		
		TRIPLET <Integer> tripletInteger = new TRIPLET <Integer> (monInteger1, monInteger2, monInteger3);
		System.out.println();
		System.out.println("Contenu : " + tripletInteger.getValeur1().intValue() + " / " + tripletInteger.getValeur2().intValue() + " / " + tripletInteger.getValeur3().intValue());
		if (tripletInteger.max() != null) {
			System.out.println("Max : " + tripletInteger.max().intValue());
		}
		
		System.out.println();
		System.out.println();
		System.out.println();
		
		System.out.println("Triplet de réels");
		System.out.println();
		System.out.println("Saisir la valeur n°1");
		monReel1 = Lire.d();
		Double monDouble1 = monReel1;
		System.out.println("Saisir la valeur n°2");
		monReel2 = Lire.d();
		Double monDouble2 = monReel2;
		System.out.println("Saisir la valeur n°3");
		monReel3 = Lire.d();
		Double monDouble3 = monReel3;
		
		TRIPLET <Double> tripletDouble = new TRIPLET <Double> (monDouble1, monDouble2, monDouble3);
		System.out.println();
		System.out.println("Contenu : " + tripletDouble.getValeur1() + " / " + tripletDouble.getValeur2() + " / " + tripletDouble.getValeur3());
		if (tripletDouble.max() != null) {
			System.out.println("Max : " + tripletDouble.max());
		}
		
		System.out.println();
		System.out.println();
		System.out.println();
		
		System.out.println("Triplet de caractères");
		System.out.println();
		System.out.println("Saisir la valeur n°1");
		monCar1 = Lire.c();
		Character monChar1 = monCar1;
		System.out.println("Saisir la valeur n°2");
		monCar2 = Lire.c();
		Character monChar2 = monCar2;
		System.out.println("Saisir la valeur n°3");
		monCar3 = Lire.c();
		Character monChar3 = monCar3;
		
		TRIPLET <Character> tripletChar = new TRIPLET <Character> (monChar1, monChar2, monChar3);
		System.out.println();
		System.out.println("Contenu : " + tripletChar.getValeur1() + " / " + tripletChar.getValeur2() + " / " + tripletChar.getValeur3());
		if (tripletChar.max() != null) {
			System.out.println("Max : " + tripletChar.max());
		}

		System.out.println();
		System.out.println();
		System.out.println();
		
		System.out.println("Triplet de chaines de caractères");
		System.out.println();
		System.out.println("Saisir la valeur n°1");
		String maString1 = Lire.S();
		System.out.println("Saisir la valeur n°2");
		String maString2 = Lire.S();
		System.out.println("Saisir la valeur n°3");
		String maString3 = Lire.S();
		
		TRIPLET <String> tripletString = new TRIPLET <String> (maString1, maString2, maString3);
		System.out.println();
		System.out.println("Contenu : " + tripletString.getValeur1() + " / " + tripletString.getValeur2() + " / " + tripletString.getValeur3());
		if (tripletString.max() != null) {
			System.out.println("Max : " + tripletString.max());
		}
		
	}

}
