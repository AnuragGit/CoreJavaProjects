package com.anurag.thread;
/**
 * @author Anurag
 *   
 *     Concept:-How to change the name of thread 
               // way one
 */
class Thread15_I extends Thread
{
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
public class Thread15 
{
	public static void main(String[] args) 
	{
		Thread15_I obj = new Thread15_I();
		obj.setName("Anurag");
		obj.start();
		System.out.println("Hello World!");
	}
}
/*
Output:-

Hello World!
Anurag
Anurag
Anurag
Anurag
Anurag
Anurag
Anurag
Anurag
Anurag
Anurag
*/