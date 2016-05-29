package com.anurag.collections.arraylist;

import java.util.ArrayList;

/**
 * @author Anurag Concept:- If one list contain the data of another list so
 *         through removeAll()method we can remove all the data of another list.
 * 
 *         Removes from this list all of its elements that are contained in the
 *         specified collection.
 */
public class ArrayList16 {
	public static void main(String[] args) {
		ArrayList list1 = new ArrayList();
		list1.add("Anurag");
		list1.add("vishnu");
		list1.add("vikash");
		list1.add("Iqbal");
		list1.add("vijay");
		System.out.println("list1 is:--->" + list1);
		ArrayList list2 = new ArrayList();
		list2.add(1);
		list2.add(2);
		list2.add(3);
		list2.add(4);
		list2.add(5);
		System.out.println("list2 is--->" + list2);
		list2.addAll(list1);
		System.out.println("Modify list2 is---->" + list2);
		list2.removeAll(list1);
		System.out.println("Modify list2 is---->" + list2);

		System.out.println("Hello World!");
	}
}
/*
Output:-

list1 is:--->[Anurag, vishnu, vikash, Iqbal, vijay]
list2 is--->[1, 2, 3, 4, 5]
Modify list2 is---->[1, 2, 3, 4, 5, Anurag, vishnu, vikash, Iqbal, vijay]
Modify list2 is---->[1, 2, 3, 4, 5]
Hello World!

*/