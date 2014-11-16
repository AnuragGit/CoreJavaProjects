package com.anurag.exceptionhadalling;

/**
 * @author Anurag
 * 
 *    Concepts:- if you are trying to typecast an object of class A into an object of 
 *               class B, and they aren't compatible, you get a class cast exception.
 *
 */
public class Exception6 
{
	public static void main(String[] args) 
	{
		System.out.println(1);
		Object obj = new Object();
		String s= (String) obj;// down casting is not permited .
		System.out.println("Hello World!");
	}
}
/*
Output:-

1
Exception in thread "main" java.lang.ClassCastException: java.lang.Object cannot be cast to java.lang.String
	at com.anurag.exceptionhadalling.Exception6.main(Exception6.java:16)
*/