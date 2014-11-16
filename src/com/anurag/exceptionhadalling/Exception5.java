package com.anurag.exceptionhadalling;

/**
 * @author Anurag
 * 
 * Concept:- This program show how and when NumberFormatException will come
 *
 */
public class Exception5 
{
	public static void main(String[] args) 
	{
		System.out.println(1);
		int i= Integer.parseInt("abc");
		System.out.println(2);
		System.out.println("Hello World!");
	}
}


/*Output:
	
	1
	Exception in thread "main" java.lang.NumberFormatException: For input string: "abc"
		at java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
		at java.lang.Integer.parseInt(Integer.java:492)
		at java.lang.Integer.parseInt(Integer.java:527)
		at com.anurag.exceptionhadalling.Exception5.main(Exception5.java:9)
*/