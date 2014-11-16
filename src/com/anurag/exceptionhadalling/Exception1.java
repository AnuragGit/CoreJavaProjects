package com.anurag.exceptionhadalling;
/**
 * @author Anurag
 *  
 *         Concept:- This program is showing how  & why exception is coming.
 *
 */
public class Exception1 {

	public static void main(String[] args) 
	{
		int i=10;
		int c =i/0;   //This line will generate exception
		System.out.println(c);
		System.out.println("Hello World!");
	}
}

/*
Output:-

Exception in thread "main" java.lang.ArithmeticException: / by zero
at com.anurag.exceptionhadalling.Exception1.main(Exception1.java:13)

*/	
	
