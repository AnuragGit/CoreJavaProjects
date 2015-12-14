package com.anurag.comparableAndComparator;

/**
 * 
 * @author Anurag
 * 
 *         Concept:-This class will implement Comparable interface and implement
 *         CompareTo method to sort collection of country object by id.
 * 
 *         If this.cuntryId < country.countryId:then compare method will return -1
 *         If this.countryId > country.countryId:then compare method will return 1
 *         If this.countryId==country.countryId:then compare method will return 0
 *         
 *
 */
//
public class CountryForComparable implements Comparable {
	int countryId;
	String countryName;

	public CountryForComparable(int countryId, String countryName) {
		super();
		this.countryId = countryId;
		this.countryName = countryName;
	}

	@Override
	public int compareTo(Object arg0) {
		System.out.println("compareTo() is calling...");
		CountryForComparable country = (CountryForComparable) arg0;
		return (this.countryId < country.countryId) ? -1 : (this.countryId > country.countryId) ? 1 : 0;
	}

	public int getCountryId() {
		return countryId;
	}

	public void setCountryId(int countryId) {
		this.countryId = countryId;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

}