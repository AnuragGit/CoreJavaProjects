package com.anurag.string;
/**
 * 
 * @author Anurag
 *         Concept:- This program is showing the concept of charAt(int i) method
 *
 */
public class String13 
{
	public static void main(String[] args) 
	{
		String str ="I am Anurag Soni";
		int length=str.length();
		System.out.println(str+" , "+length);
		for(int i=0; i<length; i++)
		{
			System.out.print(str.charAt(i)+"  ");
		}
		System.out.println("\nHello World!");
	}
}
/*
Output:-

I am Anurag Soni , 16
I     a  m     A  n  u  r  a  g     S  o  n  i  
Hello World!
*/