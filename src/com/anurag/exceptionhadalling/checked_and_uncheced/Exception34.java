package com.anurag.exceptionhadalling.checked_and_uncheced;

/**
 * 
 * @author Anurag
 *
 *
 *         Concept:- This program is showing how to call method that throwing checked
 *                    Exception.
 *                    
 *                    So caller of test1 should have either try catch or throws ,because
 *                    test1 is throwing one of the checked exception.
 */

class Exception34_1{
	void test1()throws ClassNotFoundException{
		
	}
}
public class Exception34 {

	  public static void main(String[] args) throws ClassNotFoundException {
		
		  new Exception34_1().test1();
	}
}
