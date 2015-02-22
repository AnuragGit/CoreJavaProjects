package com.anurag.thread;
/**
 * @author Anurag
 *          
 *           Concept:-
 *           
 *           This program show the Multithreading concept.
 *           
 *           if statement -1 will execute then this program run under multithread environment.
 *           
 *           if statement -2 will execute then this program run simple way.
 *
 */
class Thread2_A extends Thread {
	public void run() {
		for (int i = 0; i < 10; i++) {

			try {
				sleep(2000);
				System.out.println(i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class Thread2 {
	public static void main(String[] args) {
		
		/**
		 * Now this time child thread is creating but it doesn't have
		 * threadness feature . it have only unique id, name,priority and demon
		 * type bydefault it's false. all property may be modify except id
		 */
		Thread2_A obj = new Thread2_A();
        
		/**
		 * this will assing the Threadness feature to child thread.means cpu
		 * time will be alloate.
		 */
		//obj.start();  // statement -1
		
		
		obj.run();  //statement -2
		for (int i = 10; i < 20; i++) {
			try {
				Thread.sleep(2000);
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
		
		(1) When statement -1 will run then output is:-
		
		0
		10
		11
		1
		12
		2
		13
		3
		4
		14
		15
		5
		6
		16
		7
		17
		18
		8
		19
		Hello World!
		9
		
		(2) When statement -2 will run then output is:-
		
		0
		1
		2
		3
		4
		5
		6
		7
		8
		9
		10
		11
		12
		13
		14
		15
		16
		17
		18
		19
		Hello World!
		
		
		
		
*/