package com.anurag.array;
//sorting the content of own array class 
//it require to implement comparable interface. This interface contain 
//one unimplemented method we have to implement this method that is compareTo()
import java.util.Arrays;
/**
 * @author Anurag
 * 
 *     Concept:- sort method of Arrays class is internally calling compareTo method for 
 *               doing sorting operation , Here we are trying to sort the user define class
 *               So this class should be implement Comparable interface and provide the 
 *               implementation of compareTo method . Otherwise compiler will throw class
 *               caste exception.
 *               
 *      
 *
 */
class Array18_C implements Comparable
{
	int i;
	Array18_C(int i)
	{
		this.i=i;
	}
	public String toString()
	{
		return "i="+i;
	}
   public int compareTo(Object obj)
	{
	   return i-((Array18_C)obj).i;
	}

}
public class Array18  
{
	public static void main(String[] args) 
	{
		Array18_C x[]= new Array18_C[]{new Array18_C(12),new Array18_C(7), new Array18_C(3),new Array18_C(87),new Array18_C(34)};
		System.out.println(Arrays.toString(x));
		Arrays.sort(x);
		System.out.println(Arrays.toString(x));
		System.out.println("Hello World!");
	}
}

/*
Output:-

[i=12, i=7, i=3, i=87, i=34]
[i=3, i=7, i=12, i=34, i=87]
Hello World!*/
