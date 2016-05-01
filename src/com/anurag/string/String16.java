package com.anurag.string;
/**
 * 
 * @author Anurag Concept:- This program is showing comparTo() Method of String
 *         class
 * 
 *         the value <code>0</code> if the argument string is equal to this
 *         string; a value less than <code>0</code> if this string is
 *         lexicographically less than the string argument; and a value greater
 *         than <code>0</code> if this string is lexicographically greater than
 *         the string argument
 */
public class String16 
{
	public static void main(String[] args) 
	{
		String s1="a";
		String s2="b";
		String ss2="g";
		String s3="ab";
		String s4="ba";
		String s5="abc";
		String s6="aba";
		String s7="abc";
		String s8="abc";
		String s9="abca";
		String s10="abcabab";
		int i= s1.compareTo(s2);
        System.out.println("s1.compareTo(s2) = "+i);
          i= ss2.compareTo(s2);
        System.out.println("ss2.compareTo(s2) = "+i);
		i= s4.compareTo(s3);
        System.out.println(" s4.compareTo(s3) = "+i);
		i= s4.compareTo(s5);
        System.out.println("s4.compareTo(s5) = "+i);
		i= s5.compareTo(s6);
        System.out.println("s5.compareTo(s6) = "+i);
		i= s6.compareTo(s7);
        System.out.println("s6.compareTo(s7) = "+i);
		i= s7.compareTo(s8);
        System.out.println("s7.compareTo(s8) =  "+i);
		i= s8.compareTo(s9);
        System.out.println("s8.compareTo(s9) = "+i);
		i= s10.compareTo(s9);
        System.out.println("s10.compareTo(s9)=  "+i);
		System.out.println("Hello World!");
	}
}
/*
Output:-

s1.compareTo(s2) = -1
ss2.compareTo(s2) = 5
s4.compareTo(s3) = 1
s4.compareTo(s5) = 1
s5.compareTo(s6) = 2
s6.compareTo(s7) = -2
s7.compareTo(s8) =  0
s8.compareTo(s9) = -1
s10.compareTo(s9)=  3
Hello World!
*/
