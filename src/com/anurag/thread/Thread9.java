package com.anurag.thread;
/**
 * @author Anurag
 *   
 *     Concept:- Thread use in local innerClass
 */
public class Thread9 
{
	public static void main(String[] args) 
	{
		class A extends Thread
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
		}
		class B implements Runnable
		{
			public void run()
			{
				for(int i=10; i<20; i++)
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
		A a1 = new A();
		a1.start();
		B b1 =new B();
		Thread t = new Thread(b1);
		t.start();
		System.out.println("Hello World!");
	}
}
/*
Output:-
    
Hello World!
10
0
1
11
2
12
3
13
4
14
15
5
6
16
17
7
18
8
9
19
	
*/