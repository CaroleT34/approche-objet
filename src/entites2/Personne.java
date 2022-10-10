package entites2;

import entites.AdressePostale;

public class Personne {
	
	public String prenom;
	public String nom;
	public AdressePostale adresse;
	
	public Personne(String prenom, String nom) {
		this.prenom = prenom;
		this.nom = nom;
	}
}
