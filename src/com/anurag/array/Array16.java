package com.anurag.array;
import java.util.Arrays;
/**
 * @author Anurag
 *         Concept:- Create our own derived data type   and using inside array
 *                   but toString() method not override that why we are getting that 
 *                   kind of output
 *
 */
class Array16_A
{
	int i;
}
public class Array16
{
	public static void main(String[] args) 
	{
		Array16_A a1 = new Array16_A();
		a1.i=10;
		Array16_A a2 = new Array16_A();
		a2.i=20;
		Array16_A a3 = new Array16_A();
		a3.i=60;
		Array16_A x[] = new Array16_A[3];
		x[0]=a1;
		x[1]=a2;
		x[2]=a3;
		System.out.println(Arrays.toString(x));
		System.out.println(x);
		System.out.println("Hello World!");
	}
}
/*
Output:-
[com.anurag.array.Array16_A@1d8643e, com.anurag.array.Array16_A@19d277e, com.anurag.array.Array16_A@8bf135]
[Lcom.anurag.array.Array16_A;@1890c67
Hello World!
!*/
