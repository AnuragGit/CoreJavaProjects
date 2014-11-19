package com.anurag.exceptionhadalling.checked_and_uncheced;
/**
 * @author Anurag
 *
 *   Concept:-How to get detail error message
 */
public class Exception27 
{
	public static void main(String[] args) 
	{
		try
		{
			System.out.println(1);
			int i=10/0;
			System.out.println(2);
		}
		catch (ArithmeticException ex)
		{
			System.out.println(ex);
			System.out.println(ex.getMessage());
		    ex.printStackTrace();
		}
		System.out.println("Hello World!");
	}
}

/*Outpupt:-

java.lang.ArithmeticException: / by zero
at com.anurag.exceptionhadalling.checked_and_uncheced.Exception27.main(Exception27.java:14)
1
java.lang.ArithmeticException: / by zero
/ by zero
Hello World!
*/
