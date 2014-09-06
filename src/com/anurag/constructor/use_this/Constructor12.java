package com.anurag.constructor.use_this;
/**
 *  @author Anurag
 *    
 *    Concept:- 
 *    
 *      This calling statement must be the first statement of the constructor.
 */
public class Constructor12 {

	Constructor12(){
		System.out.println("Constructor12()");
	}
	
	Constructor12(int i){
		this();
		System.out.println("Constructor(int i)");
	}
	
	public static void main(String[] args) {
		
		Constructor12 c1  = new Constructor12();
		System.out.println("==========================");
        Constructor12 c2 = new Constructor12(10);
		System.out.println("==========================");
		
	}
}

/*
 * Output:-

Constructor12()
==========================
Constructor12()
Constructor(int i)
==========================

*/
