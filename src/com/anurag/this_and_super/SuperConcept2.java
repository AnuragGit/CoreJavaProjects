package com.anurag.this_and_super;

/**
 * @author Anurag
 *   
 *   Concept:- This example is showing the usage of super keyword . when you are using override method 
 *   then access the parent method facilities we can go with super keyword.
 */

class SuperConcept2_I{
	void test1(){
		System.out.println("SuperConcept2_I tes1()");
	}
	
	void test2(){
		System.out.println("SuperConcept2_I test2()");
	}
}


class SuperConcept2_J extends SuperConcept2_I{
	void test1(){
		super.test1();
		System.out.println("SuperConcept2_J test1()");
	}
	
	void test2(){
		System.out.println("SuperConcept2_J test2()");
	}
}

public class SuperConcept2 {
	public static void main(String[] args) {
		SuperConcept2_J  j1 = new SuperConcept2_J();
		j1.test1();
		System.out.println("========================");
		j1.test2();
	}
}
/*
	Output:-
	
	SuperConcept2_I tes1()
	SuperConcept2_J test1()
	========================
	SuperConcept2_J test2()

*/