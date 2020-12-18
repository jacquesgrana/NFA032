
/**
 * Classe décrivant un Assuré
 * 
 * @author jacques granarolo
 */
public class Assure {
	private String nom;
	private String prenom;
	private String identifiant;
	
	/**
	 * Constructeur
	 * @param monNom String
	 * @param monPrenom String
	 * @param monIdentifiant String
	 */
	Assure(String monNom, String monPrenom, String monIdentifiant) {
		this.nom = monNom;
		this.prenom = monPrenom;
		this.identifiant = monIdentifiant;
	}

	public String getNom() {
		return nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public String getIdentifiant() {
		return identifiant;
	}

	public void setNom(String monNom) {
		this.nom = monNom;
	}

	public void setPrenom(String monPrenom) {
		this.prenom = monPrenom;
	}

	public void setIdentifiant(String monIdentifiant) {
		this.identifiant = monIdentifiant;
	}
	
	
}
