package com.anurag.constructor.iib;
/**
 * 
 * @author Anurag
 *		
 *        Concept:- Every IIB definition block is execute while execution of constructor.
 */
public class Constructor16 {
	{
		System.out.println("IIB1");
	}
	Constructor16(){
		System.out.println("Constructor16()");
	}
	
	{
		System.out.println("IIB2");
	}
	
	 public static void main(String[] args) {
		
		 Constructor16 c1 = new Constructor16();
		 
		 System.out.println("====================");
		 
		 
		 Constructor16 c2 = new Constructor16();
		 
		 System.out.println("====================");
		 
		 
		 
	}
	{
		System.out.println("IIB3");
	}
	
	
}
/*
Output:-

IIB1
IIB2
IIB3
Constructor16()
====================
IIB1
IIB2
IIB3
Constructor16()
====================*/

