package fr.diginamic.operations;

import java.util.Arrays;
import java.util.Scanner;

public class CalculMoyenne {
	private double[] valeurs = new double[0];
	
	public CalculMoyenne(double[] valeurs) {
		this.valeurs = valeurs;
	}
	
	@Override
	public String toString() {
		return "Moyenne de " + Arrays.toString(valeurs) + " = " + calcul();
	}

	//méthode 
	//Ajoute un double au tableau et gére l’agrandissement du tableau
	@SuppressWarnings("resource")
	public void ajout() {
		Scanner sc = new Scanner (System.in);
		boolean ok = true;
		double nb = 0.0;
		
		int compteur = 0;
		
		while (ok) {
			try {
				compteur ++;
				nb = Double.parseDouble(sc.nextLine());
				
				if(compteur > valeurs.length) {
					double[] newTab = new double[valeurs.length+1];
					for(int i=0; i<valeurs.length; i++) {
						newTab[i]=valeurs[i];
					}
					
					newTab[newTab.length-1] = nb;
					valeurs = newTab;
				}
				
			} catch (NumberFormatException e) {
				ok = false;
				
			}
		}
	}

	//méthode 
	//Retourne la moyenne des éléments du tableau.
	public double calcul() {
		double somme = 0;
		 
		for( double i : valeurs) {
			 somme += i;
		 }
		
		return somme/valeurs.length;
	}
	
	public double[] getValeurs() {
		return valeurs;
	}

	public void setValeurs(double[] valeurs) {
		this.valeurs = valeurs;
	}



}

	
