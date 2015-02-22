package com.anurag.thread;

/**
 * @author Anurag
 *   
 *   Concept:- Achieve id,name,priority and daemon status of child thread
 *   
 *      getId():-  we can not modify the Thread ID. This ID is long number and this is 
 *                 unique and random number.
 *                 
 *                 
 *     getName():- Every thread have a name. Thread-o is default name. After getting default 
 *                 name we can modify to its desire name by the help of setName() method.
 *                 
 *                  
 *     getPriority():- This is a integer number may be between 1 to 10. By default we get 5.
 *                     we can modify by setPriority() method.
 *                     
 *                     
 *     isDaemon():-  It return boolean type. If thread is a userThread then it return false.
 *                   Otherwise true.
 */
public class Thread13 
{
	public static void main(String[] args) 
	{
		Thread t = new Thread();
		t.start();
		System.out.println("getId():- "+t.getId());
		System.out.println("getName():- "+t.getName());
		System.out.println("getPriority():- "+t.getPriority());
		System.out.println("isDaemon():- "+t.isDaemon());
		System.out.println("Hello World!");
	}
}

/*
Output:-

getId():- 8
getName():- Thread-0
getPriority():- 5
isDaemon():- false
Hello World!

*/