package entites2;

import entites.AdressePostale;

public class Personne {
	
	//ATTRIBUT D'INSTANCE
	private String prenom;
	private String nom;
	private AdressePostale adresse;
	
	//CONSTRUCTEUR
	public Personne(String prenom, String nom) {
		this.prenom = prenom;
		this.nom = nom;
		
	}
	
	public Personne(String prenom, String nom, AdressePostale adresse) {
		this.prenom = prenom;
		this.nom = nom;
		this.adresse = adresse;
		
	}
	
	//METHODES
	//Afficher nom et prenom
	public void afficherIdentite() {
		if (adresse ==null) {
			System.out.println(" Identité : " + prenom.substring(0, 1).toUpperCase()+ "" + prenom.substring(1).toLowerCase() + " " + nom.toUpperCase());
		} else {
			System.out.println(" Identité : " + prenom.substring(0, 1).toUpperCase()+ "" + prenom.substring(1).toLowerCase() + " " + nom.toUpperCase() + " " + adresse);
		}
	}
	
	//GETTER retourne un résultat
	// 1 par Attribut d'instance
	//NOM
	public String getNom(String nom) {
		return nom;
	}
	
	//PRENOM
	public String getPrenom(String prenom) {
		return prenom;
	}
	
	//ADRESSE
	public AdressePostale getAdresse(AdressePostale adresse) {
		return adresse;
	}
	
	//Setteur modifie un résultat
	// 1 par Attribut d'instance
	//NOM
	public void setNom(String nom) {
		this.nom = nom ;
	}
	
	//PRENOM
	public void setPrenom(String prenom) {
		this.prenom = prenom ;
	}
	
	//ADRESSE
	public void setAdresse(AdressePostale adresse) {
		this.adresse = adresse ;
	}
		
	
	
	
	
	
}
