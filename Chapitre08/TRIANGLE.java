
public class TRIANGLE implements INTERFACE_FIGURE {
	private double cote1;
	private double cote2;
	private double cote3;

	public TRIANGLE(double monCote1, double monCote2, double monCote3) {
		this.setCote1(monCote1);
		this.setCote2(monCote2);
		this.setCote3(monCote3);
	}

	public double perimetre() {
		double perimetre = 0;
		perimetre = this.cote1 + this.cote2 + this.cote3;
		return perimetre;
	}

	public double getCote1() {
		return this.cote1;
	}

	public void setCote1(double cote1) {
		this.cote1 = cote1;
	}

	public double getCote2() {
		return this.cote2;
	}

	public void setCote2(double cote2) {
		this.cote2 = cote2;
	}

	public double getCote3() {
		return this.cote3;
	}

	public void setCote3(double cote3) {
		this.cote3 = cote3;
	}

	
}