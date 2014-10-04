package com.anurag.staticImport;
import  static java.lang.Long.*;
import static java.lang.Integer.MAX_VALUE;

/**
 * @author Anurag
 * 
 *         Concept:-  Because Long and Integer both having same static variable name MAX_VALUE
 *                    so we can not import both static member.
 *                    
 *                    if we try import static java.lang.Long.MAX_VALUE; then we will get compile time error.
 *                    
 *                    so what ever static variable imported progrm will consider only that one.
 *                    
 *                    In this program only Integer Max value got printed.
 *
 */
public class StaticImport10 {
	public static void main(String[] args) 
	{
		System.out.println(MAX_VALUE);
		System.out.println(MAX_VALUE);
		System.out.println("Hello World!");
	}
}

/*Output:-
2147483647
2147483647
Hello World!*/


