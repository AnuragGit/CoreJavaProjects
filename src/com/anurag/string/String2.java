package com.anurag.string;

/** 
 * @author Anurag
 *        
 *    Concept:- String object are immutable and here  we are 
 *              showing String Object create in NonConstantpool.
 */

public class String2 
{
	public static void main(String[] args) 
	{
		String s1 =new String("abc");// String create in Nonconstant pool
		String s2 =new String("abc");// String create in Nonconstant pool
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1==s2); //false
		System.out.println(s1.equals(s2)); // equals method override here already.give result based on value
		System.out.println(s1.hashCode());//hashCode also override  it give int value based on String value
		System.out.println(s2.hashCode());//hashCode also override  it give int value based on String value
		System.out.println("Hello World!");
	}
}

/*Output:-

abc
abc
false
true
96354
96354
Hello World!*/