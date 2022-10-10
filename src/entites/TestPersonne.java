package entites;

import entites2.Personne;

public class TestPersonne {
	
	public static String prenom;
	public static String nom;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Personne Personne1 = new Personne("carole", "toulorge");
		prenom = Personne1.modifPrenom("carole");
		nom = Personne1.modifNom("toulorge");
		
		AdressePostale adresse2 = new AdressePostale(5, "Rue des Jonquilles", 33160, "Saint Médard en Jalles");
		Personne Personne2 = new Personne("Jasmine", "Ali", adresse2);
		prenom = Personne2.modifPrenom("JasmiNE");
		nom = Personne2.modifNom("Ali");

		System.out.println(" Information de la personne 1 : " + prenom + " " + nom);
		System.out.println(" Information de la personne 2 : " + Personne2.prenom + " " + Personne2.nom.toUpperCase() + " " + adresse2);
	}

}
