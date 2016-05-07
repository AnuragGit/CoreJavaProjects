package com.anurag.array;

/**
 * @author Anurag
 *         Concept:-How to an object become abandon
 */
public class	Array7  
{
	public static void main(String[] args) 
	{
		int x[] = new int[3];
		int y[]= new int[30];
		x=y; //After Execution of this statement , new int[3] will become abandon
		y=x;
		System.out.println("Hello World!");
	}
}
