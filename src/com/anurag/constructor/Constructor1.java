package com.anurag.constructor;

/**
 * @author Anurag
 *
 * Constructor:- Without return type and name is just as a class name is 
 *               knows as constructor.
 *        Concept:- While creating a object constructor will be execute.
 *                   Constructor is one of the non static definitions block.
 *               
 *               
 */
public class Constructor1 {

	Constructor1(){
		System.out.println("Constructor1()");
	}
	
	public static void main(String[] args) {
		Constructor1 c1 = new Constructor1();
		System.out.println("===================");
		Constructor1 c2 = new Constructor1();
		System.out.println("===================");
		Constructor1 c3 = new Constructor1();
		System.out.println("===================");
	}
}

/*	output:-
	
	Constructor1()
	===================
	Constructor1()
	===================
	Constructor1()
	===================
	
*/
