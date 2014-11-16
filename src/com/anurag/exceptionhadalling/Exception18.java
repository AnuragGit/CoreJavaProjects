package com.anurag.exceptionhadalling;

/**
 * @author Anurag
 *    
 *     Concept:-  This program is showing finally block won't execute 
 *     if exception will come before  try block .
 */
public class Exception18 
{
	public static void main(String[] args) 
	{
		System.out.println(1);
		int i=10/0;
		try
		{
			System.out.println(2);
		}
		catch (ArithmeticException ex)
		{
			System.out.println(3);
		}
		finally
		{
			System.out.println(4);
		}
		
		System.out.println(5);
		System.out.println("Hello World!");
	}
}
/*
 Output:-
 
 1
 Exception in thread "main" java.lang.ArithmeticException: / by zero
 	at com.anurag.exceptionhadalling.Exception18.main(Exception18.java:14)

*/