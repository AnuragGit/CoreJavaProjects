package com.anurag.global.nonstaticvariable;
/**
 * 
 * @author Anurag
 *   Concept:- Object loaded in heap and through reference variable  we can 
 *             use non static member of object in to stack. Each object have 
 *             different copy of its non static member.
 */
public class NonStatic10 {

	int x;
	int y;
	public static void main(String[] args) {
		NonStatic10 ns = new NonStatic10();
		System.out.println(ns.x);
		System.out.println(ns.y);
		
		ns.x=1;
		ns.y=2;
		
		NonStatic10 np  = new NonStatic10();
		np.x= 3;
		np.y=4;
		
		System.out.println(ns.x);
		System.out.println(ns.y);
		System.out.println(np.x);
		System.out.println(np.y);
		
		
		
	}
}


/*
Output:-
		0
		0
		1
		2
		3
		4

*/
