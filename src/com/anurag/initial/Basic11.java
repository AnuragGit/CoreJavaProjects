package com.anurag.initial;
/**
 * 
 * @author Anurag
 *
 * Concept:-  Unary Operator Exercise  
 */
public class Basic11 {
	public static void main(String[] args) {
		int i=0;
		int j= i++  + i++  +i;
		      //0   + 1    + 2  (left to right)
		
		System.out.println(i); // print i= 2
		System.out.println(j); // print j=3;
	}
}
