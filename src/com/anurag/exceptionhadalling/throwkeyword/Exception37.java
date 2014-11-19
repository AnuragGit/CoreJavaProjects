package com.anurag.exceptionhadalling.throwkeyword;


/**
 * @author Anurag
 * 
 *         Concept:- use of throw keyword it use for rise the exception
 *         Explicitly
 *
 */
public class Exception37 
{
	public static void main(String[] args) 
	{
		System.out.println(1);
		if(true)
		{
			throw new ArithmeticException();
		}
		System.out.println(2);
		System.out.println("Hello World!");
	}
}

/*
Output:
	
	Exception in thread "main" java.lang.ArithmeticException
	at com.anurag.exceptionhadalling.throwkeyword.Exception37.main(Exception37.java:18)
1

*/