package com.anurag.comparableAndComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 
 * @author Anurag
 * 
 *      Concept:- This program is showing if you are using your own class during sorting then 
 *                you have to implement comparable interface.otherwise compile time error will
 *                come. All wrapper class implementing comparable Interface.
 *
 */
public class ComparableMain {

	public static void main(String[] args) {
		CountryForComparable indiaCountryForComparable = new CountryForComparable(1, "India");
		CountryForComparable chinaCountryForComparable = new CountryForComparable(4, "China");
		CountryForComparable nepalCountryForComparable = new CountryForComparable(3, "Nepal");
		CountryForComparable bhutanCountryForComparable = new CountryForComparable(2, "Bhutan");

		List<CountryForComparable> listOfCountries = new ArrayList<CountryForComparable>();
		listOfCountries.add(indiaCountryForComparable);
		listOfCountries.add(chinaCountryForComparable);
		listOfCountries.add(nepalCountryForComparable);
		listOfCountries.add(bhutanCountryForComparable);

		System.out.println("Before Sort  : ");
		for (int i = 0; i < listOfCountries.size(); i++) {
			CountryForComparable CountryForComparable = (CountryForComparable) listOfCountries.get(i);
			System.out.println("CountryForComparable Id: " + CountryForComparable.getCountryId() + "||"
					+ "CountryForComparable name: " + CountryForComparable.getCountryName());
		}
		Collections.sort(listOfCountries);

		System.out.println("After Sort  : ");
		for (int i = 0; i < listOfCountries.size(); i++) {
			CountryForComparable CountryForComparable = (CountryForComparable) listOfCountries.get(i);
			System.out.println("CountryForComparable Id: " + CountryForComparable.getCountryId() + "|| "
					+ "CountryForComparable name: " + CountryForComparable.getCountryName());
		}
		
      Country country1= new Country(1, "America");
      Country country2= new Country(2, "Raushia");
      Country country3= new Country(3, "Japan");
      
      List<Country> cl= new ArrayList<Country>();
      cl.add(country1);
      cl.add(country2);
      cl.add(country3);
      
      /**
       * Bound mismatch: The generic method sort(List<T>) of 
       * type Collections is not applicable for the arguments (List<Country>).
       * The inferred type Country is not a valid
       * substitute for the bounded parameter <T extends Comparable<? super T>>
       */
    //  Collections.sort(cl); compile time error
      
      List<Integer>listOFRollNumber=new ArrayList<Integer>();
      listOFRollNumber.add(211);
      listOFRollNumber.add(111);
      listOFRollNumber.add(311);
      listOFRollNumber.add(131);
     
     System.out.println("Printing RollNumber before sort");
     for(Integer lr:listOFRollNumber){
    	 System.out.println(lr);
     }
     
     //All wrapper class implementing  comparable interface.
     Collections.sort(listOFRollNumber);
    	 
     System.out.println("Printing RollNumber After sort");
     for(Integer lr:listOFRollNumber){
    	 System.out.println(lr);
     }
      
	}
	

}

/*

Output:-


Before Sort  : 
	CountryForComparable Id: 1||CountryForComparable name: India
	CountryForComparable Id: 4||CountryForComparable name: China
	CountryForComparable Id: 3||CountryForComparable name: Nepal
	CountryForComparable Id: 2||CountryForComparable name: Bhutan
	compareTo() is calling...
	compareTo() is calling...
	compareTo() is calling...
	compareTo() is calling...
	compareTo() is calling...
	compareTo() is calling...
	After Sort  : 
	CountryForComparable Id: 1|| CountryForComparable name: India
	CountryForComparable Id: 2|| CountryForComparable name: Bhutan
	CountryForComparable Id: 3|| CountryForComparable name: Nepal
	CountryForComparable Id: 4|| CountryForComparable name: China

*/