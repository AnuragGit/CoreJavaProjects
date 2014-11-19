package com.anurag.exceptionhadalling.checked_and_uncheced;

/**
 * @author Anurag
 * 
 * 		Concept:- This program also for stack unwinding but this a checked exception
 *                 So we need to either handle it by try catch or throws the exception.  
 *
 */
public class Exception29 
{
	public static void main(String[] args) throws ClassNotFoundException
	{
		System.out.println(1);
		test1();
		System.out.println(2);
		
	}
	static void test1() throws ClassNotFoundException
	{
		System.out.println(3);
		test2();
		System.out.println(4);
	}
	static void test2() throws ClassNotFoundException
	{
		System.out.println(5);
		test3();
		System.out.println(6);
	}
	static void test3() throws ClassNotFoundException 
	{
		System.out.println(7);
		Class.forName("Manager24");
		System.out.println(8);
	}
}

/*Output:-

1
3
5
7
Exception in thread "main" java.lang.ClassNotFoundException: Manager24
	at java.net.URLClassLoader$1.run(URLClassLoader.java:366)
	at java.net.URLClassLoader$1.run(URLClassLoader.java:355)
	at java.security.AccessController.doPrivileged(Native Method)
	at java.net.URLClassLoader.findClass(URLClassLoader.java:354)
	at java.lang.ClassLoader.loadClass(ClassLoader.java:423)
	at sun.misc.Launcher$AppClassLoader.loadClass(Launcher.java:308)
	at java.lang.ClassLoader.loadClass(ClassLoader.java:356)
	at java.lang.Class.forName0(Native Method)
	at java.lang.Class.forName(Class.java:186)
	at com.anurag.exceptionhadalling.checked_and_uncheced.Exception29.test3(Exception29.java:34)
	at com.anurag.exceptionhadalling.checked_and_uncheced.Exception29.test2(Exception29.java:28)
	at com.anurag.exceptionhadalling.checked_and_uncheced.Exception29.test1(Exception29.java:22)
	at com.anurag.exceptionhadalling.checked_and_uncheced.Exception29.main(Exception29.java:15)

*/