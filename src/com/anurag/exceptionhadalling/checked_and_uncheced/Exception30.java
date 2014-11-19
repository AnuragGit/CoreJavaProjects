package com.anurag.exceptionhadalling.checked_and_uncheced;
/**
 * @author Anurag
 * 
 * 		Concept:- This program also for stack unwinding but this a unchecked exception
 *                So throw statement is optional.  
 *
 */
public class Exception30
{
	public static void main(String[] args) 
	{
		System.out.println(1);
		test1();
		System.out.println(2);
		
	}
	static void test1()
	{
		System.out.println(3);
		test2();
		System.out.println(4);
	}
	static void test2()
	{
		System.out.println(5);
		test3();
		System.out.println(6);
	}
	static void test3() throws ArithmeticException
	{
		System.out.println(7);
		int i=10/0;
		System.out.println(8);
	}
}
/*
  Output:-
  
  1
  3
  5
  7
  Exception in thread "main" java.lang.ArithmeticException: / by zero
  	at com.anurag.exceptionhadalling.checked_and_uncheced.Exception30.test3(Exception30.java:33)
  	at com.anurag.exceptionhadalling.checked_and_uncheced.Exception30.test2(Exception30.java:27)
  	at com.anurag.exceptionhadalling.checked_and_uncheced.Exception30.test1(Exception30.java:21)
  	at com.anurag.exceptionhadalling.checked_and_uncheced.Exception30.main(Exception30.java:14)

*/