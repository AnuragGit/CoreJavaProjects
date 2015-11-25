package com.anurag.object;
/**
 *  @author Anurag
 *  
 *  Concept:-  Object class is super most of all class.
 */


class Objdect1_A
{
	int i;
	Objdect1_A(int i)
	{
		this.i=i;
	}
}
public class Object1 
{
	public static void main(String[] args) 
	{
		Objdect1_A a1= new Objdect1_A(90);
		Objdect1_A a2= new Objdect1_A(100);
		Objdect1_A a3 =a1;
		System.out.println(a1);  //object class toString() method will call.
		System.out.println(a2);
		System.out.println(a3);

		System.out.println(a1.toString());//  Object class toString() method wil call.
		System.out.println(a2.toString()); // it return classname@hexadecimal hascode.
		System.out.println(a3.toString());

		String s1=a1.toString();
		String s2=a2.toString();
		String s3 =a3.toString();
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

		System.out.println("Hello World!");
	}
}

/*
Output:-


com.anurag.object.Objdect1_A@c3c749
com.anurag.object.Objdect1_A@150bd4d
com.anurag.object.Objdect1_A@c3c749
com.anurag.object.Objdect1_A@c3c749
com.anurag.object.Objdect1_A@150bd4d
com.anurag.object.Objdect1_A@c3c749
com.anurag.object.Objdect1_A@c3c749
com.anurag.object.Objdect1_A@150bd4d
com.anurag.object.Objdect1_A@c3c749
Hello World!

*/