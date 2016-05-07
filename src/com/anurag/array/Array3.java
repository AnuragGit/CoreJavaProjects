package com.anurag.array;

/**
 * @author Anurag
 *       Concept:- Precaution of defining array size.
 */
public class Array3 {
	public static void main(String[] args) {
		int[] x = new int[0];
		System.out.println(x[0]); // ArrayIndexOutofBounds Exception
		System.out.println("Hello World!");
	}
}

/*Output:-

Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 0
at com.anurag.array.Array3.main(Array3.java:10)
*/