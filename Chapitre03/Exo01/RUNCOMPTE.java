
public class RUNCOMPTE {

	public static void main(String[] args) {
		int nombreClient = 0;
		
		
		// saisir nb client
		System.out.println("Saisir le nombre de Clients");
		nombreClient = Lire.i();
		
		// création tableau des comptes
		COMPTE[] tabComptes = new COMPTE[nombreClient];
		
		// boucle sur nb client
		for(int i=0; i<nombreClient; i++) {
			// saisir nom client
			System.out.println();
			System.out.println("Saisir le nom du client numéro " + (i+1));
			String nomClient = Lire.S();
			
			double[] tabSommeDepensees;
			tabSommeDepensees = new double[3];
				// boucle de 0 à 2
			for (int j=0; j<3; j++) {
				// saisir somme depensée pour ce mois dans tableau
				System.out.println();
				System.out.println("Saisir la somme dépensée par " + nomClient + " pour le mois n° " + (j+1));
				tabSommeDepensees[j] = Lire.d();
			}
			
			// creation objet COMPTE
			COMPTE monCompte = new COMPTE(nomClient, tabSommeDepensees);
			// ajout du compte dans tableau des comptes
			tabComptes[i] = monCompte;
		}
		
			
		
		// affichage du total pour le trimestre pour chaque client
		// somme = 0;
		
		// boucle sur nombreClient
		for(int i=0; i<nombreClient; i++) {
			int sommeTrimestre = 0;
			// boucle de 0 à 2
			for (int j=0; j<3; j++) {
				// somme = somme + tabComptes[i].sommeDepensee[j]
				sommeTrimestre += tabComptes[i].getSommeDepensee()[j];
			}
			// affichage de la somme
			System.out.println();
			System.out.println("Somme totale des sommes dépensées par " + tabComptes[i].getNom() + " pour le trimestre : " + sommeTrimestre );
			
			// test ristourne
			if (sommeTrimestre > 500) {
				// si ok affichage du nom et du montant de la ristourne
				double ristourne = sommeTrimestre * 0.02;
				System.out.println();
				System.out.println(tabComptes[i].getNom() + " a droit à une ristourne de : " + ristourne);
			}
						
		}
			
		
		
		// affichage du total des sommes dépensée par mois
		// boucle de 0 à 2 j
		for (int j=0; j<3; j++) {
			// int sommeMois = 0
			int SommeMois = 0;
			// boucle sur nombreClient i
			for(int i=0; i<nombreClient; i++) {
				// somme += tabComptes[i].getSommeDepensee()[j]
				SommeMois += tabComptes[i].getSommeDepensee()[j];
			}
				
			// affichage de la somme pour le mois numero j+1
			System.out.println();
			System.out.println("Somme totale des sommes dépensées pour le mois numéro " + (j+1) + " : " + SommeMois );
		}

		
		

	}

}
