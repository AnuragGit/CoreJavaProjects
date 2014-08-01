package com.anurag.global.staticvariable;
/**
 * @author Anurag
 *  Concept:- This progrm show the static variable scope 
 *            It will available through out the program
 *            
 */
public class Static1 {

	 static int i;
	 static void test(){
		 System.out.println(i);
		 i=10;
	 }
	 public static void main(String[] args) {
		i=5;
		System.out.println(i);
		test();
		System.out.println(i);
	}
}

/**
 *   Output: 5
 *           5
 *           10
 */
