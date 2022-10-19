package fr.diginamic.listes;

public class TestEquals {

	public static void main(String[] args) {
		Ville ville1 = new Ville ("Fanfan", 1200);
		Ville ville2 = new Ville ("Fanfan", 1200);
		boolean response = false;
		
		System.out.println(ville1.equals(ville2));
		
		if(ville1.getNom() == ville2.getNom()) {
			response = true;
			System.out.println(response);
		} else {
			response = false;
			System.out.println(response);
		}
		
		ville1 = new Ville ("Fanfan", 1200);
		ville2 = new Ville ("LaTulipe", 1200);
		
		System.out.println(ville1.equals(ville2));
		
		if(ville1 == ville2) {
			response = true;
			System.out.println(response);
		} else {
			response = false;
			System.out.println(response);
		}
		
		//Comment faire pour que la comparaison de 2 villes avec l’opérateur == retourne true.
		//Diff getNom ou getNbHabitant

	}

}
