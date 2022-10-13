package fr.diginamic.banque.entites.copy;

public abstract class Operation {
	
	//ATTRIBUTS
	private String opeDate;
	private double opeMontant;

	//CONSTRUCTEUR
	public Operation(String opeDate, double opeMontant) {
		this.opeDate = opeDate;
		this.opeMontant = opeMontant;
	}

	@Override
	public String toString() {
		return "Operation \n Date : " + opeDate + " | Montant : " + opeMontant + "€ | " + getType();
	}
	
	public abstract String getType();

	public String getOpeDate() {
		return opeDate;
	}

	public void setOpeDate(String opeDate) {
		this.opeDate = opeDate;
	}

	public double getOpeMontant() {
		return opeMontant;
	}

	public void setOpeMontant(double opeMontant) {
		this.opeMontant = opeMontant;
	}
	
}
