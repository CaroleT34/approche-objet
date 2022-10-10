package entites;

import entites2.Personne;

public class TestPersonne {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Personne Personne1 = new Personne();
		Personne1.nom = "Toto";
		Personne1.prenom = "Tata";
		Personne1.adresse = new AdressePostale();
		Personne1.adresse.numeroRue = 5;
		Personne1.adresse.libelleRue = "Rue des Jonquilles" ;
		Personne1.adresse.codePostal = 33160;
		Personne1.adresse.ville = "Saint Médard en Jalles";

		
		
	}

}
