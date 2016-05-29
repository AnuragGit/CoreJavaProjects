package com.anurag.collections.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author Anurag
 *    Concept:-  
 *           After getting the iterator use the iterator and iterator all the object .
 *           but if we try to next time iterator it do nothing
 */
public class ArrayList23 
{
	public static void main(String[] args) 
	{
		ArrayList list = new ArrayList();
		list.add(1);
		list.add(2);
		list.add(3);
		System.out.println(list);
		Iterator it = list.iterator();
		
		System.out.println("First time of same iterator  it.hasNext() is :: "+it.hasNext());
		System.out.println(it.next());
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println(" --------------");
		
		System.out.println("Second time of same iterator  it.hasNext() is :: "+it.hasNext());
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println(list);
		System.out.println("Hello World!");
	}
}
/*
Output:-  

[1, 2, 3]
First time of same iterator  it.hasNext() is :: true
1
2
3
 --------------
Second time of same iterator  it.hasNext() is :: false
[1, 2, 3]
Hello World!
*/
