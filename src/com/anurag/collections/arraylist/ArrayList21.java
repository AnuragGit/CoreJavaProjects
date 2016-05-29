package com.anurag.collections.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author Anurag
 *    
 *    Concept:-
 *    if we use iterator the we must traverse the iterator 
      no other operation are perform on that time
      other wise concurrent modification Exception occurs.
 */
public class ArrayList21 
{
	public static void main(String[] args) 
	{
		ArrayList list = new ArrayList();
		list.add(100);
		list.add(10);
		System.out.println(list);
		Iterator it = list.iterator();
        //list.add(200);      because concurrentModificationException occurs.
		while(it.hasNext())
		{
			Object obj = it.next();
			System.out.println(obj);
			if(obj.equals(10))
			{
				it.remove();
			}
		}
		System.out.println(list);
		System.out.println("Hello World!");
	}
}
/*
Output:-

[100, 10]
100
10
[100]
Hello World!

*/
