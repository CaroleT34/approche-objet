package fr.diginamic.listes;

import java.util.ArrayList;

public class TestVille {

public static void main(String[] args) {
		
		ArrayList<Ville> listVilles = new ArrayList<Ville>();
        listVilles.add(new Ville("Nice", 343000));
        listVilles.add(new Ville("Carcasonne", 47800));
        listVilles.add(new Ville("Narbonne", 53400));
        listVilles.add(new Ville("Lyon", 484000));
        listVilles.add(new Ville("Foix", 9700));
        listVilles.add(new Ville("Pau", 77200));
        listVilles.add(new Ville("Marseille", 850700));
        listVilles.add(new Ville("Tarbes", 40600));
        
        //Recherchez et affichez la ville la plus peuplée
        int initHabitantMax = 0;
        String villeMax = "";
        Ville ville = null;
        int initHabitantMin = 0;
        String villeMin = "";
        ArrayList<Ville> listVilleMaj = new ArrayList<Ville>();
        int index = 0;
		for (int i=0; i < listVilles.size(); i++) {
			ville = listVilles.get(i);
			if((i==0)|| (ville.getNbHabitant() > initHabitantMax)) {
				villeMax = ville.getNom();
				initHabitantMax = ville.getNbHabitant();
				
			} 
			
			if((i==0)|| (ville.getNbHabitant() < initHabitantMin)) {
				villeMin = ville.getNom();
				initHabitantMin = ville.getNbHabitant();
				index = i;
		
			} 
			
			if(ville.getNbHabitant() > 100000) {
				//listVilles.get(i).getNom().toUpperCase();
				listVilleMaj.add(new Ville(ville.getNom().toUpperCase(), ville.getNbHabitant() ));
			} else {
				listVilleMaj.add(new Ville(ville.getNom(), ville.getNbHabitant()));
				
			}
			
			
		}
		
		listVilles.remove(index);
		
		System.out.println("la ville la plus peuplée est " + villeMax + " avec " + initHabitantMax + " habitants");
		
		System.out.println("la ville la moins peuplée est " + villeMin + " avec " + initHabitantMin + " habitants");
		
		System.out.println("Nouveau tableau sans " + villeMin + " : "+ listVilles);
		
		System.out.println("Nouveau tableau : " + listVilleMaj );
		
		
	}
}
