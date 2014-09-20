package com.anurag.inheritance;
/**
 * 
 * @author Anurag
 *  
 *    Concept:- 
 *    
 *         Inherit one class to another class .Making one class member as member of 
 *         another class.
 */
 class Inheritance1_base {
	 static void test(){
		 System.out.println("I am from test");
	 }
}
 
 public class Inheritance1 extends Inheritance1_base{
	 public static void main(String[] args) {
		test(); // calling static method of base class.
		
		System.out.println("======================");
		
		Inheritance1.test();
		
		System.out.println("======================");
		
		Inheritance1_base.test();
		
		System.out.println("========================");
		
	}
 }
	/* 
	 Output:-
	 
	 I am from test
	 ======================
	 I am from test
	 ======================
	 I am from test
	 ========================
	
*/