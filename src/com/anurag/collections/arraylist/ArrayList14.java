package com.anurag.collections.arraylist;

import java.util.ArrayList;

/**
 * @author Anurag Concept:- if we want to remove every element for array list we
 *         use clear() method ,Removes all of the elements from this list. The
 *         list will be empty after this call returns.
 */
public class ArrayList14 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("hello");
		list.add("hai");
		System.out.println(list);
		list.clear();
		System.out.println(list);
		System.out.println("Hello World!");
	}
}

/*
Output:-
==========

[hello, hai]
[]
Hello World!

*/