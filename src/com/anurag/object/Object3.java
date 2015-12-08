package com.anurag.object;

/**
 * 
 * @author Anurag
 *
 *    Concept:-
 *    
 *         This program print the state of object . State is nothing but attribute value. 
 *    
 */
class C
{
	int i,j;
	C(int i, int j)
	{
		this.i=i;
		this.j=j;
	}
	public String toString(){
	   return "i="+i+", j="+j;
	}
}
public class Object3 
{
	public static void main(String[] args) 
	{
		C c1 = new C(10,100);
		C c2 = new C(34,87);
		System.out.println(c1);
		System.out.println(c2);
		System.out.println("Hello World!");
	}
}

/*Ouput:-

i=10, j=100
i=34, j=87
Hello World!

*/