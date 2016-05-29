package com.anurag.collections.arraylist;

import java.util.ArrayList;

/**
 * @author Anurag 
 * 
 * Concept:- removeRange() method is the protected method in side
 *         ArrayList class so to use this method we have to extends ArrayList
 *         class to our own class.
 * 
 *         Removes from this list all of the elements whose index is between
 *         {@code fromIndex}, inclusive, and {@code toIndex}, exclusive. Shifts
 *         any succeeding elements to the left (reduces their index). This call
 *         shortens the list by {@code (toIndex - fromIndex)} elements. (If
 *         {@code toIndex==fromIndex}, this operation has no effect.)
 *
 */
public class ArrayList18 extends ArrayList {
	public static void main(String[] args) {
		ArrayList18 list = new ArrayList18();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		list.add(9);
		System.out.println(list);
		list.removeRange(3, 6);
		System.out.println(list);
		System.out.println("Hello World!");
	}
}

/*
Output:-
========
[1, 2, 3, 4, 5, 6, 7, 8, 9]
[1, 2, 3, 7, 8, 9]
Hello World!

*/