package fr.diginamic.maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

import fr.diginamic.listes.Ville;

public class MapVilles {

	public static void main(String[] args) {
		Ville[] villes = new Ville[8];
		villes[0] = new Ville("Nice", 343000);
		villes[1] = new Ville("Carcasonne", 47800);
		villes[2] = new Ville("Narbonne", 53400);
		villes[3] = new Ville("Lyon", 484000);
		villes[4] = new Ville("Foix", 9700);
		villes[5] = new Ville("Pau", 77200);
		villes[6] = new Ville("Marseille", 850700);
		villes[7] = new Ville("Tarbes", 40600);
		
		
		HashMap<String, Ville> mapVilles = new HashMap<>();
//		for (Ville v : villes) {
//			mapVilles.put(v.getNom(), v);
//		}
		mapVilles.put("Nice", villes[0]);
		mapVilles.put("Carcasonne", villes[1]);
		mapVilles.put("Narbonne", villes[2]);
		mapVilles.put("Lyon", villes[3]);
		mapVilles.put("Foix", villes[4]);
		mapVilles.put("Pau", villes[5]);
		mapVilles.put("Marseille", villes[6]);
		mapVilles.put("Tarbes", villes[7]);
		
		int minValHab = Integer.MAX_VALUE;
		String nomVille = "";
		//System.out.println(minValHab);
		Set<String> keys = mapVilles.keySet();
		int i = 0;
		for(String k : keys) {
			villes[i] = mapVilles.get(k);
			if (villes[i].getNbHabitant() < minValHab) {
				minValHab = villes[i].getNbHabitant();
				villes[i] = mapVilles.get(k);
				nomVille = villes[i].getNom();
				//System.out.println(villes[i]);
			}
			i++;
		}
		System.out.println(nomVille);
		
		//Supprimer la ville la moins peuplée
		mapVilles.remove(nomVille);
		
		//Affichage nouveaux tableaux
		for(Ville v : mapVilles.values()) {
			System.out.println(v);
		}
		
//		Collection<Ville> villesModif = mapVilles.values();
//		Iterator<Ville> iterator = villesModif.iterator();
//		
//		while (iterator.hasNext()) {
//			Ville ville = iterator.next();
//			System.out.println(ville);
//		}
		
		

	}

}
