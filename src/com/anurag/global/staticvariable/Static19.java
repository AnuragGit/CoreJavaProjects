package com.anurag.global.staticvariable;
/**
 * 
 * @author Anurag
 *  Concept:- Static variable Initialization concept
 */

public class Static19 {
	
	static int i=10;
	static int j=test();
	static int k=20;
	static int m;
	
	static int test(){
		System.out.println("I am from test");
		return (i+j+k+m);
	}
	
	public static void main(String[] args) {
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
		System.out.println(m);
		System.out.println("=====================");
		System.out.println(test());
	}

}

/**
 *   Output:-
 *      
 *        I am from test
 *        10
 *        10
 *        20
 *        0
 *        ====================
 *        I am from test
 *        40
 */
