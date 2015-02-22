package com.anurag.thread;

/**
 * @author Anurag
 *
 *    Concept:-create Thread by Annoumous inner Class
 */
public class Thread10 
{
	public static void main(String[] args) 
	{
		Thread t1 = new Thread()
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
		};
		t1.start();   // t1 is pointing to Annoumous innerClass
		Runnable r = new Runnable()
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
		};
		Thread t2 = new Thread(r);
		t2.start();
		System.out.println("Hello World!");
	}
}
/*
Output:-

Hello World!
0
10
1
11
12
2
13
3
4
14
15
5
16
6
7
17
18
8
19
9
*/