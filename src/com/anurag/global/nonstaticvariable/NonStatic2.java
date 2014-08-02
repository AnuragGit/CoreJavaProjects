package com.anurag.global.nonstaticvariable;
/**
 * @author Anurag
 *   Concept:- Non static member can not use directly inside static block.
 *            And we can not be use by class name also.
 */
public class NonStatic2 {

		 void test(){
			 System.out.println("test");
		 }
		 public static void main(String[] args) {
		//	test(); We can not call directly
			System.out.println("Hello word");
	    //	test();  We can not call directly
		}
}


/**
 *  Output:-
 *     Hello Word
 */

