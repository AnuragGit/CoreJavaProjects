package com.anurag.exceptionhadalling.throwkeyword;
/**
 * @author Anurag
 *
 *   Concept:- 
 *             If we throw checked exception then we need to handle by
 *              try catch or throws keyword.
 */
public class Exception38 
{
	public static void main(String[] args) 
	{
		System.out.println(1);
		if(true)
		{
			try
			{
				throw new ClassCastException();
			}
			catch (ClassCastException ex)
			{
				System.out.println(ex);
				System.out.println(11);
			}
			System.out.println(2);
		}
		System.out.println("Hello World!");
	}
}
/*
Output:-

1
java.lang.ClassCastException
11
2
Hello World!
*/