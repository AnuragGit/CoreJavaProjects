package com.anurag.sib;
/**
 * 
 * @author Anurag
 *  
 *  Concept:- Sequence of initialization  in static member
 *            So SIB also one of the initializer 
 *            This program show initializer  execute top to bottom
 */

public class Sib6 {
	 static int i=test();
	 static int test(){
		 System.out.println("test");
		 return 10; 
	 }
	 
	 static{
		 System.out.println("SIB");
	 }
	 
	 public static void main(String[] args) {
		System.out.println("main");
	}
}

/**
 *   Output:-
 *   
 *      test
		SIB
		main
 * 
 */
