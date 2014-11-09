package com.anurag.wrapperclass;

/**
 * @author Anurag
 *
 *   Concept:- Convert wrapper object  to String 
 */
public class Wrapper6 {

	   public static void main(String[] args) {
		
		   Integer obj = Integer.valueOf("1111", 2);
		   
		   String str =obj.toString();
		   System.out.println(str);
	}
}
/*	
	Output:-
	
	15
*/