package com.anurag.thread;

/**
 * @author Anurag
 * 
 *    Concept:-  Create thread by annoumous innerClass
 *
 */
public class Thread12 
{
	public static void main(String[] args) 
	{
		Thread t1 =getThread();
		t1.start();
		Runnable r =getRunnable();
		Thread t2 = new Thread(r);
		t2.start();
		System.out.println("Hello World!");
	}
	private static Thread getThread()
	{
		return new Thread()
		{
             public void run()
			{
            	 for(int i=0; i<10; i++)
 				{  
 					try {
 						sleep(1000);
 						System.out.println(i);
 					} catch (InterruptedException e) {
 						// TODO Auto-generated catch block
 						e.printStackTrace();
 					}
 					
 				}
			}
		};
	}
	private static Runnable getRunnable()
	{
		return new Runnable()
		{
			public void run()
			{
				for(int i=10;i<20;i++)
				{
					try {
						Thread.sleep(1000);
						System.out.println(i);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
				}
			}
		};
	}

}

/*Output:-
		Hello World!
		10
		0
		11
		1
		12
		2
		3
		13
		14
		4
		15
		5
		16
		6
		17
		7
		18
		8
		19
		9


*/