package com.anurag.thread;
//Interthread Communication 
class Thread28_Share
{
	synchronized void test1()
	{
		try
		{
			wait();
		}
		catch (InterruptedException  ex)
		{
			System.out.println(ex);
		}
	}
	synchronized void test2()
	{
		notifyAll();
	}
}
class Thread28_A extends Thread
{
	Thread28_Share a1;
	Thread28_A(Thread28_Share a1)
	{
		this.a1=a1;
	}
	public void run()
	{
		System.out.println("started");
		a1.test1();
		System.out.println("end");
	}
}
public class Thread28 
{
	public static void main(String[] args) 
	{
		Thread28_Share a1 = new Thread28_Share();
		Thread28_Share a2 = new Thread28_Share();
		Thread28_A t1 = new Thread28_A(a1);
		t1.start();
		Thread28_A t2 = new Thread28_A(a1);
		t2.start();
		try
		{
			Thread.sleep(1000);
		}
		catch (InterruptedException ex)
		{
			System.out.println(ex);
		}
	
		a2.test2();
		//a2.test2(); it is not relase the wait() method because by a1
		// object lock wait () method was called so only
		// a1 object able to  the release () the wait through notify() method. 
		System.out.println("Hello World!");
	}
}
