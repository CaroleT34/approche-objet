package fr.diginamic.fichier;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class LectureFichier {
	public static void main(String[] args) throws IOException {
		
		ArrayList<Ville> listVilles = new ArrayList<Ville>();
		String codeDep = "";
		String region = "";
		String nom = "";
		int population = 0;
		
		Path pathFile = Paths.get("C:\\Windows\\Temp\\recensement.csv");
		List<String> lines = Files.readAllLines(pathFile, StandardCharsets.UTF_8);
	
		for (String l : lines) {
			System.out.println(l);  
		     
		}
        
		Path myCopyFile = Paths.get("C:\\Windows\\Temp\\recensement25000.csv");
		List<String> lines25000 =  new ArrayList<>();
		lines25000.add("Nom; Code Département; Nom de la Région; Population totale");
		for (int i = 1; i < lines.size(); i++) {
			String[] tab = lines.get(i).split(";");
			codeDep = tab[0];
			region = tab[1];
			nom = tab[6];
			population = Integer.parseInt(tab[9].replaceAll(" ", ""));
			listVilles.add(new Ville(nom, codeDep, region, population));
			System.out.println(listVilles.get(i-1));
			
			if (25000 < population) {
				lines25000.add(nom + "; "+ codeDep + "; "+ region + "; "+ population);
			}
		}
		
		Files.write(myCopyFile, lines25000);
	
		
		
		

	}
}
