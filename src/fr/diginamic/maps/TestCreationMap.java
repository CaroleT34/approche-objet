package fr.diginamic.maps;

import java.util.HashMap;

public class TestCreationMap {

	public static void main(String[] args) {

		//Création de la Map
		HashMap<String, Integer> mapSalaires = new HashMap<>();
		
		//Alimentation de la map avec la méthode put
		mapSalaires.put("Paul", 1750);
		mapSalaires.put("Hicham", 1825);
		mapSalaires.put("Yu",  2250);
		mapSalaires.put("Ingrid", 2015);
		mapSalaires.put("Chantal", 2418);
		
//		mapSalaires.put("Paul", new CreationMap("Paul", 1750));
//		mapSalaires.put("Hicham", new CreationMap("Hicham", 1825));
//		mapSalaires.put("Yu", new CreationMap("Yu", 2250));
//		mapSalaires.put("Ingrid", new CreationMap("Ingrid", 2015));
//		mapSalaires.put("Chantal", new CreationMap("Chantal", 2418));

		
		System.out.println("taille de la mapSalaires : " + mapSalaires.size());
	
	}

}
