package com.anurag.exceptionhadalling;

/**
 * @author Anurag
 * 
 *    Concept:-
 *          We can not get squre root of negative number and it won't give exception
 *
 */
public class Exception8 
{
	public static void main(String[] args) 
	{
		double d =Math.sqrt(-4);
		int i =(int) Math.sqrt(-4);
		System.out.println(d);
		System.out.println(i);
		System.out.println("Hello World!");
	}
}
/*
	Output:-
	NaN
	0
	Hello World!

*/