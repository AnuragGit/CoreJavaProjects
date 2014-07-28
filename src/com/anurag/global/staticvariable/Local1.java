package com.anurag.global.staticvariable;
/**
 * @author Anurag
 * Concept:= This program is showing the scope of local variable.
 */
public class Local1 {

	static void test(int i){
		i=10;
	}
	
	public static void main(String[] args) {
		int i=5;
		System.out.println(i);
		test(i);
		System.out.println(i);
	}
}

/*
 *  Output:-
 *        5
 *        5
 *         
 */
