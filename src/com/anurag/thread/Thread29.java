package com.anurag.thread;
/**
 * @author Anurag
 *   Concept:-
 *        InterThread Communication example 2 
 *   
 */
class Thread29_A
{
	synchronized void test1()
	{
		try
		{
			wait();

		}
		catch (InterruptedException ex)
		{
               System.out.println(ex);

		}
	}
	synchronized void test2()
	{
		notifyAll();
	}
}
class Thread29_B extends Thread
{
	Thread29_A a1;
	Thread29_B(Thread29_A a1)
	{
		this.a1 =a1;
	}
	public void run()
	{
		System.out.println("B Started");
		a1.test1();
		System.out.println("B end");

	}
}
class Thread29_C extends Thread
{
	Thread29_A a1;
	Thread29_C(Thread29_A a1)
	{
		this.a1 =a1;
	}
	public void run()
	{
		System.out.println("C is started");
		a1.test1();
		System.out.println("c is end");
	}
}
class Thread29_D extends Thread
{
	Thread29_A a1;
	Thread29_D(Thread29_A a1)
	{
		this.a1 =a1;
	}
	public void run()
	{
		System.out.println("D is started");
		a1.test1();
		System.out.println("D is end");
	}
}
public class Thread29 
{
	public static void main(String[] args) 
	{
		Thread29_A a1 = new Thread29_A();
		Thread29_A a2 = new Thread29_A();
		Thread29_B b1 = new Thread29_B(a1);
		b1.start();
		Thread29_C c1 =new Thread29_C(a1);
		c1.start();
		Thread29_D d1 =new Thread29_D(a1);
		d1.start();
		try
		{
			Thread.sleep(1000);
		}
		catch (InterruptedException ex)
		{
			System.out.println(ex);
		}
		a1.test2();
		System.out.println("Hello World!");
	}
}
/*
Output:-

B Started
D is started
C is started
D is end
B end
Hello World!
c is end
*/