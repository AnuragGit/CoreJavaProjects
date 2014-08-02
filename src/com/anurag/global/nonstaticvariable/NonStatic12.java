package com.anurag.global.nonstaticvariable;
/**
 * 
 * @author Anurag
 *	
 *   Concept:- While creating object non static member loading in memory.
 */
public class NonStatic12 {
	
	int i=10;
	int j;
	
	public static void main(String[] args) {
		
		NonStatic12 ns = new NonStatic12();
		
		System.out.println(ns.i);
		System.out.println(ns.j);
		
		NonStatic12 np = new NonStatic12();
		
		System.out.println(np.i);
		System.out.println(np.j);
		
		NonStatic12 nq = new NonStatic12();
		
		System.out.println(nq.i);
		System.out.println(nq.j);
		
		
	}
}

/*

Output:-

		10
		0
		10
		0
		10
		0
*/