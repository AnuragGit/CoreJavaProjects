package com.anurag.global.nonstaticvariable;
/**
 * 
 * @author Anurag
 *   Concept:- Object loaded in heap and through reference variable  we can 
 *             use non static member of object in to stack. Each object have 
 *             different copy of its non static member.
 */
public class NonStatic9 {

	  int x;
	  public static void main(String[] args) {
		NonStatic9 ns = new NonStatic9();
		NonStatic9 np = new NonStatic9();
		
		ns.x=10;
		np.x=20;
		
		System.out.println(ns.x);
		System.out.println(np.x);
		
	}
}

/**
 *   Output:-
 *       10
 *       20
 */
