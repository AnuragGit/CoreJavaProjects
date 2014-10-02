package com.anurag.final_keyword;
/**
 * 
 * @author Anurag
 *     
 *     Concept:- Final is variable can not initialize more than once.
 *     
 *        In this example class initialization is final not a member of class.
 *
 */
class Final3_A{
	int i;
}
public class Final3 {
	public static void main(String[] args) {
		
		final Final3_A a1= new Final3_A();
		System.out.println(a1.i);
		a1.i=10;
		System.out.println(a1.i);
		a1.i=20;
		System.out.println(a1.i);
		//a1= new Final3_A();   This line will give compile time error because a1 is final.
		
		System.out.println("Done");
	}
	
}
			/*
			Output:-
			
			0
			10
			20
			Done
			
*/