package com.anurag.collections.arraylist.advance;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author Anurag
 * 
 *         Concept:- (1)We can sort the arraylist by help of Utility class
 *         Collections. (2) In case of sorting ArrayList should be contain same
 *         type of element. (3) Should not contain null value.
 * 
 *         Sorts the specified list into ascending order, according to the
 *         {@linkplain Comparable natural ordering} of its elements. All
 *         elements in the list must implement the {@link Comparable} interface.
 *         Furthermore, all elements in the list must be <i>mutually
 *         comparable</i> (that is, {@code e1.compareTo(e2)} must not throw a
 *         {@code ClassCastException} for any elements {@code e1} and {@code e2}
 *         in the list).
 */
public class ArrayList25 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(112);
		list.add(912);
		// list.add(12.1); classcastException occurs
		list.add(152);
		list.add(512);
		list.add(212);
		list.add(132);
		list.add(145);
		// list.add(null); NullPointerException occurs
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		System.out.println("Hello World!");
	}
}
/*
Output:-
========

[112, 912, 152, 512, 212, 132, 145]
[112, 132, 145, 152, 212, 512, 912]
Hello World!

*/
