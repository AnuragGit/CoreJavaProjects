package com.anurag.thread;
//Thread pool concept
import java.util.ArrayList;
class Thread33_Utils
{
	static void sleep(long millis)
	{
		try
		{
			Thread.sleep(millis);
		}
		catch (InterruptedException ex)
		{
			System.out.println(ex);
		}
	}
}
class ModelThread extends Thread
{
	public synchronized void goToWait()
	{
		try
		{
			wait();
		}
		catch (InterruptedException ex)
		{
			ex.printStackTrace();
		}
	}
	public synchronized void release()
	{
		notify();
	}
	public void run()
	{
		
			System.out.println("Model Thread run() begin that is "+getName());
			goToWait();
			for(int i=0; i<10; i++)
			{
				System.out.println(getName()+":"+ i);
				Thread21_Utils.sleep(1000);
			}
			release();
			System.out.println("Model Thread run() end that is :"+getName());
		
	}

}
class ThreadPoolManager
{
	private ArrayList pool = new ArrayList();
	public void init()
	{
		ModelThread th = null;
		for(int i=0; i<10;i++)
		{
			th= new ModelThread();
			th.start();
			pool.add(th);
		}
	}
	public ModelThread getThread()
	{
		ModelThread th = null;
		if(pool.size()>0)
		{
			th=(ModelThread) pool.remove(0);
		}
		else
		{
			th = new ModelThread();
			th.start();
		}
		return th;
	}
	public void setThread(ModelThread th)
	{
		if(pool.size()<10)
		{
			pool.add(th);
		}
		else
		{
			th.stop();
			th=null;
		}
	}
	public void release()
	{
		ModelThread th = null;
		for(int i=0; i<pool.size();)
		{
			th=(ModelThread) pool.remove(0);
			th.stop();
		}
	}
}
class User1 extends Thread
{
	ThreadPoolManager pm = null;
	User1(ThreadPoolManager pm)
	{
		this.pm=pm;
	}
	public void run()
	{
		while(true)
		{
			ModelThread th = pm.getThread();
			th.release();
			th.goToWait();
			pm.setThread(th);
			Thread21_Utils.sleep(500);
		}
	}
}
class User2 extends Thread
{
	ThreadPoolManager pm = null;
	User2(ThreadPoolManager pm)
	{
		this.pm=pm;
	}
	public void run()
	{
		while(true)
		{
			ModelThread th = pm.getThread();
			th.release();
			th.goToWait();
			pm.setThread(th);
			Thread21_Utils.sleep(500);
		}
	}
}
class User3 extends Thread
{
	ThreadPoolManager pm = null;
	User3(ThreadPoolManager pm)
	{
		this.pm=pm;
	}
	public void run()
	{
		while(true)
		{
			ModelThread th = pm.getThread();
			th.release();
			th.goToWait();
			pm.setThread(th);
			Thread21_Utils.sleep(500);
		}
	}
}
public class Thread33 
{
	public static void main(String[] args) 
	{
		ThreadPoolManager pm = new ThreadPoolManager();
		pm.init();
		User1 u1 = new User1(pm); 
		User2 u2 = new User2(pm);
		User3 u3 = new User3(pm);

		u1.start();
		u2.start();
		u3.start();
		Thread21_Utils.sleep(500000);
		u1.stop();
		u2.stop();
		u3.stop();
		pm.release();
		System.out.println("End of game");
		System.out.println("Hello World!");
	}
}
