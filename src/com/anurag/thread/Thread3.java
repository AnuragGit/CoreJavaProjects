package com.anurag.thread;
/**
 * @author Anurag
 * 
 *     Concept:-
 *     			Total four thread in this program
 *
 */
 
class Thread3_B extends Thread
{
	public void run()
	{
		for(int i=0; i<5; i++)
		{
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(i);
		}
	}
}
public class Thread3 
{
	public static void main(String[] args)  // main thread look main method 
	{
		Thread3_B b1 = new Thread3_B();//child thread1
		b1.start();//   thread1 achive threadness features
		Thread3_B b2 = new Thread3_B();//child thread2
		b2.start();// thread2 achive threadness features
		Thread3_B b3 = new Thread3_B();//child thred 3
		b3.start();// thread3 achive threadness features
		System.out.println("Hello World!");
	}
}

/*		Output:-
		
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