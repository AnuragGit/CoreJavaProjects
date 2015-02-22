package com.anurag.thread;

/**
 * @author Anurag
 *
 *         Concept:- Second way to create Thread
 */
class Thread6_E implements Runnable {
	public void run() {
		for (int i = 0; i < 10; i++) {
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

public class Thread6 {
	public static void main(String[] args) {
		Thread6_E obj = new Thread6_E();
		Thread t = new Thread(obj);
		t.start();
		for (int i = 10; i < 20; i++) {
			try {
				Thread.sleep(1000);
				System.out.println(i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Hello World!");
	}
}
/*
  Output:-
  
 	10
	0
	1
	11
	2
	12
	13
	3
	14
	4
	15
	5
	6
	16
	7
	17
	18
	8
	9
	19
	Hello World!
 * 
 */