package entites;

public class Cercle {

	private double rayon;
	static final double PI = Math.PI;
	
	public Cercle(double rayon) {
		this.rayon = rayon;
	}
	
	//METHODES
	public double perimCercle() {
		return PI * 2 * rayon;
	}
	
	public double surfaceCercle() {
		return PI * rayon * rayon;
	}

	@Override
	public String toString() {
		return " -- Cercle --\nPérimètre : " + perimCercle() + " || Surface : " + surfaceCercle();
	}

	public double getRayon() {
		return rayon;
	}

	public void setRayon(double rayon) {
		this.rayon = rayon;
	}

}
