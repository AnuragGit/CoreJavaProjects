package com.anurag.initial;
/**
 * 
 * @author Anurag
 * Concept: How to call static method inside another static mehtod
 * 
 * output:-
 *  from test1
	from main 
	from test2

 */
public class Basic17 {

	static void test1(){
		System.out.println("from test1");
	}
	public static void main(String[] args) {
		test1();
		System.out.println("from main ");
		test2();
	}
	
	static void test2(){
		System.out.println("from test2");
	}
}
