package com.anurag.this_and_super;

/**
 *  * @author Anurag
 *     
 *     Concept:- 
 *     
 *         This example show exact use of this , when constructor argument and instance variable name
 *         is same, then by use of this we can make it differentiate of these two.
 */

class ThisConcept3_C{
	int i;
	ThisConcept3_C(int i){
		this.i=i;
	}
	void print(){
		System.out.println(i);
	}
}
public class ThisConcept3 {
	public static void main(String[] args) {
		ThisConcept3_C tc = new ThisConcept3_C(10);
		ThisConcept3_C td = new ThisConcept3_C(20);
		
		tc.print();
		td.print();
		
		System.out.println("Done");
	}
}
		/*
		Output:-
		
		10
		20
		Done
		
*/