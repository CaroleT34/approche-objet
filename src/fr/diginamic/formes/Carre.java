package fr.diginamic.formes;

public class Carre extends Rectangle {

	public Carre(double longueur) {
		super(longueur, longueur);
	}
	
	@Override
	public double calculerSurface() {
		return longueur * longueur;
	}

	@Override
	public double calculerPerimetre() {
		return longueur * 4;
	}

}
