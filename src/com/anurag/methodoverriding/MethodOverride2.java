package com.anurag.methodoverriding;
/**
 * 
 * @author Anurag
 *
 *   Concept:-  While implementing or overriding  the method signature must be same.
 *   
 *          Rule for implementing or overriding in subclass is:-
 *          
 *          1) Signature must be same as superclass.
 *          2) In a case of return type if superclass method is returning  void then
 *             subclass we have to keep return type void only so return type also must
 *             be same. 
 */ 

interface MethodOverride2_base{
	void test();
}

class NonMethodOverride2 implements MethodOverride2_base{
	public void test(){
		System.out.println("test()");
	}
}
public class MethodOverride2 {
	public static void main(String[] args) {
		NonMethodOverride2 nm = new NonMethodOverride2();
		nm.test();
		System.out.println("Done");
	}
}
/*
Output:-

test()
Done
*/