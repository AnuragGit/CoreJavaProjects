package com.anurag.exceptionhadalling;

/**
 * @author Anurag
 *   Concept:- This program show how exception handle in any java block here static method .
 */
public class Exception12 
{
	static void test()
	{
		System.out.println(1);
		try
		{
			System.out.println(2);
			int i=10/0;
			System.out.println(3); 
		}
		catch (ArithmeticException ex)
		{
			System.out.println(ex);
			System.out.println(4);
		}
		System.out.println(5);
	}
	public static void main(String[] args) 
	{
		System.out.println(6);
	   	test();
		System.out.println("Hello World!");
	}
}
/*
Output:-

6
1
2
java.lang.ArithmeticException: / by zero
4
5
Hello World!
*/
