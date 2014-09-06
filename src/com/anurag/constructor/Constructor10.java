package com.anurag.constructor;
/**
 * 
 * @author Anurag
 *  
 *    Concept:- This program also showing the  constructor initilize the object.
 */
public class Constructor10 {
	
	int i;
	Constructor10(){
		i=10;
		i++;
		++i;
		i++;
	}
	
	public static void main(String[] args) {
		Constructor10 c1 = new Constructor10();
		System.out.println(c1.i);
	}
		
}

/*
 Output:-
             13

*/