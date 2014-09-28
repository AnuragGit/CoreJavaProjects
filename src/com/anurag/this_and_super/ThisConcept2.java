package com.anurag.this_and_super;
/**
 * 
 * @author Anurag
 *    
 *    Concept:- If you not keep this to use non static member compiler will be using this.
 */

class ThisConcept2_B{
	int i;
	void print(){
		System.out.println(i);
		System.out.println(this.i);
	}
	
	void set(int k){
		i=k;
		this.i=k;
	}
}

public class ThisConcept2 {

	public static void main(String[] args) {
		ThisConcept2_B tb = new ThisConcept2_B();
		tb.print();
		tb.set(20);
		System.out.println("===========");
		tb.print();
	}
}

/*	Output:-
	
	0
	0
	===========
	20
	20
*/