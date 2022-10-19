package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDates {

	public static void main(String[] args) {
	
		Date todayDate = new Date();
		
		//format jour/mois/année (sans la partie heure)
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("Today's date is: "+dateFormat.format(todayDate));
		
		SimpleDateFormat dateFormatBis = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
		 System.out.println("Today's date is: "+dateFormatBis.format(todayDate));
	}

}
