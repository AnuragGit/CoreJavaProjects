package com.anurag.global.staticvariable;

/**
 * 
 * @author Anurag 
 * 
 * Concept:- Local variable must declare and initialize before
 *         use.
 */
public class Static13 {

	public static void main(String[] args) {
		// int i=j; compile time error will come because j used before declare
		// and initialized
		int j = 10;
		// System.out.println(i);
		System.out.println(j);
	}
}
