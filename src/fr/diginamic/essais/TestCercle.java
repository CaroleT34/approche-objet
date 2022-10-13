package fr.diginamic.essais;

import entites.Cercle;
import fr.diginamic.utils.CercleFactory;

public class TestCercle {

	public static void main(String[] args) {
		Cercle[] figures = new Cercle[2];
		
		figures[0] = new Cercle(2);
		figures[1] = new Cercle(8);
		
		for(Cercle fig : figures) {
			System.out.println(fig);
		}
		
		Cercle cercle1 = CercleFactory.factoryCercle(5);
		Cercle cercle2 = CercleFactory.factoryCercle(10);
		System.out.println("CercleFactory \n" + cercle1);
		System.out.println("CercleFactory \n" + cercle2);

	}

}
