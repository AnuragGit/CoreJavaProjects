package com.anurag.final_keyword.staticfinalvariable;

/**
 * 
 * @author Anurag
 *  
 *    Concept:- Static final variable can not survive with default value that should be explicit 
 *    assign by developer.
 */
public class Final10 {
	final static int i=10;
	static final int j=20;
//	static final int z;   
	public static void main(String[] args) {
		System.out.println(i);
		//i=10;  This line give compile time error.
		System.out.println(Final10.j);
		System.out.println(j);
		//j=20; This line give compile time error.
		//Final9.j=70;  This line give compile time error.
	}
}

/*
Output:-

      10
      20
      20
 */