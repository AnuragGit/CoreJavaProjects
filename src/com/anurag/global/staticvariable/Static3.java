package com.anurag.global.staticvariable;
/**
 * @author Anurag
 *   Concept:- Global variable available among the class
 */
public class Static3 {
	
	static void test(){
		System.out.println(i);
		 i=1;
		System.out.println(i);
	}
	
	public static void main(String[] args) {
		test();
		System.out.println(i);
		i=2;
		test();
		System.out.println(i);
		
	}
	
	static int i;
}

/**
 *   OUtput:-  
 *             0
 *             1
 *             1
 *             2
 *             1
 *             1
 */
