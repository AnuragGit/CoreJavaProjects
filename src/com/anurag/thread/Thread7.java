package com.anurag.thread;

/**
 * @author Anurag
 *      
 *      Concept:-Describe both way to create Thread
 */
class Thread7F extends Thread
{
	public void run()
	{
		for(int i=0; i<10;i++)
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
class Thread7G implements Runnable
{
	public void run()
	{
       for(int i=10;i<20;i++)
		{
    	   try {
				Thread.sleep(1000);
				System.out.println(i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
}
public class Thread7 
{
	public static void main(String[] args) 
	{
		Thread7F f1 = new Thread7F(); //child thread create
		f1.start(); // get the Threadness feature

		Thread7G g1 = new Thread7G();
		Thread t1 = new Thread(g1); //child Thread create
		t1.start(); // get the Threadness feature.

		System.out.println("Hello World!");
	}
}
/*
  Output:-
  
  Hello World!
  0
  10
  11
  1
  2
  12
  3
  13
  4
  14
  5
  15
  16
  6
  7
  17
  8
  18
  19
  9
*/