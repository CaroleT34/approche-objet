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
		int a = Integer.MAX_VALUE; // maxVal
        int b = Integer.MIN_VALUE; // minVal
       
        int array[] = {51, 24, 19, 5, 37, 76, 61, 99, 101, 36};
  
//        for (int nombre:array)
//        	System.out.print(nombre+" ");
  
        for(int i = 0; i < array.length; i++){
        	if(array[i] < a)
        		a = array[i];
        	if(array[i] > b)
        		b = array[i];
        }
  
       System.out.print("Valeur minimale = " + a);
       System.out.print("\nValeur maximale = " + b);

	}

}
