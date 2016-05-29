package com.anurag.collections.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author Anurag Concept:-
 * 
 *         Removes from the underlying collection the last element returned by
 *         this iterator (optional operation). This method can be called only
 *         once per call to {@link #next}. The behavior of an iterator is
 *         unspecified if the underlying collection is modified while the
 *         iteration is in progress in any way other than by calling this
 *         method.
 */
public class ArrayList20 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		System.out.println(list);
		Iterator it = list.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
			it.remove();
		}
		System.out.println(list);
		System.out.println("Hello World!");
	}
}
/*
Output:-
============

[10, 20, 30, 40, 50]
10
20
30
40
50
[]
Hello World!
*/

