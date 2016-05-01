package com.anurag.string;

/**
 * * @author Anurag
 * 
 * Concept:- Every string buffer has a capacity. As long as the length of the
 * character sequence contained in the string buffer does not exceed the
 * capacity, it is not necessary to allocate a new internal buffer array. If the
 * internal buffer overflows, it is automatically made larger.
 * 
 * Initial memory allocation is 16 character and when ever initial capacity is filled then 
 * automatic capacity will increase.
 *
 */
public class  String19
{
	public static void main(String[] args) 
	{
		StringBuffer sb = new StringBuffer();
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		System.out.println("-----------------");
		sb.append("hello");
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		System.out.println("--------------------");
		sb.append("hello");
		sb.append("hello");
		sb.append("hello");
		sb.append("hello");
		sb.append("hello");
		sb.append("hello");

		System.out.println(sb.capacity());
		System.out.println(sb.length());
		
		System.out.println("Hello World!");
	}
}
/*
Output:-

16
0
-----------------
16
5
--------------------
70
35
Hello World!

*/