
public class RunStockMoto {

	private static final int NB_ELEMENT_MAX = 50;

	public static void main(String[] args) {
		char saisie;
		STOCK monStock = new STOCK(new MOTO[NB_ELEMENT_MAX]);
		boolean quitter = false, isTableauVide = true;
		
		do {
			afficheMenu(monStock, isTableauVide);
			saisie = Lire.c();
			
			if ((saisie == 'a') || (saisie == 'A')) {
				ajouteElementTableau(monStock);
				if (isTableauVide) {
					isTableauVide = false;
				}
			}
			
			if ((saisie == 'm') || (saisie == 'M')) {
				afficheMoyenne(monStock, "simple");
			}
			
			if ((saisie == 'p') || (saisie == 'P')) {
				afficheMoyenne(monStock, "pondérée");
			}
			
			if ((saisie == 't') || (saisie == 'T')) {
				afficheTotalStock(monStock);
			}
		
			
			if ((saisie == 's') || (saisie == 'S')) {
				afficheMotoSupMoyenne(monStock, "simple");
			}
			
			if ((saisie == 'u') || (saisie == 'U')) {
				afficheMotoSupMoyenne(monStock, "pondérée");
			}
			
			if ((saisie == 'q') || (saisie == 'Q')) {
				quitter = true;
			}
		}
		while (!quitter);
		
		System.out.println();
		System.out.println("Fin du programme.");
	}


	private static void afficheTotalStock(STOCK monStock) {
		char saisie2;
		do {
			System.out.println();
			System.out.println("Nombre total de motos en stock : " + monStock.calculeStock());
			System.out.println();
			System.out.println("'C' pour continuer");
			saisie2 = Lire.c();
		} 
		while ((saisie2 != 'C') && (saisie2 != 'c'));
	}

	private static void afficheMotoSupMoyenne(STOCK monStock, String typeMoyenne) {
		char saisie2;
		do {
			monStock.afficheMotoSupMoy(typeMoyenne);
			System.out.println();
			System.out.println("'C' pour continuer");
			saisie2 = Lire.c();
		} 
		while ((saisie2 != 'C') && (saisie2 != 'c'));
	}

	public static void afficheMoyenne(STOCK monStock, String typeMoyenne) {
		char saisie2;
		double maMoyenne = 0.0;
		
		switch (typeMoyenne) {
		case "simple" :
			maMoyenne = monStock.calculeMoyennePrix();
			break;
		case "pondérée" :
			maMoyenne = monStock.calculeMoyennePondereePrix();
			break;	
		default :
			System.out.println("Erreur !");
			break;
		}
		
		do {
			System.out.println();
			System.out.println("Moyenne " + typeMoyenne + " des prix : " + maMoyenne);
			System.out.println();
			System.out.println("'C' pour continuer");
			saisie2 = Lire.c();
		} 
		while ((saisie2 != 'C') && (saisie2 != 'c'));
	}

	private static void ajouteElementTableau(STOCK monStock) {
		String monNom = "";
		double monPrix = 0.0;
		int maQuantite = 0;
		int maDuree = 0;
		
		System.out.println();
		System.out.println();
		System.out.println("============================");
		System.out.println("|    Ajouter un élément    |");
		System.out.println("============================");
		System.out.println();
		System.out.println("Saisir le nom de la moto : ");
		monNom = Lire.S();
		System.out.println();
		System.out.println("Saisir le prix de la moto : ");
		monPrix = Lire.d();
		System.out.println();
		System.out.println("Saisir la quantité de moto(s) : ");
		maQuantite = Lire.i();
		System.out.println();
		System.out.println("Saisir la durée, en mois, de garantie de la moto : ");
		maDuree = Lire.i();
		
		MOTO maMoto = new MOTO(monNom, monPrix, maQuantite, maDuree);
		monStock.ajouteMoto(maMoto);
	}

	private static void afficheMenu(STOCK monStock, boolean isTableauVide) {
		System.out.println();
		System.out.println();
		System.out.println("============================");
		System.out.println("|           Menu           |");
		System.out.println("============================");
		System.out.println();
		System.out.println("Nombre d'élément(s) dans le tableau du stock : " + monStock.calculeNombreElement());
		if (isTableauVide) {
			System.out.println();
			System.out.println("Stock vide !");
		}
		else {
			afficheTableauStock(monStock);
			System.out.println();
			System.out.println("M : calculer la Moyenne simple des prix");
			System.out.println("P : calculer la Moyenne pondérée des prix");
			System.out.println("S : afficher les motos dont le prix est supérieur à la moyenne simple");
			System.out.println("U : afficher les motos dont le prix est supérieur à la moyenne pondérée");
			System.out.println("T : calculer le nombre total des motos en stock");
		}
		System.out.println("A : Ajouter un élément au tableau du Stock");
		System.out.println("Q : Quitter");
		
		
	}

	private static void afficheTableauStock(STOCK monStock) {
		for (int i = 0; i < monStock.calculeNombreElement(); i++) {
			System.out.println("n°" + (i+1) 
					+ " Nom : " + monStock.getTableauMoto()[i].getNom() 
					+ " / Prix : " + monStock.getTableauMoto()[i].getPrix() 
					+ " / Quantité : " + monStock.getTableauMoto()[i].getQuantiteStock() 
					+  " / Durée : " + monStock.getTableauMoto()[i].getDureeGarantie() );
			
		}
		
	}

}
