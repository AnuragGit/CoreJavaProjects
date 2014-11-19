package com.anurag.exceptionhadalling.checked_and_uncheced;


/**
 * @author Anurag
 * 
 *     Concept:-
 *     
 *      we can not leave empty try if we use checked exception in catch block
        but in case of unchecked we can leave.
 *     
 *
 */
public  class Exception31 
{
	public static void main(String[] args) 
	{
		try
		{
			
		}
		catch (ArithmeticException ex)
		{
		}
		try
		{
			Class.forName("");
			System.out.println("hdfds");
		}
		catch (ClassNotFoundException ex)
		{
		}
		System.out.println("Hello World!");
	}
}
/*
Output:-
		Hello World!
		

*/