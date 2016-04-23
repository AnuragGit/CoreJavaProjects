package com.anurag.refelectionAPI;

/**
 * 
 * @author Anurag
 * 
 *        concept :- This program is showing how to get class information
 *                   back by object of class.
 *
 */

class RefelectionConcept3_One
{                                             
} 
class RefelectionConcept3_Two extends RefelectionConcept3_One
{
}
class RefelectionConcept3_Three extends RefelectionConcept3_Two
{
}
class RefelectionConcept3_Four extends RefelectionConcept3_Three 
{               
}

public class RefelectionConcept3 
{
	public static void main(String[] args) 
	{
		RefelectionConcept3_One o1 = new RefelectionConcept3_Four();
		Class c=o1.getClass();
		Class c1 =RefelectionConcept3_One.class;
		System.out.println(o1.getClass());
		System.out.println(c.getName());
		System.out.println(c1.getName());
		System.out.println("--------------------");
		o1=new RefelectionConcept3_Three();
		 c=o1.getClass();
		 c1 =RefelectionConcept3_One.class;
		System.out.println(o1.getClass());
		System.out.println(c.getName());
		System.out.println(c1.getName());
		System.out.println("--------------------");
     
	      

		System.out.println("Hello World!");
	}
}
/*
Output:-
class com.anurag.refelectionAPI.RefelectionConcept3_Four
com.anurag.refelectionAPI.RefelectionConcept3_Four
com.anurag.refelectionAPI.RefelectionConcept3_One
--------------------
class com.anurag.refelectionAPI.RefelectionConcept3_Three
com.anurag.refelectionAPI.RefelectionConcept3_Three
com.anurag.refelectionAPI.RefelectionConcept3_One
--------------------
Hello World!

*/