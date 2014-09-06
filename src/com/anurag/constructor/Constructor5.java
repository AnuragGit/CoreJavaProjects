package com.anurag.constructor;

/**
 * @author Anurag
 *
 *  Concept:-
 *    If developer not keeping the single constructor then compiler keep no-arg constructor
 *    by default. So in this case we kept one argument constructor so compiler doesn't 
 *    create default constructor . So in this case we will get compile time error.
 */
public class Constructor5 {
	Constructor5(int i) {
		System.out.println("Constructor5()");
	}

	public static void main(String[] args) {
		Constructor5 c1 = new Constructor5(10);
		System.out.println("==================");
		// Constructor5 c2 =new Constructor5(); Compile time error.

	}
}
