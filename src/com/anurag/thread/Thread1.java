package com.anurag.thread;


/**
 * @author Anurag 
 *    
 *         Concept:-
 *         
 *         Simple program in Thread There are three Thread
 *         1.ThreadSchedular ( responsible to allocate cpu the time to thread)
 *         2.Grabage Collector( removing abandond object)
 *         3.Main Thread (To execute main() method top to bottom)
 */

public class Thread1 
{
	public static void main(String[] args) 
	{
		for(int i=0; i<10; i++)
		{
			System.out.println(i);
		}
		for(int i=10;i<20;i++)
		{
			System.out.println(i);
		}
		System.out.println("Hello World!");
	}
}
/*
	Output:-
	0
	1
	2
	3
	4
	5
	6
	7
	8
	9
	10
	11
	12
	13
	14
	15
	16
	17
	18
	19
	Hello World!

*/