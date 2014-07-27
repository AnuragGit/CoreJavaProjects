package com.anurag.initial;
/**
 * @author Anurag
 * 
 * Concept: Unary Operator under local variable .
 *
 */
public class Basic13 {

		public static void main(String[] args) {
			
			int i;
			i++; // Compile time error because local variable not initialized 
			System.out.println(i);
		}
}
