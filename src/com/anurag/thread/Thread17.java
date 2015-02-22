package com.anurag.thread;


/**
 * @author Anurag
 *   
 *     Concept:- How to change the name in case of runnable interface
 *     
 *        we can not provide name of the object Name provide to only reference variable.
 *        but in case of thread we can able to provide the name of thread.
 *
 */
class Thread17_J  implements Runnable
{
	public void run()
	{
		Thread t =Thread.currentThread(); // return thread that is excuting run method
		for(int i=0; i<10; i++)
		{
			System.out.println(t.getName());
			try
			{
				Thread.sleep(1000);
			}
			catch (InterruptedException ex)
			{
				ex.printStackTrace();
			}
		}
	}
}
public class Thread17 
{
	public static void main(String[] args) 
	{
		Thread17_J obj =new Thread17_J();
		Thread t1 = new Thread(obj,"xyz");
		//t1.setName("Maa"); if you want you can set like this also.
		t1.start();
		System.out.println("Hello World!");
	}
}
/*
Output:-

Hello World!
xyz
xyz
xyz
xyz
xyz
xyz
xyz
xyz
xyz
xyz

*/