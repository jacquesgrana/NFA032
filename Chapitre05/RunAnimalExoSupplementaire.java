
public class RunAnimalExoSupplementaire {

	public static void main(String[] args) {
		char saisie;
		boolean isListeVide = true;
		ANIMAL tete = new ANIMAL("tête","tête",null);
		
		do {
			if (!isListeVide) {
				System.out.println();
				afficherListe(tete);
				System.out.println();
			}
			System.out.println("nombre d'élément(s) : " + longueurListe(tete));
			System.out.println();
			System.out.println("Menu [ Q : quitter / A : ajouter animal / I : insérer animal / S : supprimer animal ]");
			System.out.println();
			saisie = Lire.c();

			if ((saisie == 'A') || (saisie == 'a')) {
				ajouterAnimal(tete);
				isListeVide = false;
			}

			if ((saisie == 'S') || (saisie == 's')) {
				if (!isListeVide) {
					supprimerAnimal(tete);
				}
				
				// tester si liste vide et affecte isListeVide en fonction
				if (longueurListe(tete) == 0) {
					isListeVide = true;
				}
			}
			
			if ((saisie == 'I') || (saisie == 'i')) {
				if (!isListeVide) {
					insererAnimal(tete);
				}
			}
		}
		while ((saisie != 'Q') && (saisie != 'q'));
		System.out.println("Fin du programme");
	}
	
	

	private static void insererAnimal(ANIMAL maTete) {
		int longueurListe = longueurListe(maTete);
		int rangSaisi = 0, compteur = 1;
		String nomNom, monSurnom;
		ANIMAL animalPrecedent, animalSuivant, monNouvelAnimal;
		animalPrecedent = maTete;
		animalSuivant = maTete;
		monNouvelAnimal = maTete;
		
		System.out.println("Insertion d'un animal de la liste");
		System.out.println();
		System.out.println("Saisir le numéro où l'insertion sera faite (de 1 à " + (longueurListe - 1) + ")");
		System.out.println();
		
		do {
			rangSaisi = Lire.i();
		}
		while ((rangSaisi < 1) || (rangSaisi > (longueurListe - 1)));
		
		System.out.print("Saisir le nom");
		nomNom = Lire.S();
		System.out.print("Saisir le surnom");
		monSurnom = Lire.S();
		
		while(compteur < rangSaisi) {
			compteur++;
			animalPrecedent = animalPrecedent.getSuivant();
			}
		animalSuivant = animalPrecedent.getSuivant();
		monNouvelAnimal = monNouvelAnimal.cloneAnimal(nomNom, monSurnom, null);
		animalPrecedent.setSuivant(monNouvelAnimal);
		monNouvelAnimal.setSuivant(animalSuivant);
	}



	private static void supprimerAnimal(ANIMAL maTete) {
		int longueurListe = longueurListe(maTete);
		int rangSaisi = 0, compteur = 1;
		ANIMAL precedent , temp;
		precedent = maTete;
		
		System.out.println("Suppression d'un animal de la liste");
		System.out.println();
		System.out.println("Saisir le numéro de l'animal à supprimer (de 1 à " + longueurListe + ")");
		System.out.println();
		do {
			rangSaisi = Lire.i();
		}
		while ((rangSaisi < 1) || (rangSaisi > longueurListe));
		
		while(compteur < rangSaisi) {
			compteur++;
			precedent = precedent.getSuivant();
			}
		temp=precedent.getSuivant();
		precedent.setSuivant(temp.getSuivant());
	}

	private static void ajouterAnimal(ANIMAL maTete) {
		String nomNom, monSurnom;
		ANIMAL monDernierAnimal, monNouvelAnimal;
		monDernierAnimal = maTete;
		monNouvelAnimal = maTete;
		
		System.out.println("Ajout d'un animal à la liste");
		System.out.println();
		System.out.print("Saisir le nom");
		nomNom = Lire.S();
		System.out.print("Saisir le surnom");
		monSurnom = Lire.S();
		while(monDernierAnimal.getSuivant()!=null) {
			monDernierAnimal = monDernierAnimal.getSuivant();
		}
		monNouvelAnimal = monNouvelAnimal.cloneAnimal(nomNom, monSurnom, null);
		monDernierAnimal.setSuivant(monNouvelAnimal);
	}

	private static void afficherListe(ANIMAL maTete) {
		int compteur = 1;
		ANIMAL monAnimal;
		monAnimal=maTete;
		while(monAnimal.getSuivant()!=null) {
			monAnimal = monAnimal.getSuivant();
			System.out.println(compteur + " : " + monAnimal.getNom() + " : " + monAnimal.getSurnom());
			compteur++;
		}
	}
	
	private static int longueurListe(ANIMAL maTete) {
		int compteur = 0;
		ANIMAL monAnimal;
		monAnimal=maTete;
		while(monAnimal.getSuivant()!=null) {
			compteur++;
			monAnimal = monAnimal.getSuivant();
		}
		return compteur;
	}
}
