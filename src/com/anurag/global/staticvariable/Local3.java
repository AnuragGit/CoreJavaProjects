package com.anurag.global.staticvariable;
/**
 * @author Anurag
 * Concept:- This program is showing the scope of local variable
 */
public class Local3 {
	static void test(){
		int i=10;
	}
	public static void main(String[] args) {
		int i=22;
		System.out.println(i);
		test();
		System.out.println(i);
	}
}

/**
 *  Output:-
 *       22
 *       22
 */
