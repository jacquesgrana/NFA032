
public class STOCK {
	
	private static final int NB_ELEMENT_MAX = 50;
	
	private MOTO[] tableauMoto;

	public STOCK(MOTO[] monTableauMoto) {
		this.tableauMoto = monTableauMoto;
	}
	
	public MOTO[] getTableauMoto() {
		return this.tableauMoto;
	}

	public void setTableauMoto(MOTO[] monTableauMoto) {
		this.tableauMoto = monTableauMoto;
	}
	
	// fonction qui renvoie la moyenne simple du prix des motos
	public double calculeMoyennePrix() {
		double maSomme = 0.0;		
		for (int i = 0; i < this.calculeNombreElement(); i++) {
			maSomme += this.tableauMoto[i].getPrix();
		}
		return (maSomme / this.calculeNombreElement());
	}
	
	// fonction qui renvoie la moyenne (pondérée par les quantités en stocks) du prix des motos
		public double calculeMoyennePondereePrix() {
			double maSomme = 0.0;		
			for (int i = 0; i < this.calculeNombreElement(); i++) {
				maSomme += this.tableauMoto[i].getPrix() * this.tableauMoto[i].getQuantiteStock();
			}
			return (maSomme / this.calculeStock());
		}
	
	// procédure qui affiche les motos dont le prix est supérieur à la moyenne choisie
	public void afficheMotoSupMoy(String typeMoyenne) {
		double maMoyenne = 0.0;
		
		switch (typeMoyenne) {
		case "simple" :
			maMoyenne = this.calculeMoyennePrix();
			break;
		case "pondérée" :
			maMoyenne = this.calculeMoyennePondereePrix();
			break;	
		default :
			System.out.println("Erreur !");
			break;
		}
		
		System.out.println("Moto(s) dont le prix est supérieur à la moyenne " + typeMoyenne + " (" + maMoyenne + ") :");
		System.out.println();
		for (int i = 0; i < this.calculeNombreElement(); i++) {
			if (this.tableauMoto[i].getPrix() > maMoyenne) {
				System.out.println("Moto n°" + (i+1) 
					+ " / nom : " + this.tableauMoto[i].getNom() 
					+ " / prix : " + this.tableauMoto[i].getPrix()
					+ " / quantité : " + this.tableauMoto[i].getQuantiteStock()
					+ " / durée garantie : " + this.tableauMoto[i].getDureeGarantie()
					);
			}
		}
	}
	
	// fonction qui renvoie le nombre total des motos en stock
	public int calculeStock() {
		int maSomme = 0;
		for (int i = 0; i < this.calculeNombreElement(); i++) {
			maSomme += this.tableauMoto[i].getQuantiteStock();
		}
		return maSomme;
	}
	
	// procédure qui ajoute un objet MOTO à la fin du tableau de l'objet STOCK
	public void ajouteMoto(MOTO maMoto) {
		this.tableauMoto[this.calculeNombreElement()] = maMoto;
	}
	
	// fonction qui renvoie le nombre d'élément(s) (consécutifs et non null) du tableau de l'objet STOCK
	// j'ai mis return 50 (par la constante) à la fin, car sinon, si le tableau est plein (pas d'élément à null), au dernier tour de boucle, il ne retournera pas i
	public int calculeNombreElement() {
		for(int i = 0; i < NB_ELEMENT_MAX; i++) {
			if (this.getTableauMoto()[i] == null) {
				return i;
			}
		}
		return NB_ELEMENT_MAX;
	}

}
