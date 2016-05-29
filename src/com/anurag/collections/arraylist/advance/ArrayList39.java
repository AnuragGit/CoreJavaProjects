package com.anurag.collections.arraylist.advance;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author Anurag
 * 
 *         Concept:-Find out the max & min of ArrayList
 * 
 *         Collections.max():-
 *         --------------------
 *         Returns the maximum element of the given collection, according to the
 *         <i>natural ordering</i> of its elements. All elements in the
 *         collection must implement the <tt>Comparable</tt> interface.
 *         Furthermore, all elements in the collection must be <i>mutually
 *         comparable</i> (that is, <tt>e1.compareTo(e2)</tt> must not throw a
 *         <tt>ClassCastException</tt> for any elements <tt>e1</tt> and
 *         <tt>e2</tt> in the collection).
 *         <p>
 * 
 *         Collections.min():-
 *         -------------------- 
 *         Returns the minimum element of the given collection, according to the
 *         <i>natural ordering</i> of its elements. All elements in the
 *         collection must implement the <tt>Comparable</tt> interface.
 *         Furthermore, all elements in the collection must be <i>mutually
 *         comparable</i> (that is, <tt>e1.compareTo(e2)</tt> must not throw a
 *         <tt>ClassCastException</tt> for any elements <tt>e1</tt> and
 *         <tt>e2</tt> in the collection).
 *         <p>
 */
public class ArrayList39 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(100);
		list.add(10);
		list.add(20);
		list.add(50);
		list.add(500);
		list.add(40);
		list.add(60);
		System.out.println(list);
		int i = (Integer) Collections.max(list);
		System.out.println(i);
		i = (Integer) Collections.min(list);
		System.out.println(i);
		System.out.println("Hello World!");
	}
}
/*
Output:-
========
[100, 10, 20, 50, 500, 40, 60]
500
10
Hello World!

*/

