package com.anurag.thread;

/**
 * @author Anurag 
 * 
 * concept:- Synchronization- if share resources share by
 *         multiple thread then share resource should not share simultaneously
 *         it share one after another This technique is achieve by
 *         Synchronization.
 * 
 * 
 */
class Shared
{
	synchronized void test1() 
	{
		for(int i=0;i<3;i++)
		{    try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			System.out.println("Method calling by Thred "+Thread.currentThread().getName()+" and the value of i is"+i);
		}
	}
}
class Thread25_A extends Thread
{
	Shared s1;
	Thread25_A(Shared s1)
	{
		this.s1=s1;
	}
	public void run()
	{
		s1.test1();
	}
}
class Thread25_B extends Thread
{
	Shared s1;
	Thread25_B(Shared s1)
	{
		this.s1 =s1;
	}
	public void run()
	{
		s1.test1();
	}
}
public class Thread25 
{
	public static void main(String[] args) 
	{
		Shared s1 = new Shared();
		Shared s2 = new Shared();
		
		Thread25_A a1 = new Thread25_A(s1);
		Thread25_B b1 = new Thread25_B(s1);
		a1.setName("A");
		a1.start();
		b1.setName("B");
		b1.start();
		System.out.println("Hello World!");
	}
}
