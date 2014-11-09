package com.anurag.wrapperclass;
/**
 * @author Anurag
 *    Concept:-  Converting String to wrapper class object
 */
public class Wrapper3 {
	
	public static void main(String[] args) {
		String str="123";
		
		Integer obj = new Integer(str);
		
		Integer obj2 = Integer.valueOf(str);
		
		System.out.println(obj+"     "+obj2);
		
	}

}
/*	
	
	Output:-
	
	123     123
*/