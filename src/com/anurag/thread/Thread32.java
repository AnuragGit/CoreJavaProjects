package com.anurag.thread;

class C extends Thread
{
	C(String name,ThreadGroup tg)
	{
		super(tg,name);
	}
	C(){}
	public void run()
	{
		for(int i=0; i<10; i++)
		{
			System.out.println(i+","+getPriority());
		}
	}
}
public class Thread32  
{
	public static void main(String[] args) 
	{
		ThreadGroup tg = new ThreadGroup("1st group");
		C c1 = new C("1st thread",tg);
		C c2 = new C("2nd thread",tg);
		C c3 = new C("3rd thread",tg);
		C c4 = new C("4th thread",tg);
		c1.start();
		c2.start();
		c3.start();
		
		tg.stop();
		System.out.println("Hello World!");
	}
}
