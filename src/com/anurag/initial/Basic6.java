package com.anurag.initial;
/**
 * 
 * @author Anurag
 *  Concept:- Local variable shoud be use after Initialization otherwise compile time error
 *  will be occur 
 */
public class Basic6 {
	public static void main(String[] args) {
		System.out.println("main begin");
		int i;
	//	System.out.println(i); compiler will give error 
		
		System.out.println(i=10);
		//First i=10 will execute and this concept is knows as pass by value.
		System.out.println("main end");
	}
}
