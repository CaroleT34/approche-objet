package fr.diginamic.entites;

public class Theatre {
	
	private String nom;
	private int capacitePersonneMax;
	private int nbInscrit;
	private double recette;
	
	public Theatre(String nom, int capacitePersonneMax, int nbInscrit, double recette) {
		this.nom = nom;
		this.capacitePersonneMax = capacitePersonneMax;
		this.nbInscrit = nbInscrit;
		this.recette = recette;
	}
	
	public void inscrire(int nbClient, double prixPlace) {
		if (capacitePersonneMax >= (nbInscrit + nbClient)) {
			recette += nbClient*prixPlace;
			nbInscrit += nbClient;
		} else {
			System.err.println("capacité max est atteinte");
		}
		
	}
	
	@Override
	public String toString() {
		return "Theatre nom= " + nom + ", capacitePersonneMax= " + capacitePersonneMax + ", nbInscrit= " + nbInscrit
				+ ", recette= " + recette +"€";
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getCapacitePersonneMax() {
		return capacitePersonneMax;
	}

	public void setCapacitePersonneMax(int capacitePersonneMax) {
		this.capacitePersonneMax = capacitePersonneMax;
	}

	public int getNbInscrit() {
		return nbInscrit;
	}

	public void setNbInscrit(int nbInscrit) {
		this.nbInscrit = nbInscrit;
	}

	public double getRecette() {
		return recette;
	}

	public void setRecette(double recette) {
		this.recette = recette;
	}

	

}
