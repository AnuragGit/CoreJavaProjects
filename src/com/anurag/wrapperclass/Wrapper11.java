package com.anurag.wrapperclass;

/**
 * @author Anurag
 *   
 *    Concept:- Each wrapper class override the equal() method from object class. The overriding 
 *     method compare two wrapper object for object value equality.
 */
public class Wrapper11 {
	public static void main(String[] args) {
		 Integer intobj = new Integer(12);
		 Integer sobj = new Integer("12");
		 Integer aobj = new Integer(14);
		 Long lobj = new Long(12);
		 
		 
		 boolean b1 = intobj.equals(sobj);
		 
		 System.out.println(b1);
		 
		 b1 =aobj.equals(sobj);
		 
		 System.out.println(b1);
		 
		 b1=lobj.equals(sobj);
		 
		 System.out.println(b1);
		 
		 b1 =lobj.equals(intobj);
		 
		 System.out.println(b1);
		 
	}
}
/*
	Output:-
	
	true
	false
	false
	false
*/