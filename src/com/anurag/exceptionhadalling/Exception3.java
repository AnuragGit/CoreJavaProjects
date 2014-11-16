package com.anurag.exceptionhadalling;
/**
 * @author Anurag
 *    
 *      Concept:- This program show how NegativeArraySizeException is coming
 */
public class Exception3 
{
	public static void main(String[] args) 
	{
		System.out.println(1);
		int x[] = new int[-2];
		x[10]=20;
		System.out.println(2);
		System.out.println("Hello World!");
	}
}

/*
	Output:-
	
	Exception in thread "main" java.lang.NegativeArraySizeException
	at com.anurag.exceptionhadalling.Exception3.main(Exception3.java:12)
	1
*/