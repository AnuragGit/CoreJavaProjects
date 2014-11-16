package com.anurag.exceptionhadalling;

/**
 * @author Anurag
 *  
 *     Concept:-This program is for how and when null pointer exception is coming.
 */
public class Exception2 {
	static String s1;

	public static void main(String[] args) {
		String s2 = null;
		System.out.println(s1.length()); // cause of nullpointer exception
		System.out.println(s2.length());// cause of null pointer exception
		System.out.println("Hello World!");
	}

}

/*
   Output:-
   
   Exception in thread "main" java.lang.NullPointerException
	at com.anurag.exceptionhadalling.Exception2.main(Exception2.java:13)
	
*/