
public class CERCLE implements INTERFACE_FIGURE {
	private double rayon;

	public CERCLE(double monRayon) {
		this.rayon = monRayon;
	}

	public double perimetre() {
		double perimetre = 0;
		perimetre = 2 * 3.14 * this.rayon;
		return perimetre;
	}

	public double getRayon() {
		return this.rayon;
	}

	public void setRayon(double monRayon) {
		this.rayon = monRayon;
	}
}
