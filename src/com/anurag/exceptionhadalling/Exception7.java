package com.anurag.exceptionhadalling;

/**
 * @author Anurag
 *
 *    Concept:- The result of division by zero is, mathematically speaking, undefined, 
 *    		which can be expressed with a float/double (as NaN - not a number), it isn't, however, wrong in any fundamental sense.
			As an integer must hold a specific numerical value, an error must be thrown on division by zero when dealing the them.
 */
public class Exception7 
{
	public static void main(String[] args) 
	{
		System.out.println(1);
		try                  
		{
			System.out.println(2);
			double i=1/0.0;
			System.out.println("double i=1/0.0 --------> "+i);
			double i1=0/0.0;
			System.out.println("double i1=0/0.0 ------->"+i1);
			double i2 =-1/0.0;
			System.out.println(" double i2 =-1/0.0 ------->"+i2);
			double i3=2.5/0;
			System.out.println("double i3=2.5/0------>"+i3);
			int a=2/0;			
			System.out.println(a);
			System.out.println(3);
		}
		catch (ArithmeticException e)
		{
			System.out.println(e);
			System.out.println(4);
		}
		System.out.println(5);
		System.out.println("Hello World!");
	}
}
/*
Output:-

1
2
double i=1/0.0 --------> Infinity
double i1=0/0.0 ------->NaN
double i2 =-1/0.0 ------->-Infinity
double i3=2.5/0------>Infinity
java.lang.ArithmeticException: / by zero
4
5
Hello World!

*/