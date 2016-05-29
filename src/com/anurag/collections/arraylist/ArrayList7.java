package com.anurag.collections.arraylist;
import java.util.ArrayList;
/**
 * @author Anurag
 *        Concept:-How to insert the add in between array list
                    by using overloaded add () method  specifying by index
 */
public class ArrayList7 
{

	public static void main(String[] args) 
	{
		ArrayList list = new ArrayList();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		System.out.println(list);
		list.add(3,3.1);
		System.out.println(list);
		System.out.println("Hello World!");
	}
}


/*
Output:-

[1, 2, 3, 4, 5]
[1, 2, 3, 3.1, 4, 5]
Hello World!
*/