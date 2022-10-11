package fr.diginamic.banque.entites.copy;

public class Compte {

	private int numeroCompte;
	private int soldeCompte;
	
	//CONSTRUCTEUR
	public Compte(int numeroCompte, int soldeCompte) {
		this.numeroCompte = numeroCompte;
		this.soldeCompte = soldeCompte;
	}
	
	//METHODES
	@Deprecated
	public void afficherCompte() {
		System.out.println("Compte 1 : \nNuméro de compte : " + numeroCompte + "\nSolde du compte : " + soldeCompte + "€" );
		
	}
	
	//Utile lors de le revue de code (cherche une méthdoe connue)
	public String toString() {
		return "Compte  1 toString: \nNuméro de compte : "+ numeroCompte + "\nSolde du compte : " + soldeCompte + "€" ;
	}

	public int getNumeroCompte() {
		return numeroCompte;
	}

	public int getSoldeCompte() {
		return soldeCompte;
	}

}
