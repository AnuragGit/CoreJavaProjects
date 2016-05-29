package com.anurag.collections.arraylist;
//fetch arraylist content by enhanced for loop
import java.util.ArrayList;
/**
 * @author Anurag
 *      Concept:- We can print collection type of container through enhance for loop.
 *      
 *      In collection devision List,Queue,Set are coming So we can print by enhance for loop.
 *      
 *      Map are not collection type.
 */
public class ArrayList5 
{
	public static void main(String[] args) 
	{
		ArrayList list = new ArrayList();
		list.add(34);
		list.add(12);
		list.add(32);
		list.add(76);
		list.add(78);
		list.add(56);
		System.out.println(list);
		System.out.println("-----------------");
		for(Object a:list)
		System.out.println(a);

		System.out.println("Hello World!");
	}
	
}
/*
Output:-

[34, 12, 32, 76, 78, 56]
		-----------------
		34
		12
		32
		76
		78
		56
		Hello World!
*/
