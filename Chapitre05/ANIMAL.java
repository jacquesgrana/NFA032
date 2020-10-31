
public class ANIMAL {
	private String nom;
	private String surnom;
	private ANIMAL suivant;

	public ANIMAL(String monNom, String monSurnom, ANIMAL monSuivant) {
	this.nom = monNom;
	this.surnom = monSurnom;
	this.suivant = monSuivant;
	} 

	public ANIMAL cloneAnimal (String monNom, String monSurnom, ANIMAL monSuivant) {
	return new ANIMAL(monNom, monSurnom, monSuivant);
	}
	
	public String getNom() {
		return this.nom;
	}
	
	public String getSurnom() {
		return this.surnom;
	}
	
	public ANIMAL getSuivant() {
		return this.suivant;
	}
	
	public void setNom(String monNom) {
		this.nom = monNom;
	}
	
	public void setSurnom(String monSurnom) {
		this.surnom = monSurnom;
	}
	
	public void setSuivant(ANIMAL monSuivant) {
		this.suivant = monSuivant;
	}
}