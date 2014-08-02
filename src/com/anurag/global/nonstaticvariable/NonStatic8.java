package com.anurag.global.nonstaticvariable;
/**
 * 
 * @author Anurag
 *	Concept:-  In order to use non static member inside the static member we use by the object.
 *   
 */
public class NonStatic8 {
	 int i;
	 void test(){
		 System.out.println("test");
	 }
	 
	 public static void main(String[] args) {
		NonStatic8 ns = new NonStatic8();
		ns.i=10;
		ns.test();
		System.out.println(ns.i);
	}
}

/**
 *  Output:-
 *  
 *       test
 *       10
 */
