package com.anurag.exceptionhadalling;

/**
 * @author Anurag
 *   
 *     Concept:- If we get exception inside try block then corresponding catch able to handle it
 *           but if any exception will come in catch block then remaining catch not responsible to 
 *           handle this exception
 */
public class Exception17 
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
		catch (ArithmeticException ex)
		{
			System.out.println(4);
			int j= Integer.parseInt("abc");
		}
		catch(NumberFormatException ex)
		{
			System.out.println(5);
		}
		finally
		{
			System.out.println(6);
		}
		System.out.println("Hello World!");
	}
}
/*
  Output:-
  
  1
  2
  4
  6
  Exception in thread "main" java.lang.NumberFormatException: For input string: "abc"
  	at java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
  	at java.lang.Integer.parseInt(Integer.java:492)
  	at java.lang.Integer.parseInt(Integer.java:527)
  	at com.anurag.exceptionhadalling.Exception17.main(Exception17.java:16)

*/