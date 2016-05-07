package com.anurag.array;

import java.util.Arrays;
import java.util.Comparator;
/**
 * @author Anurag
 * 
 *    Concept:- 
 *    This program is showing the person class data in
       sort order by different attribute by using comparator interface
       Small difference in Array22 in Data Type double- Double because we are using compareTo() method for comparing weight.
 *
 */
class Person
{
	String name;
	int age;
	Double weight;
	Person(String name,int age,double weight)
	{
		this.name= name;
		this.age=age;
		this.weight=weight;
	}
	public String toString()
	{
		return name+","+age+","+weight;
    }
	static class SortBasedOnName implements Comparator
	{
		public int compare(Object o1 ,Object o2)
		{
			Person p1 = (Person)o1;
			Person p2 = (Person)o2;
		    return p1.name.compareTo(p2.name);
		}

	}
	static class SortBasedOnAge implements Comparator
	{
		public int compare(Object o1 ,Object o2)
		{
			Person p1 = (Person)o1;
			Person p2 = (Person)o2;
			return p1.age-p2.age;
		}

	}
	static  class SortBasedOnWeight implements Comparator
	{
		public int compare(Object o1 ,Object o2)
		{
			Person p1 = (Person)o1;
			Person p2 = (Person)o2;
			return p1.weight.compareTo(p2.weight);
		}

	}
}

public class Array23
{
	public static void main(String[] args) 
	{
		Person x[]={ 
			               new Person("Anurag",24,55.5),
			               new Person("Iqbal",25,65.5),
			               new Person("Vishnu",24,58.5),
			               new Person("vijay",26,59.5),
			               new Person("suresh",28,90.5)
		                  };
		

		System.out.println(Arrays.toString(x));
		Arrays.sort(x,new Person.SortBasedOnName());
		System.out.println("Sort by Name::");
		System.out.println(Arrays.toString(x));
		Arrays.sort(x,new Person.SortBasedOnAge());
		System.out.println("Sort by Age::");
		System.out.println(Arrays.toString(x));
		Arrays.sort(x,new Person.SortBasedOnWeight());
		System.out.println("Sort by Weight::");
		System.out.println(Arrays.toString(x));
		System.out.println("Hello World!");
	}
}
/*
Output:-

[Anurag,24,55.5, Iqbal,25,65.5, Vishnu,24,58.5, vijay,26,59.5, suresh,28,90.5]
Sort by Name::
[Anurag,24,55.5, Iqbal,25,65.5, Vishnu,24,58.5, suresh,28,90.5, vijay,26,59.5]
Sort by Age::
[Anurag,24,55.5, Vishnu,24,58.5, Iqbal,25,65.5, vijay,26,59.5, suresh,28,90.5]
Sort by Weight::
[Anurag,24,55.5, Vishnu,24,58.5, vijay,26,59.5, Iqbal,25,65.5, suresh,28,90.5]
Hello World!


*/
