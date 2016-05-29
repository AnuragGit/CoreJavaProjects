package com.anurag.collections.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author Anurag
 *      Concept:-  After traverse the iterator we can do any modification.
 */
public class ArrayList22 
{
	public static void main(String[] args) 
	{
		ArrayList list = new ArrayList();
		list.add(100);
		list.add(10);
		System.out.println(list);
		Iterator it = list.iterator();
		while(it.hasNext())
		{
			Object obj = it.next();
			System.out.println(obj);
			if(obj.equals(10))
			{
				it.remove();
			}
		}
		list.add(200);
		System.out.println(list);
		System.out.println("Hello World!");
	}
}
/*
Output:-
[100, 10]
100
10
[100, 200]
Hello World!

*/