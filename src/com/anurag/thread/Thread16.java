package com.anurag.thread;

/**
 * @author Anurag
 *   
 *     Concept:- How to change the name of thread 
                  // way Second 
 */
class Thread16_I extends Thread
{
	Thread16_I(String a)
	{
		super(a);
	}

	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println(getName());
			try
			{
				Thread.sleep(1000);
			}
			catch (InterruptedException ex)
			{
				System.out.println(ex);
			}
		}
	}
}
public class Thread16
{
	public static void main(String[] args) 
	{
		Thread16_I obj = new Thread16_I("abc");
		//obj.setName("Anurag");
		obj.start();
		System.out.println("Hello World!");
	}
}
/*
Output:-

Hello World!
abc
abc
abc
abc
abc
abc
abc
abc
abc
abc
*/