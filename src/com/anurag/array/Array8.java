package com.anurag.array;

/**
 * 
 * @author Anurag
 *      Concept:- Casting concept in arrays
 *      In below program x is an integer array reference variable assign to object.
 *      x data type is integer array so built in class is [I and that is subclass of Object.
 *      So statement  Object obj= x is  doing AutoUpcasting.
 *      
 *      But we will get compile time error when we write obj[0]=10;
 *      Because obj is ordinary variable not array variable.
 *      int z[] =(int []) objt is performing downcasting operation.
 *
 */
public class Array8 
{
	public static void main(String[] args) 
	{
		int x[]= new int[5];
		for(int i=0;i<5;i++)
		     x[i]=i;
		Object obj= x; //Auto Upcasting is here
		int y[]=x;
		int z[]= (int[])obj; //DownCasting is here
		
		for(int i=0;i<5;i++){
			System.out.println(" x[i]="+x[i]+" and y[i] ="+y[i]+" and z[i] = "+z[i]);
		}
		System.out.println("Hello World!");
	}
}
/*
Output:-

x[i]=0 and y[i] =0 and z[i] 0
x[i]=1 and y[i] =1 and z[i] 1
x[i]=2 and y[i] =2 and z[i] 2
x[i]=3 and y[i] =3 and z[i] 3
x[i]=4 and y[i] =4 and z[i] 4
Hello World!
 */