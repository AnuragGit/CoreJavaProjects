package com.anurag.collections.arraylist.advance;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author Anurag
 *   
 *   Concept:- Some more practice in binary search
 *   
 *   Imp point of Binary Search
 *   
 *             (1) Only for sroted container
 *             (2) If at all sorting is reverseOrder while doing binary search 
 *                 we need to pass three argument.
 *             (3) If search element is not there then it see which element range is 
 *                  Satisfy according to range it give value with negative string.
 */
public class ArrayList37 
{
	public static void main(String[] args) 
	{
		ArrayList list = new ArrayList();
		list.add("blue");
		list.add("red");
		list.add("yellow");
		list.add("orange");
		System.out.println("Without Sorted :: "+list);
		Collections.sort(list);
		System.out.println("Sorted :: "+list);
		int i=Collections.binarySearch(list,"orange");
		System.out.println("orange location is :: "+i);
		i=Collections.binarySearch(list,"Indigo");
		System.out.println("Indigo location is :: "+i);
		i=Collections.binarySearch(list,"voilet");
		System.out.println("voilet location is :: "+i);
		i=Collections.binarySearch(list,"abc");
		System.out.println("abc location is :: "+i);
		i=Collections.binarySearch(list,"xyz");
		System.out.println("xyz location is :: "+i);
		System.out.println("Hello World!"); 
	}
}
/*
Output:-
=========

Without Sorted :: [blue, red, yellow, orange]
Sorted :: [blue, orange, red, yellow]
orange location is :: 1
Indigo location is :: -1
voilet location is :: -4
abc location is :: -1
xyz location is :: -4
Hello World!

*/
