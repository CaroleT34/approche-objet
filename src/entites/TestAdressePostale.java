package entites;

public class TestAdressePostale {

	public static void main(String[] args) {
		
		
		AdressePostale AdressePostale1 = new AdressePostale();
		AdressePostale1.numeroRue = 5;
		AdressePostale1.libelleRue = "Rue des Jonquilles";
		AdressePostale1.codePostal = 33160;
		AdressePostale1.ville = "Saint Médard en Jalles";
		
		AdressePostale AdressePostale2 = new AdressePostale();
		AdressePostale2.numeroRue = 56;
		AdressePostale2.libelleRue = "Impasse du tennis";
		AdressePostale2.codePostal = 34070;
		AdressePostale2.ville = "Montpellier";
		
	}

}
