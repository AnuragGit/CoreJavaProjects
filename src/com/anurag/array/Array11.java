package com.anurag.array;
/**
 * @author Anurag
 *     Concept:- pass array object  by function
 *
 */
class Array11 
{
	public static void main(String[] args) 
	{
		test(new int[]{10,20,30,40});
		System.out.println("Hello World!");
	}
	public static void test(int x[])
	{
		System.out.println(x.length);
		for(int i:x)
		System.out.println(i);
		// In above SOP if we print x[i] the you got ArrayIndexoutofBounds Exception becasue 
		// this will try to get x[10] and this much size we don't have on array.
	}
}
/*
Output:-

4
10
20
30
40
Hello World!*/