package com.anurag.exceptionhadalling.returnstatement;
/**
 * @author Anurag
 *    Concept:-
 *              This program show how to use return statement in try catch and try -catch
 *              container block.
 */
public class Exception19 
{
	static int test(String s1)
	{
		try
		{
			int i=Integer.parseInt(s1);
			return i;
		}
		catch (NumberFormatException ex)
		{
			return 10;
		
		}
		//return 20; Unreachable Statement();
	}
	public static void main(String[] args) 
	{     
		int i=test("34");
		System.out.println("Hello World!"+i);
	}
}
/*
Output:-
	Hello World!34

*/