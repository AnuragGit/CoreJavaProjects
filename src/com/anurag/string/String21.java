package com.anurag.string;
/**
 * 
 * @author Anurag
 * 
 *       Concept:-This program is showing how to set initial capacity of StringBuffer class.
 *
 */
public class  String21
{
	public static void main(String[] args) 
	{
		StringBuffer sb = new StringBuffer(20);
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

20
0
-----------------
20
5
--------------------
42
35
Hello World!
*/
