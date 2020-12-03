
/**
 * Classe contenant la méthode "main".
 * @see ControllerL
 * @see L
 * @author Jacques Granarolo
 * @version 1.0
 */
public class RunListeEntier {

	/**
	 * Méthode main du programme.
	 * @see ControllerL
	 * @see L
	 * @param args paramètres java
	 */
	public static void main(String[] args) {
		Character input;
		Boolean isListeVide = true;
		Boolean quit = false;
		L head = new L(-1,null);
		
		do {
			displayMenu(isListeVide, head);
			input = Lire.c();
			if (((input == 'S') || (input == 's')) && isListeVide) {
				ControllerL.fillList(head);
				isListeVide = false;
			}
			if (((input == 'T') || (input == 't')) && !isListeVide) {
				ControllerL.displayIfListContainsMarch(head);
			}
			if (((input == 'E') || (input == 'e')) && !isListeVide) {
				ControllerL.surroundFirstMarchWithZeros(head);
			}
			if (((input == 'U') || (input == 'u')) && !isListeVide) {
				ControllerL.deleteMarchIfSurrounded(head);
			}
			if ((input == 'Q') || (input == 'q')) {
				quit = true;
			}
		}
		while (!quit);
		System.out.println();
		System.out.println("Fin du programme.");
	}

	/**
	 * Procédure qui affiche le menu du programme.
	 * @param isListeVide Boolean indique si la liste est vide
	 * @param myHead L Tête de la liste chaînée
	 */
	private static void displayMenu(Boolean isListeVide, L myHead) {
		System.out.println("****************");
		System.out.println("*     Menu     *");
		System.out.println("****************");
		if(isListeVide) {
			System.out.println("Liste Vide !");
		}
		else {
			ControllerL.displayList(myHead);
		}
		System.out.println();
		
		if(isListeVide) {
			System.out.println("(S) : Saisir la liste.");
		}
		else {
			if (ControllerL.length(myHead) > 1) {
				System.out.println("(T) : Tester si la liste contient au moins une marche.");
				System.out.println("(E) : Entourer de zéros la première marche de la liste.");
				System.out.println("(U) : Supprimer dans la liste la marche entourée de zéros.");
			}
		}
		System.out.println("(Q) : Quitter");
		System.out.println();
		System.out.println("Saisir votre choix :");
	}

}
