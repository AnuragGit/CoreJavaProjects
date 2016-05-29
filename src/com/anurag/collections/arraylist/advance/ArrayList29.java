package com.anurag.collections.arraylist.advance;

import java.util.ArrayList;
import java.util.Collections;
/**
 * @author Anurag
 *       Concept:- Let us assume class have two attribue i and j sorting based on i value.
 */
class ArrayList29_C implements Comparable
{
	int i,j;
	ArrayList29_C(int i,int j)
	{
		this.i=i;
		this.j=j;
	}
	public String toString()
	{
		return "("+i+","+j+")";
	}
	public int compareTo(Object obj)
	{
		return i-((ArrayList29_C)obj).i;
	}
}
public class ArrayList29 
{
	public static void main(String[] args) 
	{
		ArrayList list = new ArrayList();
		list.add(new ArrayList29_C(10,20));
		list.add(new ArrayList29_C(5,21));
		list.add(new ArrayList29_C(3,20));
		list.add(new ArrayList29_C(20,20));
		list.add(new ArrayList29_C(1,20));
		list.add(new ArrayList29_C(0,20));
		list.add(new ArrayList29_C(11,20));
		list.add(new ArrayList29_C(100,20));
		list.add(new ArrayList29_C(110,20));
		list.add(new ArrayList29_C(90,20));
		list.add(new ArrayList29_C(220,20));
		list.add(new ArrayList29_C(19,20));
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		System.out.println("Hello World!");
	}
}

/*
Output:-
===========

[(10,20), (5,21), (3,20), (20,20), (1,20), (0,20), (11,20), (100,20), (110,20), (90,20), (220,20), (19,20)]
[(0,20), (1,20), (3,20), (5,21), (10,20), (11,20), (19,20), (20,20), (90,20), (100,20), (110,20), (220,20)]
Hello World!
*/
