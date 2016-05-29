package com.anurag.collections.arraylist.advance;
import java.util.ArrayList;

/**
 * @author Anurag
 *        
 *        Concept:- Program to store own class element  inside the ArrayList.
 *                  During the printing of arraylist toString method is gettting call
 *                  thats's why we are overriding toString() method. 
 */
class ArrayList26_A
{
	int i;
	ArrayList26_A(int i)
	{
		this.i=i;
	}
	public String toString()
	{
		return "i="+i;
	}
}
public class ArrayList26 
{
	public static void main(String[] args) 
	{
		ArrayList list = new ArrayList();
		list.add( new ArrayList26_A(12));
		list.add( new ArrayList26_A(121));
		list.add( new ArrayList26_A(112));
		list.add( new ArrayList26_A(112));
		list.add( new ArrayList26_A(102));
		list.add( new ArrayList26_A(120));
		System.out.println(list);  
		System.out.println("Hello World!");
	}
}
/*
Output:-
========

[i=12, i=121, i=112, i=112, i=102, i=120]
Hello World!

*/

