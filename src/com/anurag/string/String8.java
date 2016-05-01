package com.anurag.string;
/**
 * @author Anurag
 *         Concept:- This program show length() method
 */
public class String8 
{
	public static void main(String[] args) 
	{
		String str="abc";
		System.out.println(str.length());
		String str1=null;
		//System.out.println(str1.length());// create nullpointer Exception
		String str2="null";
		System.out.println(str2.length());
		String str3 ="  abc 123  ";
		System.out.println(str3.length());
		str3=str3.trim();
		System.out.println(str3.length());
		System.out.println("Hello World!");
	}
}
/*
Output:-
3
4
11
7
Hello World!

*/