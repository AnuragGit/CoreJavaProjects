package com.anurag.exceptionhadalling;

/**
 * @author Anurag
 *   
 *   Concept:  This program show how and when  ArrayIndexOutOfBoundsException will come
 */
public class Exception4 {
	public static void main(String[] args) {
		System.out.println(1);
		int x[]= new int[2];
		x[10]=20;   // This line will cause of exception
		System.out.println(2);
	}
}
/*
Output:-

1
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 10
	at com.anurag.exceptionhadalling.Exception4.main(Exception4.java:7)

	
*/