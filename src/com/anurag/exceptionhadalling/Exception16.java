package com.anurag.exceptionhadalling;
import java.util.Scanner;

/**
 * @author Anurag
 *  
 *    Concept:-  This program show how finally block execute each and evey time.  
 */
public class Exception16 
{
	static int test(String s1)
	{
		try
		{
			System.out.println(1);
			int i=Integer.parseInt(s1);
			return i;

		}
		catch (NumberFormatException ex)
		{
			System.out.println(2);
			return 0;
		}
		finally
		{
			System.out.println(3);
			return 1000;
		}
	}
	public static void main(String[] args) 
	{
		System.out.println("Enter value:\n");
		Scanner  sc = new Scanner(System.in);
		String s1 =sc.next();
		int i=test(s1);
		System.out.println("main:"+i);

	}
}
/*
Output:-
    =========value 1==================
		Enter value:
		
		12
		1
		3
		main:1000
		
	============value 2==============	
		Enter value:

		hj
		1
		2
		3
		main:1000

		
		

*/
