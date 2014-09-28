package com.anurag.this_and_super;
/**
 * @author Anurag
 *  
 *  Concept:-
 *     By the super we can call super class non static member.
 */
class SuperConcept1_E{
	void test1(){
		System.out.println("test1");
	}
}

class SuperConcept1_F extends SuperConcept1_E{
	void test2(){
		test1();
		System.out.println("=============");
		this.test1();
		System.out.println("===============");
		super.test1();
				
	}
}
public class SuperConcept1 {
	public static void main(String[] args) {
		SuperConcept1_F sf = new SuperConcept1_F();
		
		sf.test1();
		System.out.println("==================");
		sf.test2();
	}
}

/*		
		Output:-
		
		test1
		==================
		test1
		=============
		test1
		===============
		test1
*/