package com.anurag.exceptionhadalling;
import java.util.Scanner;

/**
 * @author Anurag
 *     
 *     Concept:- 
 *     
 *       (1)This program show finally block is execute in every flow.
 *    
 *       (2) In order to execute some essential code  then those statement incorporate in 
 *       final block.
 *      
 *       (3) final block kept after all try and catches.
 */
public class Exception15 
{
	public static void main(String[] args) 
	{
		System.out.println(1);
		Scanner sc = new Scanner(System.in);
		try
		{
			System.out.println(2);
			System.out.println("Enter");
			String s1 = sc.next();
			System.out.println(3);
			int i =Integer.parseInt(s1);
			System.out.println(4);
			int j=i/(i-9);
			System.out.println(5);
		}
		catch (ArithmeticException ex)
		{ 
			System.out.println(ex);
			System.out.println(6);
		}
		catch(ArrayIndexOutOfBoundsException ex)
		{
			System.out.println(ex);
			System.out.println(7);
		}
		finally
		{
			System.out.println(8+"finally");
		}
		System.out.println("Hello World!");
	}
}
/*
Output:-
=========vaule 1 output ========
1
2
Enter
6
3
4
5
8finally
Hello World!

=========vaule 2 output =========================

1
2
Enter
gdfs
3
8finally
Exception in thread "main" java.lang.NumberFormatException: For input string: "gdfs"
	at java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
	at java.lang.Integer.parseInt(Integer.java:492)
	at java.lang.Integer.parseInt(Integer.java:527)
	at com.anurag.exceptionhadalling.Exception15.main(Exception15.java:28)


=================Value 3 output ====================

1
2
Enter
9
3
4
java.lang.ArithmeticException: / by zero
6
8finally
Hello World!


*/
