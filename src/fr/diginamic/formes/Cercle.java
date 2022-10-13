package fr.diginamic.formes;

public class Cercle extends Forme {
	
	private double rayon;
	static final double PI = Math.PI;
	
	public Cercle(double rayon) {
		this.rayon = rayon;
	}

	@Override
	public double calculerSurface() {
		return PI * rayon * rayon;

	}

	@Override
	public double calculerPerimetre() {
		return PI * 2 * rayon;

	}
	

}
