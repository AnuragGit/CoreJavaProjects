package com.anurag.thread;
import java.util.Scanner;

/**
 * @author Anurag 
 * Concept:- This program having detail concept of
 *         synchronization Here we have total 17 cases that will show when
 *         control will happen simultatenously or when it will be sequential
 */
class Shared2 
{
	void test1()
	{
		Thread t =Thread.currentThread();
		for(int i=0; i<100;i++)
			System.out.println(t.getName()+":"+i);
	}

	void test2()
	{
		Thread t =Thread.currentThread();
		for(int i=100; i<200;i++)
			System.out.println(t.getName()+":"+i);
	}

	synchronized void test3()
	{
		Thread t =Thread.currentThread();
		for(int i=200; i<300;i++)
			System.out.println(t.getName()+":"+i);
	}

	synchronized void test4()
	{
		Thread t =Thread.currentThread();
		for(int i=300; i<400;i++)
			System.out.println(t.getName()+":"+i);
	}

	synchronized void test5()
	{
		Thread t =Thread.currentThread();
		for(int i=400; i<500;i++)
			System.out.println(t.getName()+":"+i);
	}

	static void test6()
	{
		Thread t =Thread.currentThread();
		for(int i=500; i<600;i++)
			System.out.println(t.getName()+":"+i);
	}
	 static void test7()
	{
		Thread t =Thread.currentThread();
		for(int i=600; i<700;i++)
			System.out.println(t.getName()+":"+i);
	}

	synchronized static void test8()
	{
		Thread t =Thread.currentThread();
		for(int i=700; i<800;i++)
			System.out.println(t.getName()+":"+i);
	}

	synchronized static void test9()
	{
		Thread t =Thread.currentThread();
		for(int i=800; i<900;i++)
			System.out.println(t.getName()+":"+i);
	}

}
class Thread26_A extends Thread
{
	Shared2 s1;
	Thread26_A(Shared2 s1)
	{
		this.s1 =s1;
	}
	public void run()
	{
		functioncall();
	}
	private void functioncall()
	{
		System.out.println("Enter the method no. test");
		Scanner sc = new Scanner(System.in);
		int i=sc.nextInt();
		switch(i)
		{
			case 1:
				     s1.test1();break;
			case 2:
				     s1.test2();break;
			case 3:
				     s1.test3();break;
			case 4:
				     s1.test4();break;
			case 5:
				     s1.test5();break;
			case 6:
				     s1.test6();break;
			case 7:
				     s1.test7();break;
			case 8:
				     s1.test8();break;
			case 9:
				     s1.test9();break;
			default:
				System.out.println("no suitable method found"); break;
		}
	}
}
class Thread26_B extends Thread
{
	Shared2 s1;
	Thread26_B(Shared2 s1)
	{
		this.s1 =s1;
	}
	public void run()
	{
		functioncall();
	}
	private void functioncall()
	{
		System.out.println("Enter the method no. test");
		Scanner sc = new Scanner(System.in);
		int i=sc.nextInt();
		switch(i)
		{
			case 1:
				     s1.test1();break;
			case 2:
				     s1.test2();break;
			case 3:
				     s1.test3();break;
			case 4:
				     s1.test4();break;
			case 5:
				     s1.test5();break;
			case 6:
				     s1.test6();break;
			case 7:
				     s1.test7();break;
			case 8:
				     s1.test8();break;
			case 9:
				     s1.test9();break;
			default:
				System.out.println("no suitable method found"); break;
		}
	}
}

public class Thread26 
{
	public static void main(String[] args) 
	{
		Shared2 s1 = new Shared2();
		Shared2 s2 = new Shared2();
		Thread26_A a1 = new Thread26_A(s1);
		Thread26_B b1 = new Thread26_B(s1);
		a1.start();
     	b1.start();
		System.out.println("Hello World!");
	}
}
