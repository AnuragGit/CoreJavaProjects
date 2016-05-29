package com.anurag.collections.arraylist;
//
import java.util.ArrayList;
/**
 * @author Anurag
 *     Concept:- This Program shows  how to fetch the data by get() method from arraylist
 *               
 *                get() method require index. That is develop inside the ArrayList.
 *                
 *                Index start is from zero.
 *
 */
public class ArrayList3 
{
	public static void main(String[] args) 
	{
		ArrayList list = new ArrayList();
		list.add("Hello");
		list.add("are");
		list.add("you");
		list.add(123);
		for(int i=0; i<list.size(); i++)
		{
			  System.out.print(list.get(i)+" ");
		}

		System.out.println("\nHello World!");
	}
}
/*
Output:-

Hello are you 123 
Hello World!
*/