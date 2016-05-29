package com.anurag.collections.arraylist;
import java.util.ArrayList;
/**
 * @author Anurag
 *        Concept:-Add one list in specific position.
 */
public class ArrayList8 
{
	public static void main(String[] args) 
	{
		ArrayList list1 = new ArrayList();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(10);
		list1.add(11);
		list1.add(12);
		System.out.println(list1);
		ArrayList list2 = new ArrayList();
		list2.add(4);
		list2.add(5);
		list2.add(6);
		list2.add(7);
		list2.add(8);
		list2.add(9);
		System.out.println(list2);
         list1.addAll(3,list2);
		 System.out.println(list1);
		System.out.println("Hello World!");
	}
}

/*
Output:-

[1, 2, 3, 10, 11, 12]
[4, 5, 6, 7, 8, 9]
[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12]
Hello World!

*/
