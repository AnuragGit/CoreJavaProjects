package com.anurag.string;

/**
 * @author Anurag
 * 
 *         Concept:-
 *              This program is showing the behavior of String by concat() method
 * 
 *
 */
public class String5 
{
	public static void main(String[] args) 
	{
		String s1 ="abc";
		s1=s1.concat("123"); // created new String Object on NonConstant pool because reference variable got used. 
		System.out.println(s1);
		s1.concat("231");
		System.out.println(s1); //abc123 only because we not assign to s1.
		String s2="abc123";// String created in constant pool 
		
		System.out.println(s1==s2); //false.
		
		System.out.println("===============================");
		String s3="abc";
		s3="abc".concat("145");  // created new String Object on Non Constant pool because concat() method is returning  by new String()
		
		String s4="abc145";
		System.out.println(s3==s4);  //false
		System.out.println("Hello World!");
	}
}
/*
Output:-

abc123
abc123
false
===============================
false
Hello World!

*/

