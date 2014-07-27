package com.anurag.initial;

/**
 * 
 * @author Anurag 
 * 
 * Concept: Unary Operator exercise
 * 
 */

public class Basic12 {

	public static void main(String[] args) {
			int i=0;
			int j= ++i + i++ + i-- +i;
			//       1  + 1   + 2  + 1;
			System.out.println(i); //Print 1
			System.out.println(j); //print 5
	}
}
