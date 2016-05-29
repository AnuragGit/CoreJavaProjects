package com.anurag.collections.arraylist.advance;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Anurag
 * 
 *         Concept:- Binaray Search Program
 * 
 *         Searches the specified list for the specified object using the binary
 *         search algorithm. The list must be sorted into ascending order
 *         according to the {@linkplain Comparable natural ordering} of its
 *         elements (as by the {@link #sort(List)} method) prior to making this
 *         call. If it is not sorted, the results are undefined. If the list
 *         contains multiple elements equal to the specified object, there is no
 *         guarantee which one will be found.
 */
public class ArrayList33 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(95);
		list.add(100);
		list.add(70);
		list.add(900);
		list.add(70);
		list.add(190);
		System.out.println(list);
		System.out.println(Collections.binarySearch(list, 70));
		Collections.sort(list);
		System.out.println(list);
		System.out.println(Collections.binarySearch(list, 70));
		System.out.println("Hello World!");
	}
}
/*
Output:-
==========

[95, 100, 70, 900, 70, 190]
2
[70, 70, 95, 100, 190, 900]
0
Hello World!

*/
