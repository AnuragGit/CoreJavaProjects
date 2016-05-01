package com.anurag.string;
/**
 * 
 * @author Anurag
 *          Concept:- This program is showing split method concept
 *                     split(String reg);
 *                     split(String reg,int limit);
 */
public class String10 
{
	public static void main(String[] args) 
	{
		String str ="abc;xyz;pqr;stuv;efg;dop;mno";
		String s[]=str.split(";");
		for(String s1:s)
		{
			System.out.println(s1);
		}
		System.out.println("-----------------");
		String s2[]=str.split(";",3);
		for(String s1:s2)
		{
			System.out.println(s1);
		}
		System.out.println("Hello World!");
	}
}
/*
Output:-

abc
xyz
pqr
stuv
efg
dop
mno
-----------------
abc
xyz
pqr;stuv;efg;dop;mno
Hello World!*/