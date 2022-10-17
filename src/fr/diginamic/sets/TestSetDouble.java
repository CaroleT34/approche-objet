package fr.diginamic.sets;

import java.util.HashMap;
import java.util.Set;

import fr.diginamic.listes.Ville;


public class TestSetDouble {
	
	public static void main(String[] args) {
		HashMap<String,Double> doubles = new HashMap<>();
		doubles.put("a" , 1.50);
		doubles.put("b", 8.25);
		doubles.put("c", -7.32);
		doubles.put("d", 13.3);
		doubles.put("e", -12.45);
		doubles.put("f", 48.5);
		doubles.put("g", 0.01);
		
		Set<String> keys = doubles.keySet();
		
		Double maxValHab = Double.MIN_VALUE;
		Double minValHab = Double.MAX_VALUE;
		String kSupp = "";
		for(String k : keys) {
			System.out.println(doubles.get(k));
			if (maxValHab < doubles.get(k)) {
				maxValHab = doubles.get(k);
				
			}
			
			if (minValHab > doubles.get(k)) {
				minValHab = doubles.get(k);
				kSupp = k;
			}
		}
		
		System.out.println("maxValHab : " + maxValHab);
		System.out.println("kSupp : " + kSupp);
		
		doubles.remove(kSupp);
		
		//Affichage nouveau tableau
		for(Double d : doubles.values()) {
			System.out.println(d);
		}
		
	}
}
