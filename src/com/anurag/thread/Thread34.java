//Thread Local 
package com.anurag.thread;
class A extends Thread
{
	ThreadLocal t;
	A(ThreadLocal t)
	{
		this.t=t;
	}
	public void run()
	{
		System.out.println("1:"+t.get());
		t.set(10);
		Utils.sleep(500);
		System.out.println("2:"+t.get());
		t.set(20);
		Utils.sleep(500);
		System.out.println("3:"+t.get());
		t.set(30);
		Utils.sleep(500);
		System.out.println("4:"+t.get());
		t.set(40);
		Utils.sleep(500);
	}
}
class B extends Thread
{
	ThreadLocal t;
	B(ThreadLocal t)
	{
		this.t=t;
	}
	public void run()
	{
		System.out.println("5:"+t.get());
		t.set(50);
		Utils.sleep(500);
		System.out.println("6:"+t.get());
		t.set(60);
		Utils.sleep(500);
		System.out.println("7:"+t.get());
		t.set(70);
		Utils.sleep(500);
		System.out.println("8:"+t.get());
		t.set(80);
		Utils.sleep(500);
	}
}
class Utils
{
	public static void sleep(long millis)
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
}
public class Thread34 
{
	public static void main(String[] args) 
	{
		ThreadLocal t = new ThreadLocal();
		t.set(90);
		A a1 = new A(t);
		a1.start();
		Utils.sleep(500);
		System.out.println("9:"+t.get());
		t.set(100);
		B b1 = new B(t);
		b1.start();
		Utils.sleep(500);
		System.out.println("10:"+t.get());
		System.out.println("Hello World!");
	}
}
