package com.anurag.constructor.iib;
/**
 * 
 * @author Anurag
 *
 */
public class Constructor21 {
	{
		System.out.println("IIB1");
	}
	
	static{
		System.out.println("SIB");
	}
	
	public static void main(String[] args) {
		Constructor21 c1 = new Constructor21();
		
		System.out.println("=====================");
		
		Constructor21 c2 = new Constructor21();
		System.out.println("======================");
	}
}
/*

		 Output:-
		
		SIB
		IIB1
		=====================
		IIB1
		======================

*/
