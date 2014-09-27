package com.anurag.methodoverriding;
/**
 * @author Anurag
 *  
 *    Concept:- In the superclass method got already implemented and in subclass again implementation
 *    is known as Method Overriding.
 *    
 *     While overriding a method ,we have to use the same signature and return type.
 *       
 */

class MethodOverride1_first{
	void test1(){
		System.out.println("MethodOverride1_first test1()");
	}
	void test2(){
		System.out.println("MethodOverride1_first test2()");
	}
}

class MethodOverride1_second extends MethodOverride1_first{
	void test2(){
		System.out.println("MethodOverride1_secon test2()");
	}
}
public class MethodOverride1 {
	public static void main(String[] args) {
		MethodOverride1_first mf = new MethodOverride1_first();
		mf.test1();
		mf.test2();
		
		System.out.println("============================");
		
		MethodOverride1_second ms = new MethodOverride1_second();
		ms.test1();
		ms.test2();
	}
}

	/*Output:-
	
	MethodOverride1_first test1()
	MethodOverride1_first test2()
	============================
	MethodOverride1_first test1()
	MethodOverride1_secon test2()
*/
