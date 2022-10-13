package fr.diginamic.utils;

import entites.Cercle;

public class CercleFactory {

	  public static Cercle factoryCercle(double rayon) {
		  return new Cercle(rayon);
	  }
	}