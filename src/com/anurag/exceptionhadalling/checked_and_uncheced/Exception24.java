package com.anurag.exceptionhadalling.checked_and_uncheced;
/**
 * @author Anurag
 *   
 *     Concept:- This program show  checked Exception  ClassNotFoundException 
 */
public class Exception24 
{
	public static void main(String[] args) throws ClassNotFoundException 
	{
		Class.forName("com.anurag.exceptionhadalling.returnstatement.Exception23");
		System.out.println("Hello World!");
	}
}
