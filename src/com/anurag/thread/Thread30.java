
package com.anurag.thread;
/**
 * @author Anurag
 *    
 *        Concept:- This program also showing inter thread communications.
 *
 */
class Thread30_A
{
	void test1()
	{
		System.out.println("test1 started");
		synchronized (this)
		{ 
		   try
			{
				wait();    // By which object wait() method will call must be locked by synchronized block
			}
			catch (InterruptedException ex)
			{
				System.out.println(ex);
			}
		}
		System.out.println("test1 end");
	}
   void test2()
	{
	   System.out.println("test2 Started");
		synchronized (this)
		{
			notifyAll();
		}
	System.out.println("test2 end");
	}
}
class Thread30_B extends Thread
{
	Thread30_A obj;
	Thread30_B(Thread30_A obj)
	{
		this.obj =obj;
	}
	public void run()
	{
		System.out.println("run begin");
		obj.test1();
		System.out.println("run end");
	}
}
public class Thread30 
{
	public static void main(String[] args) 
	{
		Thread30_A a = new Thread30_A();
		Thread30_B b = new Thread30_B(a);
		b.start();
		try
		{
			Thread.sleep(1000);

		}
		catch (InterruptedException ex)
		{
			ex.printStackTrace();
		}
         a.test2();
		System.out.println("Hello World!");
	}
}

/*Output:--
run begin
test1 started
test2 Started
test2 end
Hello World!
test1 end
run end*/



