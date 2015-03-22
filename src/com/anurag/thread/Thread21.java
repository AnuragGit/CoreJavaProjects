package com.anurag.thread;
/**
 * @author Anurag
 * 
 *     Concept:-
 *     
 *     Checking  the default property of  Thread
 *
 */
class Thread21_Utils
{
	static void sleep(long millis)
	{
		try
		{
			Thread.sleep(millis);
		}
		catch (InterruptedException ex)
		{
			System.out.println(ex);
		}
	}
	static void printDetails()
	{
		Thread t =Thread.currentThread();
		System.out.println("CurrentThread:"+t);
		System.out.println(t.getId());
		System.out.println(t.getName());
		System.out.println(t.getPriority());
		System.out.println(t.isDaemon());
	}
}
class R extends Thread
{
	public void run()
	{
		Thread21_Utils.printDetails();
	}
}
class S extends Thread
{
	public void run()
	{
		Thread21_Utils.printDetails();
	}
}
class T extends Thread
{
	public void run()
	{
		Thread21_Utils.printDetails();
	}
}
public class Thread21 
{
	public static void main(String[] args) 
	{
		Thread21_Utils.printDetails();
		Thread21_Utils.sleep(10000);
		R r1=new R();
		r1.start();
		Thread21_Utils.sleep(10000);
		S s1 =new S();
		s1.start();
		Thread33_Utils.sleep(10000);
		T t1 = new T();
		t1.start();
		System.out.println("Hello World!");
	}
}

/*
Output:-

CurrentThread:Thread[main,5,main]
1
main
5
false
CurrentThread:Thread[Thread-0,5,main]
8
Thread-0
5
false
CurrentThread:Thread[Thread-1,5,main]
9
Thread-1
5
false
Hello World!
CurrentThread:Thread[Thread-2,5,main]
10
Thread-2
5
false
*/
