
/**
 * Classe pour manipuler la liste composée d'objets L.
 * @see L
 * @author Jacques Granarolo
 * @version 1.0
 */
public class ControllerL {

	/**
	 * Procédure qui affiche et exécute la saisie de la liste d'objets L.
	 * @param myHead Tête de la liste d'objets L 
	 * @see L
	 */
	public static void fillList(L myHead) {
		Character input;
		Integer myInfo, counter = 0;
		L myLastL, myNewL;
		myLastL = myHead;
		myNewL = myHead;
		System.out.println("Saisie de la liste");
		System.out.println();
		do {
			counter++;
			do {
				System.out.print("Saisir l'info de l'élément n° " + (counter) + " (entier strictement positif) : ");
				myInfo = Lire.i();
			} 
			while (myInfo <= 0);
			myNewL = new L (myInfo, null);
			myLastL.setNext(myNewL);
			System.out.println();
			System.out.println("(C) : continuer, sinon retour menu");
			input = Lire.c();
			myLastL = myNewL;
		} 
		while ((input == 'C') || (input == 'c'));
	}

	/**
	 * Procédure qui affiche la liste d'objets L
	 * @param myHead Tête de la liste d'objets L 
	 * @see L
	 */
	public static void displayList(L myHead) {
		int counter = 0;
		L myCurrentL;
		myCurrentL=myHead;
		System.out.println("Liste :");
		while(myCurrentL.getNext()!=null) {
			myCurrentL = myCurrentL.getNext();
			counter++;
			System.out.println(counter + " : " + myCurrentL.getInfo());
		}
	}

	/**
	 * Procédure qui affiche si la liste d'objets L contient une "marche".
	 * @param myHead Tête de la liste d'objets L
	 * @see L
	 */
	public static void displayIfListContainsMarch (L myHead) {
		Character input;

		if (isListContainsMarch(myHead)) {
			System.out.println();
			System.out.println("La liste contient au moins une marche.");
		}
		else {
			System.out.println();
			System.out.println("La liste ne contient pas de marche.");
		}
		do {
			System.out.println();
			System.out.println("Appuyer sur 'C' pour continuer.");
			input = Lire.c();
		}
		while ((input != 'C') && (input != 'c'));

	}

	/**
	 * Procédure qui entoure de "0" la première "marche" de la liste d'objets L.
	 * @param myHead Tête de la liste d'objets L
	 * @see L
	 */
	public static void surroundFirstMarchWithZeros(L myHead) {
		Character input;
		Integer counter = 0;
		L myLastL, myLast2L, myCurrentL;
		myLastL = myHead;
		myLast2L = myHead;
		myCurrentL = myHead;
		L myZeroRight = new L(0, null);
		L myZeroLeft = new L(0, null);

		if (isListContainsMarch(myHead)) {
			System.out.println("Ajout de zéros autour de la première marche.");
			while(myCurrentL.getNext()!=null) {
				myCurrentL = myCurrentL.getNext();
				counter++;
				if (counter > 1) {
					if ((myCurrentL.getInfo() == (myLastL.getInfo()+1)) && (myLastL.getInfo() != 0)) {
						myZeroRight.setNext(myCurrentL.getNext());
						myCurrentL.setNext(myZeroRight);
						myZeroLeft.setNext(myLast2L.getNext());
						myLast2L.setNext(myZeroLeft);
					}
				}
				myLast2L = myLastL;
				myLastL = myCurrentL;

			}

		}
		else {
			System.out.println("La liste ne contient pas de marche!");
		}
		do {
			System.out.println();
			System.out.println("Appuyer sur 'C' pour continuer.");
			input = Lire.c();
		}
		while ((input != 'C') && (input != 'c'));
	}

	/**
	 * Procédure qui supprime la première "marche" entourée de "0" de la liste d'objets L.
	 * @param myHead Tête de la liste d'objets L
	 * @see L
	 */
	public static void deleteMarchIfSurrounded(L myHead) {
		Character input;
		Integer counter = 0;
		L myLastL, myLast2L, myCurrentL;
		myLastL = myHead;
		myLast2L = myHead;
		myCurrentL = myHead;

		if (isListContainsMarch(myHead)) {
			System.out.println("Suppression de la marche entourée de zéros.");
			while(myCurrentL.getNext()!=null) {
				myCurrentL = myCurrentL.getNext();
				counter++;
				if (counter > 2) {
					if ((myCurrentL.getInfo() == (myLastL.getInfo()+1)) 
							&& (myLastL.getInfo() != 0) 
							&& (myLast2L.getInfo() == 0)
							&& (myCurrentL.getNext().getInfo() == 0)) {
						myLast2L.setNext(myCurrentL.getNext());
					}
				}
				myLast2L = myLastL;
				myLastL = myCurrentL;	
			}

		}
		else {
			System.out.println("La liste ne contient pas de marche!");
		}
		do {
			System.out.println();
			System.out.println("Appuyer sur 'C' pour continuer.");
			input = Lire.c();
		}
		while ((input != 'C') && (input != 'c'));

	}

	/**
	 * Fonction qui renvoie vrai si la liste d'objets L contient une "marche", sinon renvoie faux.
	 * @param myHead Tête de la liste d'objets L
	 * @return Boolean
	 * @see L
	 */
	public static Boolean isListContainsMarch(L myHead) {
		Integer counter = 0;
		L myLastL, myCurrentL;
		myLastL = myHead;
		myCurrentL = myHead;

		while(myCurrentL.getNext()!=null) {
			myCurrentL = myCurrentL.getNext();
			counter++;
			if (counter > 1) {
				if ((myCurrentL.getInfo() == (myLastL.getInfo()+1)) && (myLastL.getInfo() != 0)) {
					return true;
				}
			}
			myLastL = myCurrentL;
		}
		return false;
	}

	/**
	 * Fonction qui renvoie le nombre d'éléments de la liste d'objets L.
	 * @param myHead Tête de la liste d'objets L
	 * @return Integer
	 * @see L
	 */
	public static Integer length(L myHead) {
		Integer counter = 0;
		L myCurrentL;
		myCurrentL=myHead;
		while(myCurrentL.getNext()!=null) {
			counter++;
			myCurrentL = myCurrentL.getNext();
		}
		return counter;
	}

}
