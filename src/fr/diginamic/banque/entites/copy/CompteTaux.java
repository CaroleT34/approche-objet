package fr.diginamic.banque.entites.copy;

public class CompteTaux extends Compte {

	private int tauxRem;
	
	public CompteTaux(int numeroCompte, int soldeCompte, int tauxRem) {
		super(numeroCompte, soldeCompte);
		this.tauxRem = tauxRem;
	}

	public String toString() {
		return "CompteTaux \ntauxRem = " + tauxRem + "%\n" + super.toString();
	}

}
