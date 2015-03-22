package com.anurag.thread;
//DeadLock conditions
/**
 * @author Anurag
 * Concept:- This program show how deadlock stage is coming .
 */
import java.lang.management.ThreadMXBean;
import java.lang.management.ThreadInfo;
import java.lang.management.ManagementFactory;
class Thread27_Utils
{
	static void sleep(long millis)
	{
       try
       {
		Thread.sleep(millis);
       }
       catch (InterruptedException ex)
       {
		   System.out.println(ex);
       }
	}
}
class Thread27_Shared 
{
	synchronized void test1(Thread27_Shared s)
	{
		System.out.println("test1 statred ");
		Thread27_Utils.sleep(1000);
		s.test2(this);
		System.out.println("test1 end");
	}
	synchronized void test2(Thread27_Shared s)
	{
		System.out.println("test 2 started");
		Thread27_Utils.sleep(1000);
		s.test1(this);
		System.out.println("test2 end");
	}
}
class Thread27_A extends Thread
{
	Thread27_Shared s1,s2;
	Thread27_A(Thread27_Shared s1,Thread27_Shared s2)
	{
		this.s1 =s1;
		this.s2 =s2;
	}
	public void run()
	{
		s1.test1(s2);
	}
}
class Thread27_B extends Thread
{
	Thread27_Shared s1,s2;
	Thread27_B(Thread27_Shared s1,Thread27_Shared s2)
	{
		this.s1 =s1;
		this.s2 =s2;
	}
	public void run()
	{
		s2.test2(s1);
	}
}

public class Thread27 
{
	public static void main(String[] args) 
	{
		Thread27_Shared s1 = new Thread27_Shared();
		Thread27_Shared s2 = new Thread27_Shared();
		Thread27_A a1 = new Thread27_A(s1,s2);
		Thread27_B b1 = new Thread27_B(s1,s2);
		a1.start();
		b1.start();
		Thread33_Utils.sleep(1000);
        System.out.println(a1.getState());
        System.out.println(b1.getState());
		ThreadMXBean mx =ManagementFactory.getThreadMXBean();
		long ids[]= mx.findDeadlockedThreads();
		ThreadInfo x[]=mx.getThreadInfo(ids);
		if(x!=null)
		{
			ThreadInfo ti= null;
			for(int i=0; i<x.length;i++)
			{
				ti=x[i];			
				System.out.println(ti.getThreadName());		
				
			}
		}
		System.out.println("Hello World!");
	}
}
/*
Output:-
test 2 started
test1 statred 
TIMED_WAITING
TIMED_WAITING
Thread-1
Thread-0
Hello World!

*/