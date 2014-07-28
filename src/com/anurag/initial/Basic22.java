package com.anurag.initial;
/**
 * @author Anurag
 *	Concept: return statement example with static method and unary operator.
 */
public class Basic22 {

	static int test(int j){
		return ++j;
	}
	
	public static void main(String[] args) {
		int i=0;
		
		i= i++ + test(i++)  +test(++i)  + test(i) + i;
		// 0   + 2          + 4         + 4      + 3
		
		System.out.println(i);
	}
}


/**
 *   Output:-
 *         13
 */
