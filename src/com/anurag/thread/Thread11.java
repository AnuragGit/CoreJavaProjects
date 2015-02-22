package com.anurag.thread;

/**
 * @author Anurag
 *   
 *   Concept:-create Thread by Annoumous without taking references.
 *   
 */
public class Thread11 
{
	public static void main(String[] args) 
	{
		new Thread()
		{
			public void run()
			{
				for(int i=0; i<10; i++)
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
		}.start();

		new Thread( new Runnable()
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
		}).start();

		System.out.println("Hello World!");
	}
}
/*
Output:-
Hello World!
10
0
11
1
2
12
3
13
14
4
5
15
16
6
17
7
18
8
19
*/