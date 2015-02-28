package com.anurag.thread;

/**
 * 
 * @author Anurag
 *         Concept:- This program show if we set the priority of  to main thread then all child
 *         tread will automatic take same priority.
 *				
 */
public class Thread22 
{
	public static void main(String[] args) 
	{
		Thread t= Thread.currentThread();
		t.setPriority(7);
		Utils.printDetails();
		Utils.sleep(10000);
		R r1=new R();
		r1.start();
		Utils.sleep(10000);
		S s1 =new S();
		s1.start();
		Utils.sleep(10000);
		T t1 = new T();
		t1.start();
		System.out.println("Hello World!");
	}
}

/*
Output:-

CurrentThread:Thread[main,7,main]
1
main
7
false
CurrentThread:Thread[Thread-0,7,main]
8
Thread-0
7
false
CurrentThread:Thread[Thread-1,7,main]
9
Thread-1
7
false
Hello World!
CurrentThread:Thread[Thread-2,7,main]
10
Thread-2
7
false

*/