package com.anurag.array;

/**
 * 
 * @author Anurag
 *         Concept:-Assign references to another array. It means both reference  
 *                  variable will point to same Heap address and do same behavior.
 */
public class Array5 
{
	public static void main(String[] args) 
	{
		int x[]= new int[3];
		int y[]=x;
		x[0]=1;
		y[1]=2;
		x[2]=3;
		System.out.println(x[0]);
		System.out.println(x[1]);
		System.out.println(x[2]);
		System.out.println("-------------");
		System.out.println(y[0]);
		System.out.println(y[1]);
		System.out.println(y[2]);

	}
}
/*
Output:-
1
2
3
-------------
1
2
3*/
  
