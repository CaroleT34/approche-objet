package fr.diginamic.banque;

import fr.diginamic.banque.entites.copy.Compte;
import fr.diginamic.banque.entites.copy.CompteTaux;

public class TestBanque {

	public static void main(String[] args) {
		Compte Compte1 = new Compte(151515, 200);
		
		//Compte1.afficherCompte();
		System.out.println(Compte1.toString());
		
		Compte[] cpts = new Compte[2];
		cpts[0] = new Compte(10101010, 9);
		cpts[1] = new CompteTaux(1595656, 5583, 20);
		
		for (int i = 0; i < 2; i++) {
			System.out.println(cpts[i].toString());
		}
		
		
	}

}
