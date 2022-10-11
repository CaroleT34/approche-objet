package utils;

public class TestMethodeStatic {

	public static void main(String[] args) {
		
		//Première partie de l'exo
		String chaine = "12";
		
		try{
            int nombre = Integer.parseInt(chaine);
            System.out.println(nombre); // sortie = 12
        }
        catch (NumberFormatException ex){
            ex.printStackTrace();
        }
		
		//Deuxième partie de l'exo
		int a = 15;
		int b =21;
		
		int result = Integer.max(a,b);
		System.out.print("Valeur max entre a = " + a + " et b = " + b + " est " + result);
		
		//Autre exo sympa
		int maxVal = Integer.MAX_VALUE;
        int minVal = Integer.MIN_VALUE; 
       
        int array[] = {51, 24, 19, 5, 37, 76, 61, 99, 101, 36};
  
//        for (int nombre:array)
//        	System.out.print(nombre+" ");
  
        for(int i = 0; i < array.length; i++){
        	if(array[i] < maxVal)
        		maxVal = array[i];
        	if(array[i] > minVal)
        		minVal = array[i];
        }
  
       System.out.print("\nValeur minimale = " + maxVal);
       System.out.print("\nValeur maximale = " + minVal);

	}

}
