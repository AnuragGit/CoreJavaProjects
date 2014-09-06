package com.anurag.constructor.iib;
/**
 * 
 * @author Anurag
 *   
 *   Concept:- 
 *   
 *    If Compiler found no constructor then it keep no argument constructor and put the  first statement
 *    is callling statement of IIB.
 */
public class Constructor17 {

	{
		System.out.println("IIB1");
	}
	
	public static void main(String[] args) {
		Constructor17 c1 = new Constructor17();
		
		System.out.println("====================");
		Constructor17 c2 = new Constructor17();
		
		System.out.println("=====================");
		
	}
	
	{
		System.out.println("IIB2");
	}
}

/*output:-

IIB1
IIB2
====================
IIB1
IIB2
=====================*/

