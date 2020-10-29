
public class COMPTE {
	private String nom;
	private double[] sommeDepensee = new double[3];

	public COMPTE(String monNom, double[] mesSommes) {
		this.nom = monNom;
		this.sommeDepensee = mesSommes;
	}
	
	public String getNom() {
		return this.nom;
	}
	
	public double[] getSommeDepensee() {
		return this.sommeDepensee;
	}
	
}
