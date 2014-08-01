package com.anurag.sib;

/**
 * 
 * @author Anurag
 *  
 *  Concept:- Static Initialization Block concepts
 */
public class Sib2 {

	  public static void main(String[] args) {
		System.out.println("Main");
	}
	  
	  static{
		  System.out.println("SIB");
	  }
}

/**
 * Output:-
 *    SIB
 *    Main 
 */
