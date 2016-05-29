package com.anurag.collections.arraylist;

import java.util.ArrayList;

/**
 * @author Anurag
 * 
 *         Concept:- retainAll() method What ever list pass to this method
 *         argument only those element rewrite on list once again and remaining
 *         all will be deleted.
 * 
 * 
 *         Retains only the elements in this list that are contained in the
 *         specified collection. In other words, removes from this list all of
 *         its elements that are not contained in the specified collection.
 */
public class ArrayList17 {
	public static void main(String[] args) {
		ArrayList list1 = new ArrayList();
		list1.add("I");
		list1.add("Am");
		list1.add("best");
		System.out.println(list1);
		ArrayList list2 = new ArrayList();
		list2.add("you");
		list2.add("are");
		list2.add("best");
		System.out.println(list2);
		list2.addAll(list1);
		System.out.println(list2);
		System.out.println("Effect of retainAll() method is :");
		list2.retainAll(list1);
		System.out.println(list2);

		System.out.println("Hello World!");
	}
}
/*
Output:- 

[I, Am, best]
[you, are, best]
[you, are, best, I, Am, best]
Effect of retainAll() method is :
[best, I, Am, best]
Hello World!

*/
