package com.anurag.array;
/**
 * 
 * @author Anurag
 *         Concept:- Default value of each Array Data types
 *         
 */
public class Array2 
{
	public static void main(String[] args) 
	{
		int [] x= new int[1];
		System.out.println(x[0]);//0

		float [] f= new float[1];
		System.out.println(f[0]);//0.0

		double [] d = new double[1];
		System.out.println(d[0]);//0.0

		char c [] = new char[1];
		System.out.println("char"+c[0]+"acter");//single space
		
		boolean [] b= new boolean [1];
		System.out.println(b[0]); //false

        Integer i[]= new Integer[1];
		System.out.println(i[0]);//null All derived data type is null only.       
		System.out.println("Hello World!");
	}
}
/*
Output:-

0
0.0
0.0
char acter
false
null
Hello World!
*/