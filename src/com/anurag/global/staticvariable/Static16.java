package com.anurag.global.staticvariable;
/**
 * 
 * @author Anurag
 *
 *  Concept:- Static global variable initialization sequences.
 */
public class Static16 {
	
	static int i=test();
	static int j=10;
	static int test(){
		return j;
	}
	public static void main(String[] args) {
		 System.out.println(i);
		 System.out.println(j);
	}
	
}

/**
 *   Output:-
 *      
 *        0
 *        10
 */

