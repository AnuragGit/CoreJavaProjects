package com.anurag.array;
import java.util.Arrays;
/**
 * @author Anurag
 *         Concept:-Sting array Sort by According to ascii value
 */
public class Array14 
{
	public static void main(String[] args) 
	{
		String x[]= {"c","a","f","b","e","A","D","C","1","3","2"};
		System.out.println(Arrays.toString(x));
		Arrays.sort(x);
		System.out.println(Arrays.toString(x));
		System.out.println(x);
		System.out.println("Hello World!");
	}
}
/*
Output:-

[c, a, f, b, e, A, D, C, 1, 3, 2]
[1, 2, 3, A, C, D, a, b, c, e, f]
[Ljava.lang.String;@a87e7b
Hello World!
*/