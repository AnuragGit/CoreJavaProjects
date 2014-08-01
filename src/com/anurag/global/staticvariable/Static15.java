package com.anurag.global.staticvariable;
/**
 * 
 * @author Anurag
 *  
 *  Concept:- Static global variable initialization sequences.
 */
public class Static15 {
	
	static int i=10;
	static int j=test();
	static int test(){
		return i;
	}
	
	public static void main(String[] args) {
		System.out.println(i);
		System.out.println(j);
	}

}

/**
 *  Output:-
 *  
 *         10
 *         10
 */
