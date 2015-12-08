package com.anurag.object;

/**
 * @author Anurag
 *   
 *    Concept:-
 *          This program show the concept of == and equals method both are given result based on 
 *          memory address not a value or content basis.
 *          
 *          By default or internally  equals method using == operator.
 */
class Object4_D
{
	int i;
	Object4_D(int i)
	{
		this.i=i;
	}
}
public class Object4 
{
	public static void main(String[] args) 
	{
		Object4_D d1 = new Object4_D(10);
		Object4_D d2 = new Object4_D(10);
	    Object4_D d3 = d1;
		System.out.println(d1==d2);
		System.out.println(d2==d3);
		System.out.println(d3==d1);
		System.out.println("----------------");
		
		System.out.println(d1.equals(d2));   // Object class equal method always consider ==
		System.out.println(d2.equals(d3));
		System.out.println(d3.equals(d1));

		System.out.println("Hello World!");
	}
}

/*
Object:-

false
false
true
----------------
false
false
true
Hello World!
*/