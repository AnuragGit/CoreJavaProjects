package com.anurag.array;
import java.util.Arrays;
/**
 * @author Anurag
 *       Concept:- Different way of print the array elements
 */
public class Array12 
{
	public static void main(String[] args) 
	{
		int x[]={1,20,30,40,12,6,15};
		for (int i=0;i<x.length ;i++ )
		{
			System.out.println(x[i]);
		}
		System.out.println("--------------");
		for(int i:x)
		{
			System.out.println(i);
		}
		System.out.println("-----------------");
		System.out.println(Arrays.toString(x));

		System.out.println("Hello World!");
	}
}
/*
Output:-

1
20
30
40
12
6
15
--------------
1
20
30
40
12
6
15
-----------------
[1, 20, 30, 40, 12, 6, 15]
Hello World!
*/