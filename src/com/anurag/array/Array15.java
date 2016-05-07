package com.anurag.array;
import java.util.Arrays;
/**
 * @author Anurag
 *         Concept:-Sorting in group of character
 */
public class	Array15  
{
	public static void main(String[] args) 
	{
		String x[]={"test","hello","123","Test","ABC","xyz","done"};
		System.out.println(Arrays.toString(x));
		Arrays.sort(x);
		System.out.println(Arrays.toString(x));
		System.out.println("Hello World!");
	}
}
/*
Output:-

[test, hello, 123, Test, ABC, xyz, done]
[123, ABC, Test, done, hello, test, xyz]
Hello World!
*/