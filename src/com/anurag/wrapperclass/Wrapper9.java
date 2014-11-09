package com.anurag.wrapperclass;

/**
 * @author Anurag
 *   
 *   Concept:- Converting Primitive value to wrapper object
 */
public class Wrapper9 {
	public static void main(String[] args) {
		int i=10;
		Integer intobj= new Integer(i);
		Integer intobj1 =Integer.valueOf(i);
		System.out.println(intobj);
		System.out.println(intobj1);
	}
}

/*
        Output:-
        
        10
        10
*/