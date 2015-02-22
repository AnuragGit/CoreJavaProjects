package com.anurag.thread;


/**
 * @author Anurag
 *
 *     Some different technique to Registered Thread in  thread Scheduler
 */
class D extends Thread
{
	D()
	{
		start();
	}
	public void run()
	{
		for(int i=0; i<5; i++)
		{
			try {
				sleep(1000);
				System.out.println(i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
}
public class Thread5 
{
	public static void main(String[] args) 
	{
		D d1 = new D();
		D d2 = new D();
		D d3 = new D();
		System.out.println("Hello World!");
	}
}

/*
  Output:-
  
  Hello World!
  0
  0
  0
  1
  1
  1
  2
  2
  2
  3
  3
  3
  4
  4
  4
*/