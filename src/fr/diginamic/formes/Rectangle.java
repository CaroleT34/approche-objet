package fr.diginamic.formes;

public class Rectangle extends Forme {

	protected double longueur;
	private double largeur;
	
	public Rectangle(double longueur, double largeur) {
		this.longueur = longueur;
		this.largeur = largeur;
	}

	@Override
	public double calculerSurface() {
		return longueur * largeur;
	}

	@Override
	public double calculerPerimetre() {
		return (longueur + largeur) * 2;
	}

}
