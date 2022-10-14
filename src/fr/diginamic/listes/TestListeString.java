package fr.diginamic.listes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class TestListeString {
	
	public static void main(String[] args) {
		//Exercice 4
		List<String> listeVille = new ArrayList<String>();
		listeVille.addAll(Arrays.asList("Nice", "Carcassonne", "Narbonne", "Lyon", "Foix", "Pau", "Marseille", "Tarbes"));
		
		Iterator<String> it = listeVille.iterator();
		
		int maxCaract = 0;
		String villeMaxCaract = "";
		while (it.hasNext()) {
			String u = it.next();
			System.out.println(u + " contient " +u.length() + " caractères");

			if (maxCaract < u.length()) {	
				maxCaract = u.length();
				villeMaxCaract = u;
			}
			
		}
		
		System.out.println(villeMaxCaract + " contient le plus de caractères : " + maxCaract);
		
		for(int i=0;i<listeVille.size();i++) {
            if(listeVille.get(i).charAt(0)=='N') {
            	listeVille.remove(i--);
            }
        }
		System.out.println("Nouvelle liste : " + listeVille);


	}
}
