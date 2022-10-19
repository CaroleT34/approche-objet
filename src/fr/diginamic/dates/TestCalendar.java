package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class TestCalendar {

	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance(); 
		
		calendar.set(2016, 4, 19, 23, 59, 30);
		SimpleDateFormat format1 = new SimpleDateFormat("dd-MM-yyyy");
		String formatted = format1.format(calendar.getTime());
		System.out.println(formatted);
		
		Calendar calToday = Calendar.getInstance();
		
		SimpleDateFormat format2 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		String formatted2 = format2.format(calToday.getTime());
		System.out.println(formatted2);
		
		//Anglais
		SimpleDateFormat format3 = new SimpleDateFormat("'Le' EEEE dd MMM yyyy 'à' HH:mm:ss", Locale.ENGLISH);
		String formatted3 = format3.format(calToday.getTime());
		System.out.println(formatted3);
		
		//Francais
		SimpleDateFormat format4 = new SimpleDateFormat("'Le' EEEE dd MMM yyyy 'à' HH:mm:ss", Locale.FRENCH);
		String formatted4 = format4.format(calToday.getTime());
		System.out.println(formatted4);
		
		//Russe
		SimpleDateFormat format5 = new SimpleDateFormat("'Le' EEEE dd MMM yyyy 'à' HH:mm:ss", new Locale("ru", "RU"));
		String formatted5 = format5.format(calToday.getTime());
		System.out.println(formatted5);
		
		//Chinois
		SimpleDateFormat format6 = new SimpleDateFormat("'Le' EEEE dd MMM yyyy 'à' HH:mm:ss", Locale.CHINESE);
		String formatted6 = format6.format(calToday.getTime());
		System.out.println(formatted6);
		
		//Allemand
		SimpleDateFormat format7 = new SimpleDateFormat("'Le' EEEE dd MMM yyyy 'à' HH:mm:ss", Locale.GERMAN);
		String formatted7 = format7.format(calToday.getTime());
		System.out.println(formatted7);
		
	
	}

}
