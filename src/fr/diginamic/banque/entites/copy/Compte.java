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
	//Afficher nom et prenom
	public void afficherCompte() {
		System.out.println("Compte 1 : \nNuméro de compte : " + numeroCompte + "\nSolde du compte : " + soldeCompte + "€" );
		
	}

	public int getNumeroCompte() {
		return numeroCompte;
	}

	public void setNumeroCompte(int numeroCompte) {
		this.numeroCompte = numeroCompte;
	}

	public int getSoldeCompte() {
		return soldeCompte;
	}

	public void setSoldeCompte(int soldeCompte) {
		this.soldeCompte = soldeCompte;
	}

}
