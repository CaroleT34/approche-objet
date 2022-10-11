package fr.diginamic.banque;

import fr.diginamic.banque.entites.copy.Compte;

public class TestBanque {

	public static void main(String[] args) {
		Compte Compte1 = new Compte(151515, 200);
		
		//Compte1.afficherCompte();
		
		System.out.println(Compte1.toString());
		
	}

}
