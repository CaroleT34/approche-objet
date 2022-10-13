package fr.diginamic.essais;

import fr.diginamic.operations.CalculMoyenne;

public class TestMoyenne {
	public static void main(String[] args) {
		
		//TEST 1
		double[] array1 = {11.0,2.0,30.0,20,89.5};
		CalculMoyenne moyenne1 = new CalculMoyenne(array1);
		System.out.println(moyenne1.toString());
		
		//TEST 2
		double[] array2 = {10.0,5.0,7.5};
		CalculMoyenne moyenne2 = new CalculMoyenne(array2);
		System.out.println(moyenne2.toString());

	}
}
