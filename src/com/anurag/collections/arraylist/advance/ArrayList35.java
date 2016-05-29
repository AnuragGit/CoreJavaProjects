package com.anurag.collections.arraylist.advance;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * @author Anurag
 *    Concept:-
 *       Binary Search should be on sorted container
         otherwise we should not get expected output.
 */
public class ArrayList35
{
	public static void main(String[] args) 
	{
		ArrayList list = new ArrayList();
		list.add(123);
		list.add(564);
		list.add(19);
		list.add(20);
		list.add(23);
		list.add(12);
		System.out.println("Without Sorted:: "+list);
		System.out.println(Collections.binarySearch(list,20));
		Collections.sort(list);
		System.out.println("After Sorted:: "+list);
		System.out.println(Collections.binarySearch(list,20));
		Comparator c =Collections.reverseOrder();
		Collections.sort(list,c);
		System.out.println("Reverse Sorted:: "+list);
		System.out.println(Collections.binarySearch(list,20,c));
		System.out.println("Hello World!");
	}
}
/*
Output:-
========

Without Sorted:: [123, 564, 19, 20, 23, 12]
3
After Sorted:: [12, 19, 20, 23, 123, 564]
2
Reverse Sorted:: [564, 123, 23, 20, 19, 12]
3
Hello World!

*/
