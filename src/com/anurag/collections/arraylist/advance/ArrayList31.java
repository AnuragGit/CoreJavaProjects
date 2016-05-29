package com.anurag.collections.arraylist.advance;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;

/**
 * @author Anurag
 *     
 *     Concept:- create one person class that requiere to sort our all attributes.
 */
class Person
{
	String name;
	int age;
	double weight;
	Person(String name,int age,double weight)
	{
	    this.name=name;
		this.age=age;
		this.weight=weight;
	}

	public String toString()
	{
		return name+","+age+","+weight;
	}
	static class  SortBasedOnName implements Comparator
	{
		public int compare(Object o1,Object o2)
		{
			Person p1=(Person)o1;
			Person p2=(Person)o2;
			return p1.name.compareTo(p2.name);
		}
	}
	static class  SortBasedOnAge implements Comparator
	{
		public int compare(Object o1,Object o2)
		{
			Person p1=(Person)o1;
			Person p2=(Person)o2;
			return p1.age-p2.age;
		}
	}
	static class  SortBasedOnWeight implements Comparator
	{
		public int compare(Object o1,Object o2)
		{
			Person p1=(Person)o1;
			Person p2=(Person)o2;
			return (int)(p1.weight-p2.weight);
		}
	}
}

public class ArrayList31 
{
	public static void main(String[] args) 
	{
		ArrayList list =  new ArrayList();
		list.add(new Person("Anurag",24,55.67));
		list.add(new Person("vijay",26,50.67));
		list.add(new Person("suresh",20,45.67));
		System.out.println(list);
		Collections.sort(list,new Person.SortBasedOnName());
		System.out.print("Sort Based on Name:: ");
		System.out.println(list);
	    Collections.sort(list,new Person.SortBasedOnAge());
	    System.out.print("Sort Based on Age:: ");
		System.out.println(list);
		Collections.sort(list,new Person.SortBasedOnWeight());
		System.out.print("Sort Based on Weight:: ");
		System.out.println(list);
		System.out.println("Hello World!");
	}
}
/*
Output:-
=========

[Anurag,24,55.67, vijay,26,50.67, suresh,20,45.67]
Sort Based on Name:: [Anurag,24,55.67, suresh,20,45.67, vijay,26,50.67]
Sort Based on Age:: [suresh,20,45.67, Anurag,24,55.67, vijay,26,50.67]
Sort Based on Weight:: [suresh,20,45.67, vijay,26,50.67, Anurag,24,55.67]
Hello World!

*/
