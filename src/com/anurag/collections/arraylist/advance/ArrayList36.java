package com.anurag.collections.arraylist.advance;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * @author Anurag
 *       Concept:- How to sort the data in reverseorder and search again this reverese list.
 *       
 */
public class ArrayList36 
{
	public static void main(String[] args) 
	{
		ArrayList list = new ArrayList();
		list.add("a");
		list.add("g");
		list.add("k");
		list.add("i");
		list.add("p");
		list.add("w");
		list.add("y");
		list.add("b");
		list.add("e");
		list.add("f");
		System.out.println("Without Sort:: "+list);
		int p=Collections.binarySearch(list,"i");
		System.out.println("i location is :: "+p);
        Comparator c =Collections.reverseOrder();
		Collections.sort(list);
		System.out.println("Sorted :: "+list);
		int i=Collections.binarySearch(list,"i");
		System.out.println("i location is :: "+i);
		Collections.sort(list,c);
		

		int j=Collections.binarySearch(list,"i",c);
		System.out.println("Reverse Sorted :: "+list);
        System.out.println("i location is :: "+j);
		System.out.println("Hello World!");
	}
}
/*
Output:-
==========

Without Sort:: [a, g, k, i, p, w, y, b, e, f]
i location is :: -3
Sorted :: [a, b, e, f, g, i, k, p, w, y]
i location is :: 5
Reverse Sorted :: [y, w, p, k, i, g, f, e, b, a]
i location is :: 4
Hello World!

*/
