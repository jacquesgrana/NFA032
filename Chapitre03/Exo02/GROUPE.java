
public class GROUPE {

	public static void main(String[] args) {
		
		ELEVE[] tableauEleve = new ELEVE[5];
		double sommeTotale = 0, moyenneGroupe = 0;
		// boucle de 0 à 4
		for (int i=0; i<5; i++) {
			// saisir nom et notes
			System.out.println();
			System.out.println("Saisir le nom de l'élève n° " + (i+1));
			String monNom = Lire.S();
			System.out.println();
			System.out.println("Saisir la note en Français");
			double maNoteFr = Lire.d();
			System.out.println();
			System.out.println("Saisir la note en Maths");
			double maNoteMa = Lire.d();
			System.out.println();
			System.out.println("Saisir la note en Informatique");
			double maNoteIn = Lire.d();
			// creation objet ELEVE
			ELEVE monEleve = new ELEVE(monNom, maNoteFr, maNoteMa, maNoteIn);
			// affectation dans tableau d'ELEVE
			tableauEleve[i] = monEleve;
		}

		
		// sommeTotale = 0
		// boucle de 0 à 4
		for (int i=0; i<5; i++) {
			// calcul moyenne
			double maMoyenne = tableauEleve[i].calculMoyenne();
			// sommeTotal += notes
			sommeTotale += tableauEleve[i].getNoteFr() + tableauEleve[i].getNoteMa() + tableauEleve[i].getNoteIn();
			// affichage nom et moyenne
			System.out.println();
			System.out.println(tableauEleve[i].getNom() + " a pour moyenne : " + maMoyenne);
		}
			
		// moyenneGroupe = sommeTotale / (5 * 3)
		moyenneGroupe = sommeTotale / (5 * 3);
		// affichage moyenne du groupe
		System.out.println();
		System.out.println("Moyenne du groupe : " + moyenneGroupe);
	}

}
