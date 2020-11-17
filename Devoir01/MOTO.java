
public class MOTO {
	private String nom;
	private double prix;
	private int quantiteStock;
	private int dureeGarantie;
	
	public MOTO(String monNom, double monPrix, int maQuantite, int maDuree) {
		this.nom = monNom;
		this.prix = monPrix;
		this.quantiteStock = maQuantite;
		this.dureeGarantie = maDuree;
	}

	public String getNom() {
		return this.nom;
	}

	public double getPrix() {
		return this.prix;
	}

	public int getQuantiteStock() {
		return this.quantiteStock;
	}

	public int getDureeGarantie() {
		return this.dureeGarantie;
	}

	public void setNom(String monNom) {
		this.nom = monNom;
	}

	public void setPrix(double monPrix) {
		this.prix = monPrix;
	}

	public void setQuantiteStock(int maQuantite) {
		this.quantiteStock = maQuantite;
	}

	public void setDureeGarantie(int maDuree) {
		this.dureeGarantie = maDuree;
	}
	
	
}
