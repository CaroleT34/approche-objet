package fr.diginamic.listes;


public class Ville implements Comparable<Ville>{
 
	private String nom;
	private int nbHabitant;
	
	

	public Ville(String nom, int nbHabitant) {
		this.setNom(nom);
		this.setNbHabitant(nbHabitant);
	}

	@Override
	public String toString() {
		return "nom=" + nom + ", nbHabitant=" + nbHabitant;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getNbHabitant() {
		return nbHabitant;
	}

	public void setNbHabitant(int nbHabitant) {
		this.nbHabitant = nbHabitant;
	}

//	public int compareTo(Ville ville2) {
//		int resultat = this.nom.compareTo(ville2.getNom());
//		return resultat;
//	}
	
	public int compareTo(Ville autre) {
		if (this.getNbHabitant() > autre.getNbHabitant()) {
			return 1;
		}
		if (this.getNbHabitant() < autre.getNbHabitant()) {
			return -1;
		}
		return 0;
	}
	
	
}
