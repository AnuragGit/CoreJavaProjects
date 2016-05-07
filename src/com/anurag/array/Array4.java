package com.anurag.array;

/**
 * 
 * @author Anurag
 *           Concept:- This program is showing What happened if you try to 
 *                      print the array reference variable.
 *                      
 *                      (1) We are getting classname and @hexdecimal number
 *                      (2) Reason is Array is derived dataType and for every array
 *                          there is one built in class internally , in side this class
 *                          toString() not got override that's why we are getting this 
 *                          type of output.
 */
public class Array4 
{
	public static void main(String[] args) 
	{
		int x[] = new int[2];
		int i[]= new int [3]; 
		int z[]=x;
		int y[]=i;
		System.out.println(x);//[I@1e5e2c3
		System.out.println(i);//[I@18a992f
		System.out.println(z);//[I@1e5e2c3
		System.out.println(y);//[I@18a992f
		z=i;
		y=x;
		System.out.println("----------------");
		System.out.println(z);//[I@18a992f
		System.out.println(y);//[I@1e5e2c3

		double d[]=new double[1];
		System.out.println(d);

		Integer a[] = new Integer[1]; //[Ljava.lang.Integer;@1fc4bec
		System.out.println(a);

		Double e[]= new Double[1];
		System.out.println(e);//[Ljava.lang.Double;@dc8569
		System.out.println("Hello World!");
	}
}
/*
Output:-

[I@1623820
[I@152e7a4
[I@1623820
[I@152e7a4
----------------
[I@152e7a4
[I@1623820
[D@1e5ebbf
[Ljava.lang.Integer;@19d277e
[Ljava.lang.Double;@8bf135
Hello World!


*/
