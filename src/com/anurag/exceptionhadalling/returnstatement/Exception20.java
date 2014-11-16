package com.anurag.exceptionhadalling.returnstatement;
/**
 * @author Anurag
 *    Concept:-
 *              This program show how to use return statement in try catch and try -catch
 *              container block.
 */
public class Exception20 
{
	int test(String s1)
	{
		try
		{
			int i = Integer.parseInt(s1);
			int k=i/(i-9);
		}
		catch (ArithmeticException ex)
		{
			System.out.println(ex);
		}
		catch(NumberFormatException ex)
		{
			System.out.println(ex);
		}
		return 10;
	}
	public static void main(String[] args) 
	{
		Exception20 m1 = new Exception20();
		int i=m1. test("12");
		int j= m1.test("ab");
		System.out.println(i);
		System.out.println(j);
		System.out.println("Hello World!");
	}
}

	/*	Output:-
		
		java.lang.NumberFormatException: For input string: "ab"
			10
			10
			Hello World!

	*/	
		
