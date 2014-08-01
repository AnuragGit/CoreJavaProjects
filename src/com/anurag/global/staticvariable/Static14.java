package com.anurag.global.staticvariable;
/**
 * 
 * @author Anurag
 *  Concept:- static variable must declare before use.
 *  
 *       Global variable can be use in any of method while use any global variable to any other global variable we
 *       must follow the order.
 */
public class Static14 {
	//static int i=j;  compile time error , In case of global  variable forward reference is illegal . 
	static int j=10;
	public static void main(String[] args) {
		//System.out.println(i);
		System.out.println(j);
	}

}
