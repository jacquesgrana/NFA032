
/**
 * Classe d'erreur avec la classe Exception comme classe mère.
 * @see Exception
 * 
 * @author jacques granarolo
 */
public class ErreurSaisieAssure extends Exception {
	
	/**
	 * Ajouté par l'IDE.
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * Commentaire décrivant la raison de la levée de l'exception.
	 */
	private String commentaire;
	
	/**
	 * Constructeur
	 * @param monCommentaire String commentaire associé
	 */
	public ErreurSaisieAssure(String monCommentaire) {
		super();
		this.commentaire = monCommentaire;
	}

	public String getCommentaire() {
		return commentaire;
	}

	public void setCommentaire(String commentaire) {
		this.commentaire = commentaire;
	}
	
	
}
