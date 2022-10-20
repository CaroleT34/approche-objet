package fr.diginamic.testenumeration;

public enum Saison {

	Hiver("Hiver", 1),
	Printemps("Printemps", 2),
	Ete("Ete", 3),
	Automne("Automne",4);
	
	private String label;
	private int num;
	
	private Saison(String label, int num) {
		this.label = label;
		this.num = num;
	}

	public String getLabel() {
		return label;
	}

	public int getNum() {
		return num;
	}
	
	public static String afficheSaison(String label) {
		label = label.substring(0, 1).toUpperCase() + label.substring(1).toLowerCase();
		if (label.equals("Hiver")) {
			return label;
		} else if (label.equals("Printemps")){
			return label;
		}else if (label.equals("Ete")){
			return label;
		}else if (label.equals("Automne")){
			return label;
		}
		return "Saison non conforme : " + label + " non attendu";
	}
	

	
}
