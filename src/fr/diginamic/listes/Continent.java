package fr.diginamic.listes;

public enum Continent {

	Europe("Europe"),
	Afrique("Afrique"),
	Amérique("Amérique"),
	Asie("Asie"),
	Océanie ("Océanie"),
	Antarctique("Antarctique");

	private String label;

	private Continent(String label) {
		this.label = label;
	}

	public String getLabel() {
		return label;
	}
	

}
