package com.anurag.global.staticvariable;
/**
 * @author Anurag
 * Concept:- All Global variable automatic initialized to zero by default at the time of loading. 
 */
public class Static2 {
	
	static void test(){
		System.out.println(i);
		i=10;
		System.out.println(i);
	}
	static int i;
    public static void main(String[] args) {
		System.out.println(i);
		i=5;
		test();
		System.out.println(i);
	}
}

/**
 *   Output:-  
 *   
 *           0
 *           5
 *           10
 *           10
 */


// Differenece between local and global variable

  /**
   *   Local variable                                                 Global variable
   *    ---------------------------------------------------------------------------------
   *   (1) It is available in current method .  *       (1) It is available in all part of the class.       
   *   (2) Should be initialized explicity.     *       (2) Does not require to initialize.
   */
