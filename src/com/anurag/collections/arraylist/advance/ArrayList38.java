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

public class ArrayList38 
{
	public static void main(String[] args) 
	{
		ArrayList list = new ArrayList();
		list.add(20);
		list.add(10);
		list.add(40);
		list.add(30);
		System.out.println("Without Sorted :: "+list);
		Collections.sort(list);
		System.out.println(" Sorted :: "+list);
		int i=Collections.binarySearch(list,30);
		System.out.println("Location of  30 :: "+i);
		i=Collections.binarySearch(list,1);
		System.out.println("Location of  1 :: "+i);
		i=Collections.binarySearch(list,15);
		System.out.println("Location of  15 :: "+i);
		i=Collections.binarySearch(list,27);
		System.out.println("Location of  27 :: "+i);
		i=Collections.binarySearch(list,21);
		System.out.println("Location of  21 :: "+i);
		i=Collections.binarySearch(list,31);
		System.out.println("Location of  31 :: "+i);
		i=Collections.binarySearch(list,50);
		System.out.println("Location of  50 :: "+i);
		System.out.println("Hello World!");
	}
}
/*

Output:-
===========

         Without Sorted :: [20, 10, 40, 30]
		 Sorted :: [10, 20, 30, 40]
		Location of  30 :: 2
		Location of  1 :: -1
		Location of  15 :: -2
		Location of  27 :: -3
		Location of  21 :: -3
		Location of  31 :: -4
		Location of  50 :: -5
		Hello World!

		
*/