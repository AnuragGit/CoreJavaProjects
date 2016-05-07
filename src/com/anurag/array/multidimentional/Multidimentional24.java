package com.anurag.array.multidimentional;
//Two Dimensional Array
public class	Multidimentional24  
{
	public static void main(String[] args) 
	{
		int x[]=new int[2];
		int y[]= new int[2];
		int z[]= new int[2];
		x[0]=1;
		x[1]=2;
		y[0]=3;
		y[1]=4;
		z[0]=5;
		z[1]=6;

		int a[][]= {x,y,z};
	    for(int []c:a)
			for(int i:c)
			System.out.println(i);
		System.out.println("----------------------");
		for(int i=0;i<a.length;i++)
			for(int j=0;j<a[i].length;j++)
			     System.out.println(a[i][j]);
		System.out.println("Hello World!");
	}
}
