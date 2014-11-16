package com.anurag.exceptionhadalling.returnstatement;
/**
 * @author Anurag
 *   
 *     Concept:-  This program show if we are keeping return statement inside the finally
 *                block then after finally block make sure no statement will be there.
 */
public class Exception21 
{
	static int test2(String s1)
	{
		try
		{
			int i =Integer.parseInt(s1);
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
		finally
		{
			return 10;
		}
		//System.out.println("10");//not any statement here;
	}
	public static void main(String[] args) 
	{

		int i= test2("123");
		System.out.println("Hello World!"+i);
	}
}
/*
	Output:-
	
	Hello World!10


*/