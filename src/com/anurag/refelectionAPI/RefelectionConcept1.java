package com.anurag.refelectionAPI;

/**
 * 
 * @author Anurag
 * 
 *        concept :- This program is showing how to get class information
 *                   back by object of class.
 *
 */
public class RefelectionConcept1  
{
	public static void main(String[] args) 
	{
	    RefelectionConcept1 t1 = new RefelectionConcept1();		
		System.out.println(" Name with package with class prefix     ::  "+t1.getClass());
		System.out.println(" Name without package with class prefix  ::  "+t1.getClass().getName());
		System.out.println(" Name without package with class prefix  ::  "+t1.getClass().getCanonicalName());
		System.out.println(" Only class Name without package name    ::  "+t1.getClass().getSimpleName());
	}
}

/*Output:-

 Name with package with class prefix     ::  class com.anurag.refelectionAPI.RefelectionConcept1
 Name without package with class prefix  ::  com.anurag.refelectionAPI.RefelectionConcept1
 Name without package with class prefix  ::  com.anurag.refelectionAPI.RefelectionConcept1
 Only class Name without package name    ::  RefelectionConcept1

*/

