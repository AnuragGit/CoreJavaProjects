package com.anurag.final_keyword;
/**
 * @author Anurag
 *   
 *   Concept:-  In this program member of class is final. so we can not initialize more than once.     
 */
class Final4_A{
	final int i=10;
}
public class Final4 {
	public static void main(String[] args) {
		Final4_A a1 = new Final4_A();
		System.out.println(a1.i);
		//a1.i=20;  This line will give error .
 	}
}
/*	
	Output:-
	
	10
	
*/
