package entites;

public class AdressePostale {
	
	public int numeroRue;
	public String libelleRue;
	public int codePostal;
	public String ville;
	
	//constructeur sans paramètre
//	public AdressePostale() {
//		//contient par exemple une valeur par défaut
//		codePostal = 34070;
//		ville = "Montpellier";
//	}

	//constructeur (seule méthode qui commence par une MAJ)
	public AdressePostale (int numeroRue, String libelleRue, int codePostal, String ville) {
		//this représente l'instance courante, l'objet en cours de construction
		this.numeroRue = numeroRue;
		this.libelleRue = libelleRue;
		this.codePostal = codePostal;
		this.ville = ville;
		
		System.out.println("Affichage dans AdressePostale : " + this.numeroRue);
	}
	
	public String toString() {
		return "n°" + numeroRue + " " + libelleRue + ", " + codePostal
				+ " " + ville;
	}


}
