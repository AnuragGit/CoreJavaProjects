package com.anurag.array;
import java.util.Arrays;
import java.util.Comparator;
/**
 * @author Anurag
 *        Concept:- This program is showing the sorting by different attribute by
 *                  using comparator interface.
 */

class Array22_Person
{
	String name;
	int age;
	double weight;
	Array22_Person(String name,int age,double weight)
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
			Array22_Person p1 = (Array22_Person)o1;
			Array22_Person p2 = (Array22_Person)o2;
			return p1.name.compareTo(p2.name);
			
		}

	}
	static class SortBasedOnAge implements Comparator
	{
		public int compare(Object o1 ,Object o2)
		{
			Array22_Person p1 = (Array22_Person)o1;
			Array22_Person p2 = (Array22_Person)o2;
			return p1.age-p2.age;
		}

	}
	static  class SortBasedOnWeight implements Comparator
	{
		public int compare(Object o1 ,Object o2)
		{
			Array22_Person p1 = (Array22_Person)o1;
			Array22_Person p2 = (Array22_Person)o2;
			double d=(p1.weight)-(p2.weight);
		    return (int)d;
		}

	}
}

public class Array22 
{
	public static void main(String[] args) 
	{
		Array22_Person x[]={ 
			               new Array22_Person("Anurag",24,55.5),
			               new Array22_Person("Iqbal",25,65.5),
			               new Array22_Person("Vishnu",24,58.5),
			               new Array22_Person("vijay",26,59.5),
			               new Array22_Person("suresh",28,90.5)
		                  };
		

		System.out.println(Arrays.toString(x));
		Arrays.sort(x,new Array22_Person.SortBasedOnName());
		System.out.println("Sort by Name::");
		System.out.println(Arrays.toString(x));
		Arrays.sort(x,new Array22_Person.SortBasedOnAge());
		System.out.println("Sort by Age::");
		System.out.println(Arrays.toString(x));
		Arrays.sort(x,new Array22_Person.SortBasedOnWeight());
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
