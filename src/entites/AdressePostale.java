package entites;

public class AdressePostale {
	
	//Mettre les variables d'instance en privé
	private int numeroRue;
	private String libelleRue;
	private int codePostal;
	private String ville;
	
	//Variable de classe (i.e. staic) = Valeur partagée
	//Laisser en public
	public static String pays = "FRANCE";

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
		return "n°" + numeroRue + " " + libelleRue + ", " + codePostal + " " + ville;
	}


}
