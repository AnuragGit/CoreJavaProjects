package com.anurag.constructor;
/**
 * 
 * @author Anurag
 *
 *     Concept:-
 *     
 *            This program is showing how to initialize  attribute value
 *            by constructor.
 */
public class Constructor9 {
	int x;
	Constructor9(){
		System.out.println("Value initilize by default Constructor");
		x=10;
	}
	Constructor9(int y){
		System.out.println("Value initilize by parametrized Constructor");
		x=y;
	}
	
	public static void main(String[] args) {
		Constructor9 c1 = new Constructor9();
		System.out.println(c1.x);
		System.out.println("======================");
		Constructor9 c2 = new Constructor9(20);
		System.out.println(c2.x);
		
	}
}

/*		Output:-
			
			Value initilize by default Constructor
			10
			======================
			Value initilize by parametrized Constructor
			20
*/

