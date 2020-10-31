
public class RunAnimalExoSupplementaire {

	public static void main(String[] args) {
		char saisie;
		boolean isListeVide = true;
		ANIMAL tete = new ANIMAL("tête","tête",null);
		ControleurAnimal monControleur = new ControleurAnimal();
		
		do {
			if (!isListeVide) {
				System.out.println();
				monControleur.afficherListe(tete);
				System.out.println();
			}
			System.out.println("nombre d'élément(s) : " + monControleur.longueurListe(tete));
			System.out.println();
			System.out.print("[ Q : quitter / A : ajouter animal ");
			if(monControleur.longueurListe(tete) > 0 ) {
				System.out.print(" / S : supprimer animal");
			}
			if(monControleur.longueurListe(tete) > 1 ) {
				System.out.print(" / I : insérer animal");
			}
			System.out.println("]");
			System.out.println();
			saisie = Lire.c();

			if ((saisie == 'A') || (saisie == 'a')) {
				monControleur.ajouterAnimal(tete);
				isListeVide = false;
			}

			if ((saisie == 'S') || (saisie == 's')) {
				if (!isListeVide) {
					monControleur.supprimerAnimal(tete);
				}
				
				// tester si liste vide et affecte isListeVide en fonction
				if (monControleur.longueurListe(tete) == 0) {
					isListeVide = true;
				}
			}
			
			if ((saisie == 'I') || (saisie == 'i')) {
				if (!isListeVide) {
					monControleur.insererAnimal(tete);
				}
			}
		}
		while ((saisie != 'Q') && (saisie != 'q'));
		System.out.println("Fin du programme");
	}
	
	
}
