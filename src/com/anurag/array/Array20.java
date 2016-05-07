package com.anurag.array;
import java.util.Arrays;
/**
 * @author Anurag
 *         Concept:-  Now this example show short by second attribute by
 *                    using Comparable interface
 *
 */
class Array20_E implements Comparable
{
	int i, j;
	Array20_E(int i, int j)
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
		Array20_E array20_E =(Array20_E)obj;
		return j-array20_E.j;
	}

}
public class Array20 
{
	public static void main(String[] args) 
	{
		Array20_E x[] = new Array20_E[]{new Array20_E(12,88), new Array20_E(13,65), new Array20_E(45,12), new Array20_E(3,9)};
		System.out.println(Arrays.toString(x));
		Arrays.sort(x);
		System.out.println("Sorting based on second attribute below is the output");
		System.out.println(Arrays.toString(x));
		System.out.println("Hello World!");
	}
}
/*
Output:-

[(12,88), (13,65), (45,12), (3,9)]
Sorting based on second attribute below is the output
[(3,9), (45,12), (13,65), (12,88)]
Hello World!
*/
