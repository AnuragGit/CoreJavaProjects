package com.anurag.collections.arraylist.advance;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author Anurag
 *     Concept:-  How to sort own class member that stored inside the arraylist.
 *     
 *            sort() method of Collections class taking the elements of list and check 
 *            it's comparable or not then it call to comapareTo() method and achieve
 *            sorting.
 *            
 *            To achieve Sorting with the element of ArrayList
 *            
 *              (1) All element should be same dataType.
 *              (2) No Element should be null.
 *              (3) Every element is a type of comparable .You  have to use comparable 
 *                  interface.
 */
class ArrayList27_B implements Comparable
{
	int i;
	ArrayList27_B(int i)
	{
		this.i=i;
	}
	public String toString()
	{
		return "i="+i;
	}
	public int compareTo(Object obj)
	{
		return i-((ArrayList27_B)obj).i;
	}
}
public class  ArrayList27
{
	public static void main(String[] args) 
	{
		ArrayList list = new ArrayList();
		list.add(new ArrayList27_B(12));
		list.add(new ArrayList27_B(22));
		list.add(new ArrayList27_B(42));
		list.add(new ArrayList27_B(19));
		list.add(new ArrayList27_B(1));
		list.add(new ArrayList27_B(102));
		list.add(new ArrayList27_B(2));
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);

		System.out.println("Hello World!");
	}
}
/*
Output:-
==========
[i=12, i=22, i=42, i=19, i=1, i=102, i=2]
[i=1, i=2, i=12, i=19, i=22, i=42, i=102]
Hello World!

*/
