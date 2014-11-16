package com.anurag.exceptionhadalling.returnstatement;
/**
 * @author Anurag
 * 
 *     Concept:-This program show When finally block will not execute. So when System.exit() will 
 *     written before finally block on that time finally block won't execute.
 *
 */
public class Exception22 
{
	public static void main(String[] args) 
	{
		try
		{
			System.out.println(1);
			System.exit(0);
			System.out.println(2);
		}
		catch (ArithmeticException ex)
		{
			System.out.println(ex);
		}
		finally
		{
			System.out.println("finally");
		}
		System.out.println("Hello World!");
	}
	
}
/*

Output:-

1
*/