package fr.diginamic.listes;

import java.util.ArrayList;
import java.util.List;

public class FusionListe {

	public static void main(String[] args) {
		//Exercice 2
		List<String> liste1 = new ArrayList<String>();
		liste1.add("Rouge");
		liste1.add("Vert");
		liste1.add("Orange");
		
		List<String> liste2 = new ArrayList<String>();
		liste2.add("Blanc");
		liste2.add("Bleu");
		liste2.add("Orange");
		
		List<String> liste3 = new ArrayList<String>();
		
		//avec boucle
		int size = liste1.size() + liste2.size();
		
		for (int i=0; i <= size; i++) {
			

		}
		
		System.out.println(liste3);
		
		//Sans boucle
		liste3.addAll(liste1);
		liste3.addAll(liste2);
		
		System.out.println(liste3);

	}

}
