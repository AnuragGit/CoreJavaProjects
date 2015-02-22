package com.anurag.thread;
//user convert to demon thread Thread Example 
// child Thread execute until it not complete. While parent  thread
//leave his own execution before this if it is User Thread not a Demon
class P extends Thread
{
	public void run()
	{
		for (int i=0;i<100 ;i++ )
		{
			System.out.println(i);
		}
	}
}
class Q extends Thread
{
	public void run()
	{
		for (int i=100;i<400 ;i++ )
		{
			System.out.println(i);
		}
	}
}
public class Thread18 
{
	public static void main(String[] args) 
	{

		P p1 = new P();
		p1.start();
		System.out.println("done");
		Q q1 = new Q();
		q1.setDaemon(true);// now Q  thread become Deamon Thread
		q1.start();
		System.out.println("Hello World!");
	}
}
