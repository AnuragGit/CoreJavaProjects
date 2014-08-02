package com.anurag.global.nonstaticvariable;

/**
 * 
 * @author Anurag
 * 
 *         Concept:- Object can be created to any of the execution block.
 */
public class NonStatic13 {
	int i;

	static void test() {
		NonStatic13 ns = new NonStatic13();
		ns.i = 10;
		System.out.println(ns.i);

	}

	public static void main(String[] args) {

		test();
		System.out.println("done");
	}
}
/*
Output:-


		10
		done

*/