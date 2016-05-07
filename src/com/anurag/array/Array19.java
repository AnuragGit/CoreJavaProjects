package com.anurag.array;
import java.util.Arrays;
/**
 * @author Anurag
 * 
 *   Concept:- We can not sort the element to basis of all the attribute of class by
 *             using Comparable Interface. Let us see
 *
 */
class Array19_D implements Comparable
{
	int i, j;
	Array19_D(int i,int j)
	{
		this.i=i;
		this.j=j;
	}
	public String  toString()
	{
		return "["+i+","+j+"]";
	}
	public int compareTo(Object obj)
	{
		Array19_D d1 =(Array19_D) obj;
		return i-d1.i;
	}

}
public class Array19  
{
	public static void main(String[] args) 
	{
		Array19_D x[]= new Array19_D[]{new Array19_D(21,12), new Array19_D(1,123), new Array19_D(4,34), new Array19_D(3,1)};
		System.out.println(Arrays.toString(x));
		Arrays.sort(x);
		System.out.println("Sort the Array by first argument below is the output");
		System.out.println(Arrays.toString(x));
		System.out.println("Hello World!");
	}
}

/*Output:-

[[21,12], [1,123], [4,34], [3,1]]
Sort the Array by first argument below is the output
[[1,123], [3,1], [4,34], [21,12]]
Hello World!

*/