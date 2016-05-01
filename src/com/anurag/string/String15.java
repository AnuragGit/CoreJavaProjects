package com.anurag.string;
/**
 * @author Anurag
 *         Concept:-This program is showing the concept of  following method
 *         
 *           startsWith(String str) 
 *                         return true if string start with given arg
 *           
 *           startsWith(String str,int vlaue) 
 *                         return true if string start with given arg wiht given index value
 *            
 *           endsWith(String str)
 *                           return true if string end with given arg.
 */
public class String15 
{
	public static void main(String[] args) 
	{
		String s1="Hello are you fine";
		boolean b= s1.startsWith("Hello");
		System.out.println(b);
		b=s1.startsWith("are",6);
		System.out.println(b);
		b=s1.startsWith(" ");
		System.out.println(b);
		b=s1.startsWith("");
		System.out.println(b);
		System.out.println("------------------------");
		b=s1.endsWith("ne");
		System.out.println(b);
		b=s1.endsWith("");
		System.out.println(b);		
		System.out.println("Hello World!");
	}
}
/*
Output:-

true
true
false
true
------------------------
true
true
Hello World!
*/