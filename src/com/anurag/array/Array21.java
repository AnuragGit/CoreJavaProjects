package com.anurag.array;
import java.util.Arrays;
import java.util.Comparator;

/**
 * @author Anurag
 * 
 *     Concept:- This example show the sorting mechanism basis  
 *               for all the attribute of class.
 *               
 *               By Using Comparator we can achieve sorting by all attribute.
 *
 */
class Array21_F
{
	int i,j;
	Array21_F(int i, int j)
	{
		this.i=i;
		this.j=j;
	}
   public String toString()
	{
	   return "("+i+","+j+")";
	}
}
class Array21_G implements Comparator
{
   public int compare(Object obj1,Object obj2)
	{
		Array21_F f1 = (Array21_F) obj1;
		Array21_F f2 =(Array21_F)  obj2;
        return f1.i-f2.i;
	}
}
class Array21_H implements Comparator
{
	public int compare(Object obj1,Object obj2)
	{
		Array21_F f1 = (Array21_F)obj1;
		Array21_F f2 =(Array21_F)obj2;
	    return f1.j-f2.j;
	}
}
public class Array21 
{
	public static void main(String[] args) 
	{
		Array21_F x[]= new Array21_F[]{new Array21_F(5,6), new Array21_F(4,3), new Array21_F(2,5)};
		System.out.println(Arrays.toString(x));
		Arrays.sort(x,new Array21_G()); // Overloaded sort method taking Object argument
		System.out.println("Sort by first argument::");
		System.out.println(Arrays.toString(x));
		Arrays.sort(x,new Array21_H()); // Overloaded sort method taking Object argument
		System.out.println("Sort by second argument::");
		System.out.println(Arrays.toString(x));
	}
}

/*
Output:-

[(5,6), (4,3), (2,5)]
Sort by first argument::
[(2,5), (4,3), (5,6)]
Sort by second argument::
[(4,3), (2,5), (5,6)]
*/