package com.anurag.global.nonstaticvariable;
/**
 * 
 * @author Anurag
 *	
 *   Concept:- Non static variable can not be used inside static content 
 *             directly. 
 */
public class NonStatic4 {
	
	 int i;
	 static void test(){
		 // i=10;  We can not call directly
	 }

}
