package com.anurag.collections.arraylist;

import java.util.ArrayList;
/**
 * @author Anurag
 *        Concept:-How to add value of from one arrayList to another Arraylist
 */
public class ArrayList6 
{
	public static void main(String[] args) 
	{
		ArrayList list1 = new ArrayList();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		System.out.println(list1);
		ArrayList list2= new ArrayList();
		list2.add(5);
		list2.add(6);
		list2.add(7);
		list2.add(8);
		System.out.println(list2);
		list1.addAll(list2);
		System.out.println(list1);
		System.out.println("Hello World!");
	}
}
/*
Output:-

[1, 2, 3, 4]
[5, 6, 7, 8]
[1, 2, 3, 4, 5, 6, 7, 8]
Hello World!
*/
