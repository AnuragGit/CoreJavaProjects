package com.anurag.global.nonstaticvariable;
/**
 * 
 * @author Anurag
 *  Concept:-  In order to use non static member inside the static member we use by the object.
 *   
 */
public class NonStatic7 {
	 void test(){
		 System.out.println("test");
	 }
	 
	 public static void main(String[] args) {
		NonStatic7 ns = new NonStatic7();
		ns.test();
		System.out.println("done");
	}
}

/**
 * 	 Output:- 
 *        test
 *        done    
 */
