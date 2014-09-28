package com.anurag.this_and_super;
/**
 * @author Anurag
 *   Concept:-
 *   
 *         super keyword can be use any where inside non static block.
 */

class SuperConcept3_K{
	void test(){
		System.out.println("SuperConcept3_K test()");
	}
}

class SuperConcept3_L extends SuperConcept3_K{
	void test(){
		super.test();
		super.test();
		System.out.println("SuperConcept3_L test()");
		super.test();
	}
}
public class SuperConcept3 {

	 public static void main(String[] args) {
		 SuperConcept3_L sl = new SuperConcept3_L();
		 sl.test();
		 System.out.println("Done");
	}
}

/*Output:-

SuperConcept3_K test()
SuperConcept3_K test()
SuperConcept3_L test()
SuperConcept3_K test()
Done*/
