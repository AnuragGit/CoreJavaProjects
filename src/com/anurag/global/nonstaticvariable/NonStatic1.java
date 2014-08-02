package com.anurag.global.nonstaticvariable;
/**
 * 
 * @author Anurag
 *  Concept:- Non static member can not use directly inside static block.
 *            And we can not be use by class name also.
 */
public class NonStatic1 {
	int i;
	
	public static void main(String[] args) {
	//	System.out.println(i);  We can not use directly
	//	System.out.println(NonStatic1.i);  we can not use followed by name also
	}
}
