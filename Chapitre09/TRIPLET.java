
public class TRIPLET <monType extends Comparable<monType>> {

	private monType valeur1;
	private monType valeur2;
	private monType valeur3;
	
	public TRIPLET(monType maValeur1, monType maValeur2, monType maValeur3) {
		this.valeur1 = maValeur1;
		this.valeur2 = maValeur2;
		this.valeur3 = maValeur3;
	}

	public monType getValeur1() {
		return this.valeur1;
	}
	
	public monType getValeur2() {
		return this.valeur2;
	}
	
	public monType getValeur3() {
		return this.valeur3;
	}
	
	public monType max() {
		monType max = null;
		if ((this.valeur1.compareTo(this.valeur2) > 0) && (this.valeur1.compareTo(this.valeur3) > 0)) {
			max = this.valeur1;
		}
		else {
			if ((this.valeur2.compareTo(this.valeur3) > 0) && (this.valeur2.compareTo(this.valeur1) > 0)) {
				max = this.valeur2;
			}
			else {
				if ((this.valeur3.compareTo(this.valeur1) > 0) && (this.valeur3.compareTo(this.valeur2) > 0)) {
					max = this.valeur3;
				}
			}
		}
		return max;
	}
}
