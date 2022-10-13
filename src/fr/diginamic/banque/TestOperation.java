package fr.diginamic.banque;

import java.text.DecimalFormat;

import fr.diginamic.banque.entites.copy.Credit;
import fr.diginamic.banque.entites.copy.Debit;
import fr.diginamic.banque.entites.copy.Operation;

public class TestOperation {
	
	public double montant;

	public static void main(String[] args) {
		Operation[] operations = new Operation[8];
		operations[0] = new Credit("20/01/2022", 200.01);
		operations[1] = new Credit("10/01/2001", 350.81);
		operations[2] = new Credit("05/04/1996", 410);
		operations[3] = new Credit("12/11/1993", 10.3);
		operations[4] = new Debit("30/01/2022", 602.36);
		operations[5] = new Debit("15/11/1999", 99.99);
		operations[6] = new Debit("25/04/2001", 74.02);
		operations[7] = new Debit("08/06/1993", 1.99);

		double soldeCompte = 0;
		for (int i = 0; i < operations.length; i++) {
			System.out.println(operations[i].toString());
			
			// == pour les types primitifs et méthode equals pour les objets
			if (operations[i].getType().equals("DEBIT")) {
				soldeCompte -= operations[i].getOpeMontant();
			} else {
				soldeCompte += operations[i].getOpeMontant();
			}
		}
		
		DecimalFormat formatter = new DecimalFormat(".00");
		String soldeFormat = formatter.format(soldeCompte);
		
		System.out.println("Votre solde actuel est de "+ soldeFormat +"€");
		
//		for (Operation ope : operations ) {
//			System.out.println(ope);
//		}
	}

}
