package com.anurag.comparableAndComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *  * @author Anurag
 *      Concept:-This program is showing how to use Comparator interface during sorting.
 *
 */
public class ComparatorMain {

	public static void main(String[] args) {
		 Country indiaCountry=new Country(1, "India");
		 Country chinaCountry=new Country(4, "China");
		 Country nepalCountry=new Country(3, "Nepal");
		 Country bhutanCountry=new Country(2, "Bhutan");

	        List<Country> listOfCountries = new ArrayList<Country>();
	        listOfCountries.add(indiaCountry);
	        listOfCountries.add(chinaCountry);
	        listOfCountries.add(nepalCountry);
	        listOfCountries.add(bhutanCountry);

	        System.out.println("Before Sort by id : ");
	        for (int i = 0; i < listOfCountries.size(); i++) {
				Country country=(Country) listOfCountries.get(i);
				System.out.println("Country Id: "+country.getCountryId()+"||"+"Country name: "+country.getCountryName());
			}
	        Collections.sort(listOfCountries,new CountrySortByIdComparator());

	        System.out.println("After Sort by id: ");
	        for (int i = 0; i < listOfCountries.size(); i++) {
				Country country=(Country) listOfCountries.get(i);
				System.out.println("Country Id: "+country.getCountryId()+"|| "+"Country name: "+country.getCountryName());
			}

	        //Sort by countryName
	        Collections.sort(listOfCountries,new Comparator<Country>() {

				@Override
				public int compare(Country o1, Country o2) {
					return o1.getCountryName().compareTo(o2.getCountryName());
				}
			});

			System.out.println("After Sort by name: ");
	        for (int i = 0; i < listOfCountries.size(); i++) {
				Country country=(Country) listOfCountries.get(i);
				System.out.println("Country Id: "+country.getCountryId()+"|| "+"Country name: "+country.getCountryName());
			}
	}

}
/*
Output:-

Before Sort by id : 
Country Id: 1||Country name: India
Country Id: 4||Country name: China
Country Id: 3||Country name: Nepal
Country Id: 2||Country name: Bhutan
After Sort by id: 
Country Id: 1|| Country name: India
Country Id: 2|| Country name: Bhutan
Country Id: 3|| Country name: Nepal
Country Id: 4|| Country name: China
After Sort by name: 
Country Id: 2|| Country name: Bhutan
Country Id: 4|| Country name: China
Country Id: 1|| Country name: India
Country Id: 3|| Country name: Nepal
*/