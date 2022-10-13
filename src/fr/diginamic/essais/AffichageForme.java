package fr.diginamic.essais;

import fr.diginamic.formes.Cercle;
import fr.diginamic.formes.Carre;
import fr.diginamic.formes.Forme;
import fr.diginamic.formes.Rectangle;

public class AffichageForme {
	
	

	public static void main(String[] args) {
		Forme[] formes = new Forme[3];
		formes[0] = new Cercle(5);
		formes[1] = new Rectangle(3,5);
		formes[2] = new Carre(4);
		
		for (int i = 0; i < formes.length; i++) {
			System.out.println("Surface :" + formes[i].calculerSurface());
			System.out.println("Perimetre :" +formes[i].calculerPerimetre());

		}
	}

}
