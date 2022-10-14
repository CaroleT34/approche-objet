package fr.diginamic.listes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestListeInt {
	

	public static void main(String[] args) {
		//Exercice 3
		List<Integer> liste1 = new ArrayList<Integer>();
		liste1.addAll(Arrays.asList(-1, 5, 7, 3, -2, 4, 8, 5));

		System.out.println(liste1);
		System.out.println("taille de la liste : " + liste1.size());
		
		//Affiche valeur 
//		Iterator<Integer> it = liste1.iterator();
//		
//		while (it.hasNext()) {
//			Integer u = it.next();
//			System.out.println(u);
//		}
		
		int maxVal = 0;
		for (int i=0; i < liste1.size(); i++) {
			if ((i==0)|| (maxVal < liste1.get(i)) ){
				maxVal = liste1.get(i);
			} 
		}	
		System.out.println("Valeur max : " + maxVal);
		
		int minVal = 0;
		for (int i=0; i < liste1.size(); i++) {
			if ((i==0)|| (minVal > liste1.get(i)) ){
				minVal = liste1.get(i);
			} 
		}	
		
		liste1.remove(new Integer(minVal));
		
		System.out.println("Valeur min est : " + minVal + " et le résultat du tableau sans cet élément est : " + liste1);
		

		List<Integer> listeStrictPos = new ArrayList<Integer>();
		listeStrictPos.addAll(Arrays.asList(-1, 5, 7, 3, -2, 4, 8, 5));
		for (int i=0; i < listeStrictPos.size(); i++) {
			if (listeStrictPos.get(i) < 0){
				listeStrictPos.set(i, -listeStrictPos.get(i));
			} 
		}	
		
		System.out.println(listeStrictPos);

	}
}
