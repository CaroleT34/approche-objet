package entites;

import entites2.Personne;

public class TestPersonne {

	public static void main(String[] args) {
		AdressePostale adresse2 = new AdressePostale(5, "Rue des Jonquilles", 33160, "Saint Médard en Jalles");
		
		Personne Personne1 = new Personne("carole", "toulorge");
		Personne Personne2 = new Personne("Jasmine", "Ali", adresse2);
		
		Personne1.afficherIdentite();
		Personne2.afficherIdentite();
		
		Personne1.setNom("Jolly");
		Personne2.setPrenom("aBou");
		
		Personne1.afficherIdentite();
		Personne2.afficherIdentite();

	}

}
