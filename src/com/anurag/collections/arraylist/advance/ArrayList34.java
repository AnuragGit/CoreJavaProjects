package com.anurag.collections.arraylist.advance;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * @author Anurag
 *    Concept:-
 *       Binary Search should be on sorted container
         otherwise we should not get expected output.
 */
public class ArrayList34 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("j2ee");
		list.add("abc");
		list.add("java");
		list.add("xyz");
		list.add("hello");
		list.add("test");
		System.out.println("Without Sorted:: " + list);
		System.out.println(Collections.binarySearch(list, "xyz"));
		Collections.sort(list);
		System.out.println("After Sorted:: " + list);
		System.out.println(Collections.binarySearch(list, "xyz"));
		Comparator c = Collections.reverseOrder();
		Collections.sort(list, c);
		System.out.println("Reverse Sorted:: " + list);
		System.out.println(Collections.binarySearch(list, "xyz", c));
		System.out.println("Hello World!");
	}
}
/*
 
Output:-
=========

Without Sorted:: [j2ee, abc, java, xyz, hello, test]
-7
After Sorted:: [abc, hello, j2ee, java, test, xyz]
5
Reverse Sorted:: [xyz, test, java, j2ee, hello, abc]
0
Hello World!

*/
