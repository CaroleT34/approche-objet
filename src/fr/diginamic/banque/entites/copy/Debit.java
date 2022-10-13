package fr.diginamic.banque.entites.copy;

public class Debit extends Operation{

	public Debit(String opeDate, double opeMontant) {
		super(opeDate, opeMontant);
	}
	
	@Override
	public String getType() {
		String type = "DEBIT";
		return type;
	}

 
}
