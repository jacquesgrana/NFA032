class ExoExc_Exo3 {
	static int calcul1(int x,int y) throws Erreur1,Erreur2,Erreur3 {
		if(x == y) {
			throw new Erreur1();
		}
		else if(x == 0) {
			throw new Erreur2();
		}
		else if(y == 0) {
			throw new Erreur3();
		}
		return x + y;
	}

	static int calcul2(int x,int y,int z) throws Erreur1 {
		try {
			return(calcul1(x,y));
		}
		catch(Erreur2 e) {
			return y + z;
		}
		catch(Erreur3 e) {
			return x + z;
		}
	}

	public static void main(String[]args) {
		try {
			System.out.println(calcul2(1,3,5));
			System.out.println(calcul2(0,3,5));
			System.out.println(calcul2(2,0,5)); 
			System.out.println(calcul2(3,3,5));
		}
		catch(Erreur1 e) {
			System.out.println("Erreur fatale");
		}
	}
}

/* 
   Explications :
   **************
   
   calcul2(x,y,z)
   quand x=y affiche "Erreur fatale" (Erreur1)
   sinon quand x=0 affiche y+z (Erreur2)
   sinon quand y=0 affiche x+z (Erreur3)
   sinon (quand x != y et x != 0 et y != 0) affiche x+y (pas d'erreur)
   
*/