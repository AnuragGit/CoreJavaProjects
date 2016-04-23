package com.anurag.refelectionAPI;
/**
 * 
 * @author Anurag
 * 
 *        concept :- This program is showing how to get class information
 *                   back by object of class.
 *
 */
class RefelectionConcept1_A
{
	int a;
}
public class RefelectionConcept2 
{
	public static void main(String[] args) 
	{
		RefelectionConcept1_A a1 = new RefelectionConcept1_A();
		Class c= RefelectionConcept1_A.class;
		Class c1 =a1.getClass();
		System.out.println(c.getName());
		System.out.println(c1.getName());
		System.out.println("Hello World!");
	}
}

/*Output:-
com.anurag.refelectionAPI.RefelectionConcept1_A
com.anurag.refelectionAPI.RefelectionConcept1_A
Hello Word

*/
