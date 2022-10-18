package fr.diginamic.fichier;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CreerFichier {

	
	public static void main(String[] args) throws IOException {
		Path pathFile = Paths.get("C:\\Windows\\Temp\\recensement.csv");
		List<String> lines = Files.readAllLines(pathFile, StandardCharsets.UTF_8);
		
		List<String> lines100 = new ArrayList<>();
		
		//Lire les 100 premieres lignes et les copier
		for (int compteur = 0; compteur < 100 ; compteur++) {
			lines100.add(lines.get(compteur));
		}
		
		Path myCopyFile = Paths.get("C:\\Windows\\Temp\\recensement100.csv");
		
		Files.write(myCopyFile, lines100);

	}

}
