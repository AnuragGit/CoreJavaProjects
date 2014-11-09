package com.anurag.wrapperclass;
/**
 * @author Anurag
 *   
 *     Concept:- Converting wrapper object to primitive
 */
public class Wrapper10 {
	
	public static void main(String[] args) {
		
		Integer intobj = new Integer(100);
		Integer intobj1 =Integer.valueOf(125);
		
		int i=intobj.intValue();
		
		System.out.println(i);
		
		i=intobj1.intValue();
		
		System.out.println(i);
		
	}
}
/*	
	Output:-
	
	100
	125
*/
