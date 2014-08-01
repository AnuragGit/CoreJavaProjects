package com.anurag.global.staticvariable;

/**
 * @author Anurag
 * 
 *         Concept:- Static Global variable initialize top to bottom.
 */

public class Static10 {

	static int i = test();

	static int test() {
		return 20;
	}

	public static void main(String[] args) {
		System.out.println(i);
	}
}

/**
 * Output:-
 * 
 *      20

 */

