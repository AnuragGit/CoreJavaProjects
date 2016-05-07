package com.anurag.array;
/**
 * 
 * @author Anurag
 *         Concept:- Some another way to initialization of array at the time of 
 *                   deceleration only
 */
public class	Array10  
{
	public static void main(String[] args) 
	{
		int x[]= new int[]{10,20,30,40,50};
		System.out.println(x.length);
		for(int i=0; i<x.length;i++)
			System.out.println(x[i]);
		System.out.println("Hello World!");
	}
}

/*Output:-

5
10
20
30
40
50
Hello World!*/