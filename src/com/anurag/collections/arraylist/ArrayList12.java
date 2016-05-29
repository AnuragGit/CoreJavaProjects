package com.anurag.collections.arraylist;

import java.util.ArrayList;

/**
 * @author Anurag Concept:- This program is showing remove() method concept.
 * 
 * 
 *         Removes the element at the specified position in this list. Shifts
 *         any subsequent elements to the left (subtracts one from their
 *         indices).
 *
 * @param index
 *            the index of the element to be removed
 * @return the element that was removed from the list
 * @throws IndexOutOfBoundsException
 *             {@inheritDoc}
 *
 * 
 */
public class ArrayList12 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("hello");
		list.add("hai");
		list.add(123);
		list.add(31);
		list.add(321);
		System.out.println(list);
		Object obj = list.remove(1);
		System.out.println(list);
		String str = (String) list.remove(0);// remove method return type is
												// object.
		System.out.println(list);
		System.out.println("Remove items:" + obj + "    " + str);
		System.out.println("Hello World!");
	}
}
/*
Output:-

[hello, hai, 123, 31, 321]
[hello, 123, 31, 321]
[123, 31, 321]
Remove items:hai    hello
Hello World!
*/