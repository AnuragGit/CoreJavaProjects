package com.anurag.thread;


/**
 * @author Anurag
 *    
 *     Concept:- Thread involve in static inner class
 */
public class Thread8 {
	static class A extends Thread {
		public void run() {
			for (int i = 0; i < 10; i++) {
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

	static class B implements Runnable {
		public void run() {
			for (int i = 10; i < 20; i++) {
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

	public static void main(String[] args) {
		A a1 = new A();
		a1.start();
		B b1 = new B();
		Thread t = new Thread(b1);
		t.start();
		System.out.println("Hello World!");
	}
}
/*
 * Output:-
 * 
 Hello World!
0
10
11
1
2
12
13
3
14
4
5
15
6
16
7
17
18
8
19
9
 */