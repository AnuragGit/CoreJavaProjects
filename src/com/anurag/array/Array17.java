package com.anurag.array;
import java.util.Arrays;
/**
 * 
 * @author Anurag
 *        Concept:-Overriding the toString() method
 *
 */
class Array17_B
{
	int i;
	Array17_B(int i)
	{
		this.i=i;
	}
	public String  toString()
	{
		return "i="+i;
	}
}
public class Array17 
{
	public static void main(String[] args) 
	{
		Array17_B b1 = new Array17_B(10);
		Array17_B b2 = new Array17_B(12);
		Array17_B b3 = new Array17_B(14);
		Array17_B b4 = new Array17_B(16);
		Array17_B b5 = new Array17_B(18);
		Array17_B  [] x= new Array17_B[]{b1,b2,b3,b4,b5};
		System.out.println(x);
		System.out.println(Arrays.toString(x));
		System.out.println("Hello World!");
	}
}

/*Output:-

[Lcom.anurag.array.Array17_B;@1d8643e
[i=10, i=12, i=14, i=16, i=18]
Hello World!

*/