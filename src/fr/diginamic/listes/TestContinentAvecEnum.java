package fr.diginamic.listes;

import java.util.ArrayList;

public class TestContinentAvecEnum {

	public static void main(String[] args) {
		ArrayList<Ville> listVilles = new ArrayList<Ville>();
        listVilles.add(new Ville("New York", 343000, Continent.Amérique));
        listVilles.add(new Ville("Paris", 47800, Continent.Europe));
        listVilles.add(new Ville("Pékin", 343000, Continent.Asie));
        listVilles.add(new Ville("Moscou", 343000, Continent.Asie));
        listVilles.add(new Ville("Berlin", 343000, Continent.Europe));
        listVilles.add(new Ville("Sao Paulo", 343000, Continent.Amérique));
        listVilles.add(new Ville("Dakar", 343000, Continent.Afrique));
        
        for (Ville ville : listVilles) {
        	System.out.println(ville.toString());
        }
        
	}

}
