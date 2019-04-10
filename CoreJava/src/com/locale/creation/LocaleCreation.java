package com.locale.creation;

import java.util.Locale;

public class LocaleCreation {

	public static void main(String[] args)
	{
	/*	Locale locale = new Locale("pa", "IN");
		String language = locale.getLanguage();
		System.out.println(language);*/
		
		Locale locale = new Locale("pa", "IN");
//		Locale locale = Locale.getDefault();
		System.out.println(locale.getLanguage());
		System.out.println(locale.getCountry());
		System.out.println(locale.getDisplayCountry()+" "+locale.getDisplayLanguage());
		String[] isoCountries = Locale.getISOCountries();
		int count=0;
		for(String string : isoCountries )
		{
			System.out.println(string);
			count++;
		}
		int lang = 0;
		String[] isoLanguages = Locale.getISOLanguages();
		for(String string : isoLanguages)
		{
			System.out.println(string);
			lang++;
		}
		System.out.println(count+" "+lang);
	}
}
