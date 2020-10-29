
public class ELEVE {
	private String nom;
	private double noteFr;
	private double noteMa;
	private double noteIn;
	
	public ELEVE (String monNom, double maNoteFr, double maNoteMa, double maNoteIn) {
		this.nom = monNom;
		this.noteFr = maNoteFr;
		this.noteMa = maNoteMa;
		this.noteIn = maNoteIn;
	}
	
	public String getNom() {
		return this.nom;
	}
	
	public double getNoteFr() {
		return this.noteFr;
	}
	
	public double getNoteMa() {
		return this.noteMa;
	}
	
	public double getNoteIn() {
		return this.noteIn;
	}
	
	public double calculMoyenne() {
		double moyenne = (this.noteFr + this.noteMa + this.noteIn) / 3;
		return moyenne;
	}
}
