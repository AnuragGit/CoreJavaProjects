package com.anurag.thread;
// one more example of synchronized block.
class Thread31_A extends Thread
{
	public synchronized void run()
	{
		System.out.println("begin");
		try
		{
			wait();

		}
		catch (InterruptedException ex)
		{
			ex.printStackTrace();
		}
		System.out.println("end");
	}
}
public class Thread31
{
  public static void main(String[] args) 
	{
	
	     Thread31_A t1 = new Thread31_A();
     	t1.start();
	    try
    	{
		Thread.sleep(10000);
	     }
	    catch (InterruptedException ex)
	     {
	     	ex.printStackTrace();
	     }
	    System.out.println("before Synchronized");
		 synchronized (t1)
		{    System.out.println("start****");
			 t1.notify();
			 System.out.println("end******");
		}
		System.out.println("after Synchronized");
		System.out.println("Hello World!");
	}
}
/*
Output:-

begin
before Synchronized
start****
end******
after Synchronized
end
Hello World!

*/