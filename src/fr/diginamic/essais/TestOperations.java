package fr.diginamic.essais;

import fr.diginamic.operations.Operations;

public class TestOperations {

	public static void main(String[] args) {
		Operations[] operations = new Operations[4];
		operations[0] = new Operations(10, 2, '/');
		operations[1] = new Operations(10, 2, '*');
		operations[2] = new Operations(10, 2, '-');
		operations[3] = new Operations(10, 2, '+');
		
		
		for (int i = 0; i < operations.length; i++) {
			System.out.println(operations[i].affichageResult());
		}

	}

}
