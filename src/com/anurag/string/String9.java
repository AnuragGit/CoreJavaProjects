package com.anurag.string;
/**
 * 
 * @author Anurag
 *          Concept:- This program show subString method concept.
 *                     substring(a,b)
 *                     a- is inclusive
 *                     b -is exclusive
 */
public class String9 
{
	public static void main(String[] args) 
	{
		String str ="LARA TECHNOLOGY";	
		                //01 2 3456 78 9
		String str1=str.substring(0,4);
		String str2=str.substring(5,9);
		System.out.println(str1);
		System.out.println(str2);
		String str3=str.substring(0);
		System.out.println(str3);
		System.out.println("Hello World!");
	}
}

/*
Output:-

LARA
TECH
LARA TECHNOLOGY
Hello World!

*/
