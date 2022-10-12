package fr.diginamic.banque.entites.copy;

public class Compte {

	private int numeroCompte;
	private double soldeCompte;
	
	//CONSTRUCTEUR
	public Compte(int numeroCompte, double soldeCompte) {
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
		return "Compte  1 \n Numéro de compte : "+ numeroCompte + " | Solde du compte : " + soldeCompte + "€" ;
	}

	public void setNumeroCompte(int numeroCompte) {
		this.numeroCompte = numeroCompte;
	}

	public int getNumeroCompte() {
		return numeroCompte;
	}


	public void setSoldeCompte(double soldeCompte) {
		this.soldeCompte = soldeCompte;
	}

	public double getSoldeCompte() {
		return soldeCompte;
	}

}
