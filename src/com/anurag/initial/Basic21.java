package com.anurag.initial;
/**
 * @author Anurag
 * 
 * Concept: retrun statement example with unary operator
 */
public class Basic21 {

	static int test(int i){ // 1, 3
		return i++;
	}
	
	public static void main(String[] args) {
		int k=0;
		k= k++  + test(k++) + test(++k) + k;
		// 0    + 1        +  3 +       3
		
		System.out.println(k);
	}
}

/**
 *  Output:-
 *  
 *        7
 */
