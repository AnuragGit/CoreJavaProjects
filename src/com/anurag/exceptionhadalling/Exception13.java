package com.anurag.exceptionhadalling;
/**
 * @author Anurag
 *   
 *   Concept:- This program is showing raised exception is not handling by catch.
 */
public class Exception13 
{
	public static void main(String[] args) 
	{
		
		System.out.println(1);
		try
		{
			System.out.println(2);
			int i=10/0;
			System.out.println(3);
		}
		catch (NumberFormatException ex)
		{
            System.out.println(ex);
            System.out.println(4);
		}

		System.out.println(5);
		System.out.println("Hello World!");
	}
}
/*
Output:-

1
2
Exception in thread "main" java.lang.ArithmeticException: / by zero
	at com.anurag.exceptionhadalling.Exception13.main(Exception13.java:16)

*/