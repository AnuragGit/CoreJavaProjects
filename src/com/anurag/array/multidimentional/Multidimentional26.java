package com.anurag.array.multidimentional;
/**
 * @author Anurag
 *         Concept:- First dimensional array not initialize. So code will give compile Time 
 *                   Error.
 */
class Multidimentional26 
{
	public static void main(String[] args) 
	{
		int [][]x  = new int[4][];
		System.out.println(x[2][1]); //Null pointer Exception will come
		System.out.println("Hello World!");
	}
}
/*
Output:-

Exception in thread "main" java.lang.NullPointerException
at com.anurag.array.multidimentional.Multidimentional26.main(Multidimentional26.java:12)
*/