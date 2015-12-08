package com.anurag.object;

/**
 *  * @author Anurag
 *
 *       Concept:-
 *       
 *               Object address represent two different way:
 *               (1) Hexadecimal Representation
 *               (2) Integer Representation
 *               
 *               This program show how our override toString method will be execute.
 */
class Object2_B
{
	int i;
	Object2_B(int i)
	{
		this.i =i;
	}
	public String toString()
	{
		return "i="+i;
	}
}
public class Object2 
{
	public static void main(String[] args) 
	{
		Object2_B b1 = new Object2_B(10);
		Object2_B b2 = new Object2_B(20);
		Object2_B b3 =b1;
		System.out.println(b1);// Override toString() method will call
		System.out.println(b2);
		System.out.println(b3);

		System.out.println(b1.toString());
		System.out.println(b2.toString());
		System.out.println(b3.toString());

		String s1 =b1.toString();
		String s2 =b2.toString();
		String s3 =b3.toString();

		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println("Hello World!");
	}
}
/*
Output:-


i=10
i=20
i=10
i=10
i=20
i=10
i=10
i=20
i=10
Hello World!
*/