package com.anurag.string;

/** 
 * @author Anurag
 *        
 *    Concept:- String object are immutable and here  we are showing string 
 *              constant pool
 */


public class String1 
{
	public static void main(String[] args) 
	{
		String s1 ="abc" ;// String create in constant pool
		String s2 ="abc";// String create in constant pool
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1==s2);//true
		System.out.println(s1.equals(s2)); // equals method override here already.
		System.out.println(s1.hashCode());//hashCode also override  
		System.out.println(s2.hashCode());//hashCode also override  
		System.out.println("Hello World!");
	}
}
/*
Output:-

abc
abc
true
true
96354
96354
Hello World!


*/