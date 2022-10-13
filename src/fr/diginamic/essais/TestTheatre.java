package fr.diginamic.essais;

import fr.diginamic.entites.Theatre;

public class TestTheatre {

	public static void main(String[] args) {
		int capacitePersonneMax;
		capacitePersonneMax = 200;
		Theatre theatre1 = new Theatre("Leon", capacitePersonneMax, 50, 20);
		int nbClient;
		double prixPlace = 5.5;
		
		for (nbClient = 100; nbClient<capacitePersonneMax; nbClient++) {
			theatre1.inscrire(nbClient, prixPlace);
			
		}
		System.out.println(theatre1.toString());
		
		theatre1.inscrire(80, 10);
		System.out.println(theatre1.toString());
		theatre1.inscrire(20, 5);
		System.out.println(theatre1.toString());
	}

}
