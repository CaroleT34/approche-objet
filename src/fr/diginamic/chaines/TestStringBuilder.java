package fr.diginamic.chaines;

public class TestStringBuilder {
	public static void main(String[] args) {
		
		long debut = System.currentTimeMillis(); // Code à chronométrer 
		
		StringBuilder builder = new StringBuilder();
		for (int i = 1; i <= 100000; i++) {
			builder = builder.append(i);
		}
		
		//System.out.println(builder);
		long fin = System.currentTimeMillis(); 
		
		System.out.println("Temps écoulé en millisecondes :" + (fin - debut));
		
		long debutTest = System.currentTimeMillis(); // Code à chronométrer 
		
		String test = "";
		for (int i = 1; i <= 100000; i++) {
			test += i;
		}
		
		//System.out.println(builder);
		long finTest = System.currentTimeMillis(); 
		
		System.out.println("Temps écoulé en millisecondes :" + (finTest - debutTest));
	}
}
