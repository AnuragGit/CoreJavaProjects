package com.anurag.collections.arraylist.advance;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * @author Anurag Concept:- Reverse order of sorting
 * 
 *         Returns a comparator that imposes the reverse of the
 *         <em>natural ordering</em> on a collection of objects that implement
 *         the {@code Comparable} interface. (The natural ordering is the
 *         ordering imposed by the objects' own {@code compareTo} method.) This
 *         enables a simple idiom for sorting (or maintaining) collections (or
 *         arrays) of objects that implement the {@code Comparable} interface in
 *         reverse-natural-order. For example, suppose {@code a} is an array of
 *         strings. Then:
 * 
 *         <pre>
 *         Arrays.sort(a, Collections.reverseOrder());
 *         </pre>
 * 
 *         sorts the array in reverse-lexicographic (alphabetical) order.
 *         <p>
 *
 *         The returned comparator is serializable.
 *
 */
public class ArrayList32 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(59);
		list.add(945);
		list.add(190);
		list.add(230);
		list.add(90);
		list.add(910);
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		Collections.sort(list, Collections.reverseOrder());
		System.out.println(list);

		System.out.println("================");

		Object[] obj = list.toArray();
		System.out.println(Arrays.toString(obj));
		Arrays.sort(obj, Collections.reverseOrder());
		System.out.println(Arrays.toString(obj));
		System.out.println("Hello World!");
	}
}
/*
Output:-   
===========

[59, 945, 190, 230, 90, 910]
[59, 90, 190, 230, 910, 945]
[945, 910, 230, 190, 90, 59]
================
[945, 910, 230, 190, 90, 59]
[945, 910, 230, 190, 90, 59]
Hello World!

*/
