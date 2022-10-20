package fr.diginamic.listes;


public class Ville implements Comparable<Ville>{

	private String nom;
	private int nbHabitant;
	private Continent label;
	
	public Ville(String nom, int nbHabitant, Continent label) {
		this.nom = nom;
		this.nbHabitant = nbHabitant;
		this.label = label;
	}

	@Override
	public String toString() {
		return "nom=" + nom + ", nbHabitant=" + nbHabitant + ", label=" + label;
	}
	
	@Override
	public boolean equals(Object obj) {
		//Si l'obj n'est pas une Ville je retourne directement false
		if(!(obj instanceof Ville)) {
			return false;
		}
		//Si j'arrive la je sais que obj est une Ville
		Ville other = (Ville) obj;
		return nom.equals(other.getNom()) && nbHabitant == other.nbHabitant; //On convertit obj en Ville via un cast
	}

	public Continent getLabel() {
		return label;
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
