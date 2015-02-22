package com.anurag.thread;
/**
 * @author Anurag
 *   
 *     concept:-  
 *     
 *       Explict call the run method ()  is not a Multiple thread 

 *        
 */
class Thread4_C  extends Thread
{
	public void run()
	{
		for (int i=0;i<5; i++)
		{
			System.out.println(i);
		}
	}
}
public class Thread4 
{
	public static void main(String[] args) 
	{
		Thread4_C c1 = new Thread4_C();  //Child thread create
		c1.run();// simple calling the run method like any method
		c1.start();// time assign by thread schedular  [Statement -1]
		
		
		//c1.start();  //Registring child thread more than one time [Statement 2]
		//Thread Schedular arise abnormal conditions
		// But exception arise in only main thread not effect  in child Thread 
		System.out.println("Hello World!");
	}
}
/*
	Output:-
	
	(1) Uncomment the statement -2 and run the program and we will get following output.
	
	0
	1
	2
	3
	4
	Exception in thread "main" java.lang.IllegalThreadStateException
	0
	1
	2
	3
	4
		at java.lang.Thread.start(Thread.java:682)
		at com.anurag.thread.Thread4.main(Thread4.java:22)
		
	(2) normal output is:-
	
		0
		1
		2
		3
		4
		Hello World!
		0
		1
		2
		3
		4
	
		
		
	
*/