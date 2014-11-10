package com.anurag.wrapperclass;

/**
 * @author Anurag
 *   
 *     Concept:- This program will show which one will be come first in case of overloading method.
 */
public class Wrapper15 {
	
	static void test(byte b){
		System.out.println("byte");
	}
	
	static void test1(Byte b1){
		System.out.println("Byte");
	}
	
	public static void main(String[] args) {
		byte b1 =10;
		test1(b1);
	}
	
}
