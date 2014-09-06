package com.anurag.constructor;

/**
 * @author Anurag
 *  
 *  Concept:- While creating object you have to specify the available constructor.
 *  
 *      
 */
public class Constructor2 {
	Constructor2(){
		System.out.println("Constructor2()");
	}
	
	Constructor2(int i){
		System.out.println("Constructor2(int)");
	}
	
	public static void main(String[] args) {
		Constructor2 c1 = new Constructor2();
		System.out.println("=====================");
		
		Constructor2 c2 = new Constructor2(10);
		System.out.println("=====================");
		
	}

}
	/*
		Output:-
		
		Constructor2()
		=====================
		Constructor2(int)
		=====================
*/