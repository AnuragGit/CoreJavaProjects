package com.anurag.thread;
/**
 * @author Anurag
 * 
 *     Concept:-  This program shows we can  not change the Demon status of main thread
 *     
 *	
 */

public class Thread20 {

	public static void main(String[] args) {
		Thread t = Thread.currentThread();
		System.out.println(t.getId());
		System.out.println(t.getName());
		System.out.println(t.getPriority());
		System.out.println(t.isDaemon());
		try {
			t.setDaemon(true);
		} catch (IllegalThreadStateException ex) {
			System.out
					.println("We can not  make main thread as Demon thread");
		}

		
		try {
			t.setDaemon(false);
		} catch (IllegalThreadStateException ex) {
			System.out
					.println("NO you can not do that eventhough you provid false also");
		}

		System.out.println(t.isDaemon());
		// t.setDaemon(true); it is also not correct
		System.out.println(t.isDaemon());
		System.out.println("Hello World!");
	}

}

/*
Output:-

1
main
5
false
We can not  make main thread as Demon thread
NO you can not do that eventhough you provid false also
false
false
Hello World!
*/
