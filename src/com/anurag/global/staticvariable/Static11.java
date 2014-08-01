package com.anurag.global.staticvariable;
/**
 * @author Anurag
 *
 *    Concept:- Static Global variable initialize top to bottom.
 */
public class Static11 {
	   static int i=10;
	   static int j=i;
	   
	   public static void main(String[] args) {
		 System.out.println(i);
		 System.out.println(j);
	}

}

/**
 *  Output:-
 *  
 *         10
 *         10
 */
