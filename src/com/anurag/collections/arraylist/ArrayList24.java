package com.anurag.collections.arraylist;


import java.util.ArrayList;
import java.util.ListIterator;

/**
 * @author Anurag Concept:-
 *        Use of ListIterator that is a subInterface of Iterator
 * 
 *         List iterator for lists that allows the programmer to
 *         traverse the list in either direction, modify the list during
 *         iteration, and obtain the iterator's current position in the list.
 * 
 *         The returned list iterator is also fail-fast.
 *         
 *         Method inside ListIterator 
 *         =============================
 *           
 *           public abstract boolean hasNext();
 *           public abstract Object next();
 *           public abstract void remove();
 *           public abstract boolean hasPrevious();
 *           public abstract Object previous();
 *           public abstract void add(Object obj); //We can add element like insertion.
 *           public abstract void set(Object obj); // Which ever element can be iterate the same element can be replace.
 *           public abstract int nextIndex();
 *           public abstract int previousIndex();
 *         
 *         
 */
public class ArrayList24 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(100);
		list.add(150);
		list.add(200);
		list.add(250);
		list.add(300);
		System.out.println(list);
		ListIterator lit = list.listIterator();
		//list.add(12);   commented because this line is cause of concurrent modification exception
		while (lit.hasNext()) {
			System.out.println(lit.next());
			
		}
		
		
		System.out.println("---------------");
		
		//list.add(12); commented because this line is cause of concurrent modification exception
		while (lit.hasPrevious()) {
			System.out.println(lit.previous());
		}
		
		//list.add(12); commented because this line is cause of concurrent modification exception
		System.out.println("---------------");
		while (lit.hasNext()) {

			int i = lit.nextIndex();
			lit.next();
			int j = lit.previousIndex();
			System.out.println(list.get(i) + "  " + list.get(j));

		}
		
	
		System.out.println(list);
		System.out.println("Hello World!");
	}
}
/*
Output:-
==========

[100, 150, 200, 250, 300]
100
150
200
250
300
---------------
300
250
200
150
100
---------------
100  100
150  150
200  200
250  250
300  300
[100, 150, 200, 250, 300]
Hello World!

*/
