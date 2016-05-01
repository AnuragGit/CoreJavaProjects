package com.anurag.string;
/**
 * 
 * @author Anurag
 *        Concept:- StringBuffer class delete (int,int) method
 */
public class String20 
{
	public static void main(String[] args) 
	{
		StringBuffer sb = new  StringBuffer("abc");
		sb.append("hello");
		System.out.println(sb);
		sb.delete(2,5);//  second argument exclusive
		System.out.println(sb);
		System.out.println("Hello World!");
	}
}
/*
Output:-

abchello
abllo
Hello World!

*/