package com.anurag.abstractclass;

/**
 * 
 * @author Anurag
 *   
 *   Concept:- If Method is not implemented on the class we can declare method as abstract.
 */


abstract class Abstract2_base{
	abstract void test1();
	abstract void test2();
	void test3(){
		System.out.println("test3()");
	}
}

class Abstract2_base_impl extends Abstract2_base{
	
	void test1(){
		System.out.println("test1()");
	}
	
	void test2(){
		System.out.println("test2()");
	}
	
}
public class Abstract2 {
	
	public static void main(String[] args) {
		Abstract2_base_impl abi = new Abstract2_base_impl();
		abi.test1();
		abi.test2();
		abi.test3();
	}
}

/*			Output:-
			
			test1()
			test2()
			test3()
			
*/

