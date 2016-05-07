package com.anurag.array;
import java.util.Arrays;
/**
 * @author Anurag
 *         Concept:- Sort mechanism for arrays ,Natural sorting is accending order.
 *
 */
public class	Array13  
{
	public static void main(String[] args) 
	{
		int x[]= new int[]{18,2,34,54,32,9,0,8,65,12,1,2,13,12,14};
		System.out.println(Arrays.toString(x));
         Arrays.sort(x);
		 System.out.println(Arrays.toString(x));
		System.out.println("Hello World!");
	}
}
/*
Output:-

[18, 2, 34, 54, 32, 9, 0, 8, 65, 12, 1, 2, 13, 12, 14]
[0, 1, 2, 2, 8, 9, 12, 12, 13, 14, 18, 32, 34, 54, 65]
Hello World!

*/