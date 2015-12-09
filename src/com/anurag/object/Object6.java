package com.anurag.object;
/**
 * @author Anurag
 *   Concept:- This program show how to override the equals method of object class.
 */
class Object6_F
{
	int i;  
	Object6_F(int i)
	{
		this.i=i;
	}

	
	public boolean equals(Object obj)
	{
		
		     Object6_F f= (Object6_F) obj;
		     return i==f.i;
		 
		
		//return i==((Object6_F)obj).i; // one line syntax
	}
}
public class Object6 
{
	public static void main(String[] args) 
	{
		Object6_F f1 =new Object6_F(10);
		Object6_F f2 =new Object6_F(10);
		Object6_F f3 =f1;
        System.out.println(f1==f2);
        System.out.println(f2==f3);
        System.out.println(f3==f1);
        System.out.println("---------------");
		System.out.println(f1.equals(f2));
		System.out.println(f2.equals(f3));
		System.out.println(f3.equals(f1));
	
		System.out.println("Hello World!");
	}
}
/*
Output:-

false
false
true
---------------
true
true
true
Hello World!*/
