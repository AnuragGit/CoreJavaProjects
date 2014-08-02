package com.anurag.sib;
/**
 * 
 * @author Anurag
 *   Concept:- This program show the SIB sequence
 */
public class Sib7 {
	
	static int i;
	static {
		System.out.println("SIB1");
	}
	
	static{
		System.out.println("SIB2");
	}
}

/**
 *   Output:-
 *        SIB1
 *        SIB2
 *        Exception in thread "main" java.lang.NosuchMethod found.
 */
