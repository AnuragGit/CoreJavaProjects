package com.anurag.string;
/**
 * @author Anurag
 * 
 *  Concept:- This program will show following method concept (1)
 *         replace(oldchar, newchar); a string derived from this string by
 *         replacing every occurrence of <code>oldChar</code> with
 *         <code>newChar</code>.
 * 
 *         (2) replace(string,string); Replaces each substring of this string
 *         that matches the literal target sequence with the specified literal
 *         replacement sequence. The replacement proceeds from the beginning of
 *         the string to the end, for example, replacing "aa" with "b" in the
 *         string "aaa" will result in "ba" rather than "ab".
 * 
 *         (3)toCharArray(); Converts this string to a new character array.
 *
 *         a newly allocated character array whose length is the length of this
 *         string and whose contents are initialized to contain the character
 *         sequence represented by this string.
 *
 */
public class String17 
{
	public static void main(String[] args) 
	{
		String str="ABC x	 ABC x ABC";
		System.out.println(str);
		System.out.println(str.replace('x','1'));
		System.out.println(str);
		System.out.println(str.replace("AB","DD"));
		System.out.println("----------------------------");
		char c[]=str.toCharArray();
		for(char i:c)
			System.out.print(i);
		System.out.println("\nHello World!");
	}
}

/*
Output:-

ABC x	 ABC x ABC
ABC 1	 ABC 1 ABC
ABC x	 ABC x ABC
DDC x	 DDC x DDC
----------------------------
ABC x	 ABC x ABC
Hello World!

*/