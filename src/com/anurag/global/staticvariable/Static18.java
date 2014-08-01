package com.anurag.global.staticvariable;
/**
 * 
 * @author Anurag
 *  
 *   Concept:- Static global variable initialization sequences 
 */
public class Static18 {

	static int i=test();
	static int j=10;
	public static void main(String[] args) {
		System.out.println(i);
		System.out.println(j);
		
	}
	
	static int test(){
		return j;
	}
}

/**
 *   output:-
 *   
 *        0
 *        10
 */
