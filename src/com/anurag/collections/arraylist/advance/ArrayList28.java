package com.anurag.collections.arraylist.advance;
import java.util.ArrayList;
import java.util.Collections;
/**
 * @author Anurag
 *       
 *       Concept:- Sort to string type of data based on ASCII .
 *
 */
public class ArrayList28 
{
	public static void main(String[] args) 
	{
		ArrayList list = new ArrayList();
		list.add("a");
		list.add("c");
		list.add("d");
		list.add("b");
		list.add("f");
		list.add("e");
		list.add("C");
		list.add("D");
		list.add("B");
		list.add("A");
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		System.out.println("Hello World!");
	}
}
/*
Output:-
==========

[a, c, d, b, f, e, C, D, B, A]
[A, B, C, D, a, b, c, d, e, f]
Hello World!


*/