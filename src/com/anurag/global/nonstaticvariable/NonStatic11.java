package com.anurag.global.nonstaticvariable;

/**
 * 
 * @author Anurag
 *  
 *     Concept:- One Object can have any number of reference.
 */
public class NonStatic11 {
	int i,j;
	
	public static void main(String[] args) {
		NonStatic11 ns = new NonStatic11();
		
		NonStatic11 np=ns;
		
		np.i=10;
		ns.j=20;
		
		System.out.println(ns.i);
		System.out.println(np.j);
	}
}
/*
Output:-

     10
     20
     
  */   
