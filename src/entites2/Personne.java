package entites2;

import entites.AdressePostale;

public class Personne {
	
	public String prenom;
	public String nom;
	public AdressePostale adresse;
	
	//Modif le nom
	public String modifNom(String nom) {
		
		return nom.toUpperCase();
	}
	
	//Modif le prenom
	public String modifPrenom(String prenom) {
		
		return prenom.substring(0, 1).toUpperCase()+ "" + prenom.substring(1).toLowerCase();
	}
	
	//constructeur
	public Personne(String prenom, String nom) {
		this.prenom = prenom;
		this.nom = nom;
		
		System.out.println(" Information : " + modifPrenom(prenom) + " " + modifNom(nom));
		
	}
	
	//constructeur
		public Personne(String prenom, String nom, AdressePostale adresse) {
			this.prenom = prenom;
			this.nom = nom;
			this.adresse = adresse;
			
			System.out.println(" Information : " + modifPrenom(prenom) + " " + modifNom(nom) + " " + adresse);
			
		}
	
	
}
