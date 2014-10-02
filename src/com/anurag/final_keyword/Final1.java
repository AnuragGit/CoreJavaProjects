package com.anurag.final_keyword;
/**
 * @author Anurag
 * 
 *       Concept:-  The final variable can not be initialize more than once.
 *
 *               
 */
public class Final1 {
	public static void main(String[] args) {
		int i=0;
		final int j=10;
		System.out.println(i);
		System.out.println(j);
		i=1000;
		//j=10;  j is final variable we can not initialize once again.
	
		System.out.println("Done");
	}
	
	static void test(int i, final int j){
		System.out.println(i);
		System.out.println(j);
		i=10;
		//j=20;  This line give compile time error.
		System.out.println(i);
		System.out.println(j);
	}
}
	/*
	Output:-
	
	0
	10
	Done
*/