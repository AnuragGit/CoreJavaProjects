package com.anurag.array;

/**
 * 
 * @author Anurag
 *           Concept:- Passing the reference to another way
 */
public class  Array6
{
	public static void main(String[] args) 
	{
		int x[]= new int [2];
		System.out.println(x[0]);
		System.out.println(x[1]);
		test(x);
		System.out.println("---------------------");
		System.out.println(x[0]);
		System.out.println(x[1]);
	}
	public static void test(int y[])
	{
		y[0]=10;
		y[1]=100;
    }
}
/*
Output:-

0
0
---------------------
10
100
*/