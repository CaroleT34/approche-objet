package fr.diginamic.banque.entites.copy;

public class CompteTaux extends Compte {

	private double tauxRem;
	
	public CompteTaux(int numeroCompte, double soldeCompte, double tauxRem) {
		super(numeroCompte, soldeCompte);
		this.tauxRem = tauxRem;
	}

	@Override
	public String toString() {
		return super.toString() + " | Taux rémunération : " + tauxRem + "%";
	}

}
