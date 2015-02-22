package com.anurag.thread;


/**
 * @author Anurag
 *
 *    Concept:-  This program  is showing the join method concept
 *    
 *         when we call join method  after calling the start method then parent
 *         has to  wait until child finished the execution.
 */

class Thread19_A extends Thread {
	public void run() {
		for (int i = 0; i < 3; i++) {
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(i);
		}
	}
}

public class Thread19 {

	public static void main(String[] args) {
		Thread19_A q1 = new Thread19_A();
		q1.start();
		try {
			q1.join();
		} catch (InterruptedException ex) {
			ex.getMessage();
		}
		System.out.println("Hello World!");
	}

}

/*
Output:-

0
1
2
Hello World!

*/