package fr.diginamic.maps;

public class CreationMap {

	private String nom;
	private int salaire;
	
	public CreationMap(String nom, int salaire) {
		this.nom = nom;
		this.salaire = salaire;
	}
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getSalaire() {
		return salaire;
	}
	public void setSalaire(int salaire) {
		this.salaire = salaire;
	}
	
	
}
