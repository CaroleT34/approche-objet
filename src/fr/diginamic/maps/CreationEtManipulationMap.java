package fr.diginamic.maps;

import java.util.HashMap;
import java.util.Set;

public class CreationEtManipulationMap {

	public static void main(String[] args) {
		
		HashMap<Integer, String> mapVilles = new HashMap<>();
		mapVilles.put(13, "Marseille");
		mapVilles.put(34, "Montpellier");
		mapVilles.put(44, "Nantes");
		mapVilles.put(75, "Paris");
		mapVilles.put(31, "Toulouse");
		
		mapVilles.put(59, "Lille,");
		mapVilles.put(69, "Lyon");
		mapVilles.put(33, "Bordeaux");
		
		Set<Integer> keys = mapVilles.keySet();
		for(Integer k : keys) {
			String ville = mapVilles.get(k);
			System.out.println(k + " --> " + ville);
		}
		
		System.out.println("taille de la mapVille : " + mapVilles.size());
	}

}
