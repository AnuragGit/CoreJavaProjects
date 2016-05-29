package com.anurag.collections.arraylist;

import java.util.ArrayList;

/**
 * @author Anurag Concept:-Overloaded remove() method that take element in
 *         argument.
 * 
 *         Removes the first occurrence of the specified element from this list,
 *         if it is present. If the list does not contain the element, it is
 *         unchanged. More formally, removes the element with the lowest index
 * @param o
 *            element to be removed from this list, if present
 * @return <tt>true</tt> if this list contained the specified element
 * 
 */
public class ArrayList13 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(12);
		list.add(13);
		list.add(14);
		list.add(15);
		list.add(16);
		list.add("hello");
		list.add("hai");
		list.add('c');
		System.out.println(list);
		boolean flag1 = list.remove("hello"); // return type of this remove
												// method is boolean.
		// boolean flag2 =list.remove('c'); This remove method only applicable
		// for string datatype
		System.out.println(flag1);
		System.out.println(list);
		System.out.println("Hello World!");
	}
}
/*
Output:- 
[12, 13, 14, 15, 16, hello, hai, c]
true
[12, 13, 14, 15, 16, hai, c]
Hello World!

*/