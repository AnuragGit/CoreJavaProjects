package com.anurag.collections.arraylist;

import java.util.ArrayList;

/**
 * @author Anurag Concept:- isEmpty() method check if list have any element or
 *         not.
 * 
 * 
 *         Returns <tt>true</tt> if this list contains no elements.
 *
 * @return <tt>true</tt> if this list contains no elements
 * 
 * 
 */
public class ArrayList15 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		System.out.println(list.isEmpty());
		list.add("hello");
		System.out.println(list.isEmpty());
		list.add(200);
		list.add(34);
		list.add(43);
		System.out.println(list);
		list.clear();
		System.out.println(list.isEmpty());
		System.out.println("Hello World!");
	}
}

/*Output:-
==========

true
false
[hello, 200, 34, 43]
true
Hello World!

*/