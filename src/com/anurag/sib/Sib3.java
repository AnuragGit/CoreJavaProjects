package com.anurag.sib;

/**
 * 
 * @author Anurag
 * 
 *  Concept:- Static Initialization Block concepts
 */
public class Sib3 {

	static{
		System.out.println("SIB1");
	}
	
	public static void main(String[] args) {
		System.out.println("Main");
	}
	
	static{
		System.out.println("SIB2");
	}
}

/**
 *  Output:-
 *  
 *    SIB1
	  SIB2
      Main
 */
