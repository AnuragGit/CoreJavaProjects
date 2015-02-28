package com.anurag.thread;
/**
 * @author Anurag
 *   
 *     Concept:- same concept child thread priority depend on parent thread priority
 */
class Thread23_U extends Thread
{
	public void run()
	{
		System.out.println(getId());
		System.out.println(getName());
		System.out.println(getPriority());
		System.out.println(isDaemon());
		setPriority(8);
		Thread23_V v1 = new Thread23_V();
		v1.start();
	}
}
class Thread23_V extends Thread
{
	public void run()
	{ 
		Thread t =Thread.currentThread();
	    System.out.println("-------------------");
		System.out.println("CurrentThread:"+t);
		System.out.println(getId());
		System.out.println(getName());
		System.out.println(getPriority());
		System.out.println(isDaemon());
	    System.out.println("-------------------");
	
	}
}
public class Thread23 
{
	public static void main(String[] args) 
	{
		Thread23_U u1 = new Thread23_U();
		u1.start();
		System.out.println("Hello World!");
	}
}

/*
Output:-

Hello World!
8
Thread-0
5
false
-------------------
CurrentThread:Thread[Thread-1,8,main]
9
Thread-1
8
false
-------------------
*/