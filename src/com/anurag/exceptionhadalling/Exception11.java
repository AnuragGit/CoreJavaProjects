package com.anurag.exceptionhadalling;

/**
 * @author Anurag
 *    Concept:- In any of the definition block we can keep the try and catch.
 */
public class Exception11 
{
	public static void main(String[] args) 
	{
		System.out.println(1);
		try
		{
		
			System.out.println(2);
			int i=10/0;
			System.out.println(3);
		   //throw new Error();  
		}
		catch (ArithmeticException ex)
		{
			System.out.println(ex); 
			System.out.println(4); 
		}		
		try
		{
			System.out.println(5);
			int i=Integer.parseInt("abc");
			System.out.println(6);
		}
		catch(NumberFormatException ex)
		{
			System.out.println(ex);
			System.out.println(7);
		}
		System.out.println("Hello World!");
	}
}

/*		Output:-
		
		1
		2
		java.lang.ArithmeticException: / by zero
		4
		5
		java.lang.NumberFormatException: For input string: "abc"
		7
		Hello World!
*/
