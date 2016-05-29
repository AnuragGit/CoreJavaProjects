package com.anurag.collections.arraylist;
import java.util.ArrayList;
/**
 * @author Anurag
 *     Concept:- This Program shows Arraylist, to allow to add any type of value.
 *               Inside ArrayList Class toString method got Override.
 *               Which ever Order we are adding element ,same order it is printing.
 *     
 *     
 *
 */
public class ArrayList1 
{
	public static void main(String[] args) 
	{
		ArrayList list = new ArrayList();
		list.add(120);
		list.add(12.0);
		list.add("abc");
		list.add(true);
		System.out.println(list);
		System.out.println("Hello World!");
	}
}

/*Output:- [120, 12.0, abc, true]
		Hello World!*/