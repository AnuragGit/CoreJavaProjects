package com.anurag.collections.arraylist.advance;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * @author Anurag
 *     Concept:-  Now if we want to sort the data depend on all attribute
                  to achieve this we need to  implement comparator interface
 */
class ArrayList30_D 
{
	int i,j;
	ArrayList30_D(int i,int j)
	{
		this.i=i;
		this.j=j;
	}
	public String toString()
	{
		return "("+i+","+j+")";
	}

}
class ArrayList30_E implements Comparator
{
	public int compare(Object o1,Object o2)
	{
		ArrayList30_D d1 =(ArrayList30_D)o1;
		ArrayList30_D d2 =(ArrayList30_D)o2;
		return d1.i-d2.i;
	}
}
class ArrayList30_F implements Comparator
{
	public int compare(Object o1,Object o2)
	{
		ArrayList30_D d1 =(ArrayList30_D)o1;
		ArrayList30_D d2 =(ArrayList30_D)o2;
		return d1.j-d2.j;
	}
}
public class ArrayList30 
{
	public static void main(String[] args) 
	{
		ArrayList list = new ArrayList();
		list.add(new ArrayList30_D(11,12));
		list.add(new ArrayList30_D(1,10));
		list.add(new ArrayList30_D(15,16));
		list.add(new ArrayList30_D(3,9));
		list.add(new ArrayList30_D(5,1));
		System.out.println(list);
		Collections.sort(list,new ArrayList30_E());
		System.out.println(list);
		Collections.sort(list,new ArrayList30_F());
		System.out.println(list);

		
		System.out.println("Hello World!");
	}
}
/*
Output:-
=========

[(11,12), (1,10), (15,16), (3,9), (5,1)]
[(1,10), (3,9), (5,1), (11,12), (15,16)]
[(5,1), (3,9), (1,10), (11,12), (15,16)]
Hello World!

*/
