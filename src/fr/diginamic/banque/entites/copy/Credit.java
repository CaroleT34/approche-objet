package fr.diginamic.banque.entites.copy;

public class Credit extends Operation {

	public Credit(String opeDate, double opeMontant) {
		super(opeDate, opeMontant);
	}

	@Override
	public String getType() {
		String type = "CREDIT";
		return type;
	}

}
