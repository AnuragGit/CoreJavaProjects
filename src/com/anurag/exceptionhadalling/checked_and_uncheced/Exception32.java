package com.anurag.exceptionhadalling.checked_and_uncheced;
/**
 * @author Anurag
 * 
 *     Concept:-  
 *     
 *     If method throws the checked Exception the we can keep method empty also.
 *
 */
public class Exception32 
{
		static	void test1() throws ClassNotFoundException
		{
			Class.forName(" ");
		}
		void test2() throws ClassNotFoundException
		{
		}
		void test3() throws NullPointerException 
		{

		}
	public static void main(String[] args)                                                                                                                                                                
	{
         
		System.out.println("Hello World!");
	}
}
/*
Output:-

Hello World!

*/