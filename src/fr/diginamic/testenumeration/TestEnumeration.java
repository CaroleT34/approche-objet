package fr.diginamic.testenumeration;

public class TestEnumeration {

	public static void main(String[] args) {
		//Afficahge de toutes les saisons
		Saison[] labels = Saison.values();
		
		for(Saison label : labels) {
			System.out.println(label);
		}
		
		//retrouver et afficher le libellé de l’instance de Saison dont le nom est ETE
		String nom = "Ete";
		
		Saison selection = Saison.valueOf(nom);
		System.out.println(selection);
		
		String label = "HIVER";
		String test = Saison.afficheSaison(label);
		
		System.out.println(test);
	
		
		
		
		
	}

}
