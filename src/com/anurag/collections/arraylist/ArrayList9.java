package com.anurag.collections.arraylist;
import java.util.ArrayList;
/**
 * @author Anurag
 *        Concept:-This program is showing ArrayList class having constructor which can 
 *                  take argument as other arrayList.
 *                  
 *                  So we are defining list 2 that will take content of list1 and the time
 *                  of declaration time while using constructor.
 */
public class ArrayList9 
{
	public static void main(String[] args) 
	{
		ArrayList list1= new ArrayList();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		System.out.println(list1);
		ArrayList list2 =new ArrayList(list1);
		list2.add(5);
		list2.add(6);
		list2.add(7);
		list2.add(8);
		list2.add(9);
		list2.add(10);
		System.out.println(list2);
		System.out.println("Hello World!");
	}
}


/*
Output:-

[1, 2, 3, 4]
[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
Hello World!


*/
