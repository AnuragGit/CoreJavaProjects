package com.anurag.global.nonstaticvariable;
/**
 * 
 * @author Anurag
 *
 *  Concept:-  In order to use non static member inside the static member we use by the object.
 *              
 */
public class NonStatic6 {

	 int i;
	 public static void main(String[] args) {
		NonStatic6 ns = new NonStatic6();
		System.out.println(ns.i);
		ns.i=10;
		System.out.println(ns.i);
	} 
}

/**
 * 	 Output:-  0
 *             10
 */
