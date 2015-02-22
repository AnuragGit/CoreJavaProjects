package com.anurag.thread;

/**
 * @author Anurag
 *   
 *     Concept:- Achieve id,name,priority and daemon status of main  thread it self
 */
public class Thread14 
{
	public static void main(String[] args) 
	{
		Thread t = Thread.currentThread();		
		System.out.println(t.getId());
		System.out.println(t.getName());
		System.out.println(t.getPriority());
		System.out.println(t.isDaemon());
		System.out.println("Hello World!");
	}
}

/*
Output:-

1
main
5
false
Hello World!
*/