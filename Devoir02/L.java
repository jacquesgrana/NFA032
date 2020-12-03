
/**
 * Classe définissant les objets L comme élément de base d'une liste chaînée.
 * @author Jacques Granarolo
 * @version 1.0
 */
public class L {
	
	private Integer info;
	private L next;
	
	/**
	 * Constructeur avec paramètres.
	 * @param myInfo Integer
	 * @param myNext L
	 */
	public L(Integer myInfo, L myNext) {
		this.info = myInfo;
		this.next = myNext;
	}
	
	/**
	 * Fonction qui renvoie le champs "info" de l'objet.
	 * @return info Integer
	 */
	public Integer getInfo() {
		return info;
	}

	/**
	 * Fonction qui renvoie le prochain élément de la liste chaînée.
	 * @return next L
	 */
	public L getNext() {
		return next;
	}

	/**
	 * Méthode qui affecte le champs "info" de l'objet.
	 * @param myInfo Integer
	 */
	public void setInfo(Integer myInfo) {
		this.info = myInfo;
	}

	/**
	 * Méthode qui affecte l'objet "next" de l'objet.
	 * @param myNext L
	 */
	public void setNext(L myNext) {
		this.next = myNext;
	}
	
	

}
