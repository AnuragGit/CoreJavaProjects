package com.anurag.this_and_super;

/**
 * @author Anurag
 *  
 *   Concept:- 
 *         this represent reference of the current object , sometimes current class nonstatic
 *         member can be access by using this.
 *         
 *         current class non static memeber can be use by this keyword.
 */
class ThisConcept1_A{
	void test1(){
		System.out.println("test1");
	}
	
	void test2(){
		test1();
		System.out.println("test2");
		this.test1();
	}
}
public class ThisConcept1 {
	public static void main(String[] args) {
		ThisConcept1_A a1 = new ThisConcept1_A();
		a1.test1();
		System.out.println("=======================");
		a1.test2();
		
	}
}

/*		Output:-
		
		test1
		=======================
		test1
		test2
		test1
		
*/