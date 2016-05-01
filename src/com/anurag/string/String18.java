package com.anurag.string;
//StringBuffer

/**
 * @author Anurag
 * 
 *       Concept- 
 *       
 *  The principal operations on a <code>StringBuffer</code> are the
 * <code>append</code> and <code>insert</code> methods, which are
 * overloaded so as to accept data of any type. Each effectively
 * converts a given datum to a string and then appends or inserts the
 * characters of that string to the string buffer. The
 * <code>append</code> method always adds these characters at the end
 * of the buffer; the <code>insert</code> method adds the characters at
 * a specified point.
 * <p>
 * For example, if <code>z</code> refers to a string buffer object
 * whose current contents are "<code>start</code>", then
 * the method call <code>z.append("le")</code> would cause the string
 * buffer to contain "<code>startle</code>", whereas
 * <code>z.insert(4, "le")</code> would alter the string buffer to
 * contain "<code>starlet</code>".
 * 
 * WhatEver method is available on String class is also available on StringBuffer also.
 * 
 * But opposite is not correct for ex:- reverse() method is not available inside String class.
 * 
 * String buffers are safe for use by multiple threads. The methods
 * are synchronized
 *
 */
public class  String18
{
	public static void main(String[] args) 
	{
		StringBuffer sb = new StringBuffer();
		sb.append("abc ");
		sb.append("abc ");
		sb.append("abc ");
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
		
		sb  =new StringBuffer("I am  Soni");
		System.out.println(sb);
		sb.insert(5, "Anurag");
		System.out.println(sb);
		
		System.out.println("Hello World!");
	}
}
/*
OutPut:-

abc abc abc 
cba cba cba
I am  Soni
I am Anurag Soni
Hello World!

*/