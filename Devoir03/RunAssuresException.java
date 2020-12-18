/**
 * Classe contenant le "main". Vérifie la saisie d'une chaîne de caractère et lève éventuellement une exception.
 * @see Assure
 * @see ErreurSaisieAssure
 * 
 * @author jacques granarolo
 */
public class RunAssuresException {
	// TODO tester regex : "[A-Za-zéèêë-]{1,}[_]{1}[A-Za-zéèêë-]{2,}[/]{1}[A-Z]{3}[0-9]{4}[*]{1}
	
	/**
	 * Constante définissant le nombre maximum d'éléments des tableaux.
	 */
	private static final int NB_ASSURE_MAX = 20;

	/**
	 * Procédure "Main".
	 * @param args String[] paramètres java du "main".
	 */
	public static void main(String[] args) {
		Character saisie = ' ';
		Integer nombreAssure = 0;
		Boolean quitter = false;
		Boolean listeVide = true;
		Assure[] tabAssures = new Assure[NB_ASSURE_MAX];
		String[] tabStringAssures = new String[NB_ASSURE_MAX];

		do {
			afficheMenu(listeVide, nombreAssure, tabAssures, tabStringAssures);
			saisie = Lire.c();

			if((saisie == 'A') || (saisie == 'a')) {
				if (nombreAssure < NB_ASSURE_MAX) {
					try {
						ajouterAssure(nombreAssure, tabAssures, tabStringAssures);
						nombreAssure++;
						listeVide = false;
					} 
					catch (ErreurSaisieAssure monErreur) {

						System.out.println();
						System.out.println("Erreur de saisie : " + monErreur.getCommentaire());
						System.out.println();
					} 
				}
				else {
					System.out.println();
					System.out.println("Tableau plein !");
				}
			}

			if((saisie == 'Q') || (saisie == 'q')) {
				quitter = true;
			}
		}
		while(!quitter);
		System.out.println();
		System.out.println("Fin du programme.");
	}

	/**
	 * Procédure qui effectue la saisie d'une chaîne de caractère et qui, après des vérifications, affecte les tableaux.
	 * @param nombreAssure Integer nombre d'assuré(s) présent(s) dans les tableaux.
	 * @param tabAssures Assure[] tableau d'objet Assure.
	 * @param tabStringAssures String[] tableau contenant les chaines de caractères saisies et vérifiées.
	 * @throws ErreurSaisieAssure Exception levée en cas de vérification échouée.
	 */
	private static void ajouterAssure(Integer nombreAssure, Assure[] tabAssures, String[] tabStringAssures) throws ErreurSaisieAssure {
		String maChaine = "", monCommentaire = "", maChaineTempo = "";
		String monNom = "", monPrenom = "", monIdentifiant = "";
		String[] monTableauChaineTempo;
		Boolean isOk = true;
		ErreurSaisieAssure monErreur = new ErreurSaisieAssure("");
		Assure monAssure = new Assure ("","","");

		System.out.println();
		System.out.println("Ajoût d'un assuré");
		System.out.println();
		System.out.println("Saisir la chaine de caractère définissant un nouvel assuré");
		System.out.println("sous la forme : 'nom_prenom/identifiant*'.");
		System.out.println("Identifiant : 3 lettres + 4 chiffres");
		System.out.println("1ère lettre de l'identifiant : 1ère lettre du prénom,");
		System.out.println("2e lettre de l'identifiant : 1ère lettre du nom,");
		System.out.println("3e lettre de l'identifiant : dernière lettre du nom.");
		System.out.println();
		maChaine = Lire.S();
		isOk = isStringValid(maChaine, nombreAssure, monAssure, tabAssures);
		if(isOk) {
			tabAssures[nombreAssure] = monAssure;
			tabStringAssures[nombreAssure] = maChaine;
		}
	}
	
	/**
	 * Fonction qui renvoie vrai si la maChaine passe les tests de vérification.
	 * @param maChaine String chaine de caractère saisie à verifier.
	 * @param nombreAssure Integer nombre d'assuré(s) présent(s) dans les tableaux.
	 * @param monAssure Assure Objet construit après vérification.
	 * @param tabAssures Assure[] tableau d'objet Assure.
	 * @return isOk Boolean vrai si la maChaine passe les tests de vérification.
	 * @throws ErreurSaisieAssure Exception levée en cas de vérification échouée.
	 */
	private static Boolean isStringValid(String maChaine, Integer nombreAssure, Assure monAssure, Assure[] tabAssures) throws ErreurSaisieAssure {
		String monCommentaire = "", maChaineTempo = "";
		String monNom = "", monPrenom = "", monIdentifiant = "";
		String[] monTableauChaineTempo;
		Boolean isOk = true;

		if (isChaineContientChar(maChaine, '_')) {
			isOk = isOk & true;
		}
		else {
			isOk = isOk & false;
			monCommentaire = "\n" + "Il manque le caractère '_' !";
		}

		// tester si possède un "/"
		if (isChaineContientChar(maChaine, '/')) {
			isOk = isOk & true;
		}
		else {
			isOk = isOk & false;
			monCommentaire += "\n" + "Il manque le caractère '/' !";
		}

		// tester si possède un "*" à la fin
		if (maChaine.charAt(maChaine.length() - 1) == '*') {
			isOk = isOk & true;
		}
		else {
			isOk = isOk & false;
			monCommentaire += "\n" + "Il manque le caractère '*' à la fin !";
		}

		if (isOk) {
			// extraction du nom, du prenom et de l'identifiant
			monTableauChaineTempo = maChaine.split("_", 2);
			monNom = monTableauChaineTempo[0];
			maChaineTempo = monTableauChaineTempo[1];
			monTableauChaineTempo = maChaineTempo.split("/", 2);
			monPrenom = monTableauChaineTempo[0];
			maChaineTempo = monTableauChaineTempo[1];
			monIdentifiant = maChaineTempo.substring(0, maChaineTempo.length()-1);
			monNom = formatString(monNom);
			monPrenom = formatString(monPrenom);
			monIdentifiant = monIdentifiant.toUpperCase();
		}
		
		// tester si le nom est composé de 'a-z A-Z éèêë'
		if (monNom.matches("[A-Za-zéèêë-]{1,}")) {
			isOk = isOk & true;
		}
		else {
			isOk = isOk & false;
			monCommentaire += "\n" + "Le nom ne doit contenir que des caractères !";
		}

		// tester si le prénom est composé de 'a-z A-Z éèêë'
		if (monPrenom.matches("[A-Za-zéèêë-]{1,}")) {
			isOk = isOk & true;
		}
		else {
			isOk = isOk & false;
			monCommentaire += "\n" + "Le prénom ne doit contenir que des caractères !";
		}

		// tester si identifiant ok
		// tester identifiant a 7 car
		if (monIdentifiant.length() == 7) {

			// tester si 1e lettre == 1e lettre du prénom
			if(monIdentifiant.charAt(0) == monPrenom.charAt(0)) {
				isOk = isOk & true;
			}
			else {
				isOk = isOk & false;
				monCommentaire += "\n" + "La 1e lettre de l'identifiant doit être la 1e lettre du prénom !";
			}

			// tester si 2e lettre == 1e lettre du nom
			if(monIdentifiant.charAt(1) == monNom.charAt(0)) {
				isOk = isOk & true;
			}
			else {
				isOk = isOk & false;
				monCommentaire += "\n" + "La 2e lettre de l'identifiant doit être la 1e lettre du nom !";
			}

			// tester si 3e lettre == derniere lettre du nom
			Character mon3eChar = monIdentifiant.charAt(2);
			String ma3eLettre = mon3eChar.toString();
			Character monDernierCharNom = monNom.charAt(monNom.length()-1);
			String maDerniereLettreNom = monDernierCharNom.toString().toUpperCase();
			if(ma3eLettre.equals(maDerniereLettreNom)) {
				isOk = isOk & true;
			}
			else {
				isOk = isOk & false;
				monCommentaire += "\n" + "La 3e lettre de l'identifiant doit être la dernière lettre du nom !";
			}

			// tester si reste est un entier
			String monCode = monIdentifiant.substring(3);

			if(monCode.matches("[0-9]{1,}")) {
				isOk = isOk & true;
			}
			else {
				isOk = isOk & false;
				monCommentaire += "\n" + "Les 4 dernièrs caractères de l'identifiant doivent être des chiffres !";
			}

			// tester si identifiant pas déja présent dans le tableau
			if(!isIdentifiantDejaPresent(monIdentifiant, nombreAssure, tabAssures)) {
				isOk = isOk & true;
			}
			else {
				isOk = isOk & false;
				monCommentaire += "\n" + "Identifiant déja présent dans la liste !";
			}


		}
		else {
			isOk = isOk & false;
			monCommentaire += "\n" + "L'identifiant doit avoir sept caractères !";
		}
		
		if (isOk) {
			monAssure.setNom(monNom);
			monAssure.setPrenom(monPrenom);
			monAssure.setIdentifiant(monIdentifiant);
		}
		else {
			monCommentaire += "\n";
			ErreurSaisieAssure monErreur = new ErreurSaisieAssure(monCommentaire);
			throw monErreur;
		}
		
		return isOk;
	}

	/**
	 * Fonction qui renvoie une chaine de caractères avec la première lettre en majuscule et le reste en minuscule.
	 * @param monString String chaîne à modifier.
	 * @return monString String chaîne modifiée.
	 */
	public static String formatString(String monString) {
		monString = monString.toLowerCase();
		Character monPremierChar = monString.charAt(0);
		String maMajusculeString = monPremierChar.toString().toUpperCase();
		monString = maMajusculeString + monString.substring(1);
		return monString;
	}

	/**
	 * Fonction qui renvoie vrai si l'identifiant de l'assuré est déjà présent dans le tableau.
	 * @param monIdentifiant String identifiant à tester.
	 * @param nombreAssure Integer nombre d'assuré(s) présent(s) dans les tableaux.
	 * @param tabAssures Assure[] tableau d'objet Assure.
	 * @return Boolean
	 */
	private static boolean isIdentifiantDejaPresent(String monIdentifiant, Integer nombreAssure, Assure[] tabAssures) {
		for (int i = 0; i < nombreAssure; i++) {
			if(tabAssures[i].getIdentifiant().equals(monIdentifiant)) {
				return true;
			}
		}
		return false;
	}

	/**
	 * Fonction qui renvoie vrai si la chaîne maChaine contien le caractère monChar.
	 * @param maChaine String chaîne à tester.
	 * @param monChar Character caractère à tester.
	 * @return Boolean
	 */
	private static boolean isChaineContientChar(String maChaine, Character monChar) {
		for (int i = 0; i < maChaine.length(); i++) {
			if(maChaine.charAt(i) == monChar) {
				return true;
			}
		}
		return false;
	}

	/**
	 * Procédure qui affiche la liste des assurés (nom, prénom, identifiant et la chaine de caractères saisie).
	 * @param monNombreAssure Integer nombre d'assuré(s) présent(s) dans les tableaux.
	 * @param monTabAssures Assure[] tableau d'objet Assure.
	 * @param monTabStringAssures String[] tableau des chaînes de caractères saisies.
	 */
	private static void afficheListeAssures(Integer monNombreAssure, Assure[] monTabAssures, String[] monTabStringAssures) {
		for (int i=0; i<monNombreAssure; i++) {
			System.out.println(monTabAssures[i].getNom() + " / " + monTabAssures[i].getPrenom() + " / " + monTabAssures[i].getIdentifiant() + " / " + monTabStringAssures[i]);
		}

	}

	/**
	 * Procédure qui affiche le menu.
	 * @param isListeVide Boolean vrai si les tableaux sont vides (état initial).
	 * @param monNombreAssure Integer nombre d'assuré(s) présent(s) dans les tableaux.
	 * @param monTabAssure Assure[] tableau d'objet Assure.
	 * @param monTabStringAssures String[] tableau des chaînes de caractères saisies.
	 */
	private static void afficheMenu(Boolean isListeVide, Integer monNombreAssure, Assure[] monTabAssure, String[] monTabStringAssures) {
		System.out.println();
		System.out.println("Nombre d'assuré(s) dans la liste : " + monNombreAssure);
		System.out.println();
		if(isListeVide) {
			System.out.println("Liste vide.");
			System.out.println();
		}
		else {
			System.out.println("Liste des assuré(s) :");
			System.out.println();
			afficheListeAssures(monNombreAssure, monTabAssure, monTabStringAssures);
			System.out.println();
		}
		System.out.println("Menu :");
		System.out.println();
		if (monNombreAssure < NB_ASSURE_MAX) {
			System.out.println("A : Ajouter un assuré à la liste.");
		}
		else {
			System.out.println("Tableau plein !");
		}
		System.out.println("Q : Quitter.");
	}

}
