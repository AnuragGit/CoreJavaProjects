package com.anurag.constructor;
/**
 * @author Anurag
 *
 *	Concept:-  Constructor should not have same signature , otherwise we will get 
 *             compile time error.
 */
public class Constructor7 {
	
	Constructor7( int i){
		System.out.println("Constructor7(int i)");
	}
	
	
	/*Constructor7( int j){
		System.out.println("Constructor7(int j)");
	}*/
	
   // commented part is the cause of error
}
