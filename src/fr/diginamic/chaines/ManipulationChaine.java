package fr.diginamic.chaines;

import java.util.Arrays;

import fr.diginamic.entites.Salarie;

public class ManipulationChaine {
	private static String chaine = "Durand;Marcel;2 523.5";
	
	
	public static void main(String[] args) {
		//afficher le premier caractère
		char premierCaractere = chaine.charAt(0);
		System.out.println("Premier caractère: " + premierCaractere);
		
		//afficher la longueur de la chaine de caractères
		int longueurChaineCaracteres = chaine.length();
		System.out.println("la longueur de la chaine de caractères: " + longueurChaineCaracteres);
		
		//afficher l’index du premier « ; »
		int premierIndex = chaine.indexOf(';');
		System.out.println("index du premier « ; » est : " + premierIndex);
		
		//Extraire une portion de chaine de caractères
		int start;
		int end;
		start = chaine.indexOf(';') +1;
		end= chaine.indexOf(';') + 7;
		String portionChaine = chaine.substring(start, end);
		System.out.println("Nom de famille en maj : " + portionChaine.toUpperCase());
		System.out.println("Nom de famille en min : " + portionChaine.toLowerCase());
		
		//découper la chaine de caractères en morceaux
		String[] decoupeChaine = chaine.split(";");
	
		for (String word : decoupeChaine) {
			System.out.println("Decoupe chaine : " +  word);
        }
		System.out.println("Decoupe chaine : " +  Arrays.toString(decoupeChaine));
		
		String nom = "";
		String prenom = "";
		String salaire = "";
		for(int i = 0; i <decoupeChaine.length; i++) {
			nom =  decoupeChaine[0];
			prenom =  decoupeChaine[1];
			salaire = decoupeChaine[2];
			
		}

		salaire = salaire.replace(salaire, "2523.5");
		Salarie personne1 = new Salarie(nom,prenom,Double.parseDouble(salaire));
		System.out.println(personne1);
		
	}
}
