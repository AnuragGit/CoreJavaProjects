package com.anurag.wrapperclass;

/**
 * @author Anurag
 *  
 *    Concept:-
 *             Converting character to Wrapper class Object.
 */
public class Wrapper4 {

		public static void main(String[] args) {
			Character c= new Character('a');
			
			Character c1 =Character.valueOf('b');
			
			System.out.println(c);
			
			System.out.println(c1);
		}
}
/*	
	Output:-
	
	a
	
	b
*/