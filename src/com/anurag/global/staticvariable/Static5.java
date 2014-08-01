package com.anurag.global.staticvariable;
/**
 * @author Anurag
 * 
 * Concept:- Combination of static and local variable  in side a method.
 */
public class Static5 {
	
	static int i;
	static int j;
	public static void main(String[] args) {
		System.out.println(i);
		int i=10;
		System.out.println(i);
	    j=20;
	    System.out.println(i);
	    System.out.println(j);
	    System.out.println(Static5.i);
	}

}

/**
 *  Output:-
 *         0
 *         10
 *         10
 *         20
 *         o 
 */
