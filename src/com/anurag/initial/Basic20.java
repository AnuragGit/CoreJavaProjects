package com.anurag.initial;
/**
 * @author Anurag
 *  Concept:- return statement example
 */
public class Basic20 {
	static void test1(int i){
		System.out.println("test1 begin");
		if(i<10){
			System.out.println("rules voilated");
			return;
		}
		System.out.println("test1 end");
	}
	
	public static void main(String[] args) {
		System.out.println("main begin");
		test1(5);
		System.out.println("-----------------------");
		test1(15);
		System.out.println("main end");
	}

}

/**
*  Output:-
*  
*  	 	main begin
		test1 begin
		rules voilated
		-----------------------
		test1 begin
		test1 end
		main end
*
*/