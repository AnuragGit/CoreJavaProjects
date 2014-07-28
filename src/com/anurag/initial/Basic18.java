package com.anurag.initial;
/**
 * 
 * @author Anurag
 * 
 * concept : if method return other than void return statement is mandatory
 * 
 * Output:- 
 *     test
 *	   10
 *        
 */
public class Basic18 {
	static int test(){
		System.out.println("test");
		return 10;
	}
	 public static void main(String[] args) {
		int i=test();
		System.out.println(i);
	}
}
