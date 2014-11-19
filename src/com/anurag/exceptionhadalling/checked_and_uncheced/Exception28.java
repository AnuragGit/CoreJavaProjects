package com.anurag.exceptionhadalling.checked_and_uncheced;

/**
 * @author Anurag
 * 
 *         Concept:- This program shows what is stack unwinding operation.
 * 
 *         When an exception is thrown but not caught in a particular scope, the
 *         method-call stack is "unwound," and an attempt is made to catch the
 *         exception in the next outer try block. This process is called stack
 *         unwinding . Unwinding the method-call stack means that the method in
 *         which the exception was not caught terminates, all local variables in
 *         that method go out of scope and control returns to the statement that
 *         originally invoked that method. If a TRy block encloses that
 *         statement, an attempt is made to catch the exception. If a try block
 *         does not enclose that statement, stack unwinding occurs again. If no
 *         catch block ever catches this exception and the exception is checked
 *         (as in the following example), compiling the program will result in
 *         an error. The program  demonstrates stack unwinding.
 *         
 *         Here test3() method generating the exception but there is no catch for this
 *         exception so test3() method forcibly  remove by stack unwinding operation.
 *         So it is propagating or ducking to its caller. Finally this process will be 
 *         continue until its not handle ,finally if it is not handled then main method
 *         remove  the stack forcibly by stack unwinding operation because of this java
 *         command execute printstackTrace method to show the exception.
 *         
 *         
 *
 */
public class Exception28 
{
	public static void main(String[] args) 
	{
		System.out.println(1);
		test1();
		System.out.println(2);
		
	}
	static void test1()
	{
		System.out.println(3);
		test2();
		System.out.println(4);
	}
	static void test2()
	{
		System.out.println(5);
		test3();
		System.out.println(6);
	}
	static void test3()
	{
		System.out.println(7);
		int i=10/0;
		System.out.println(8);
	}
}
/*
Output:-

1
3
5Exception in thread "main" 
7
java.lang.ArithmeticException: / by zero
	at com.anurag.exceptionhadalling.checked_and_uncheced.Exception28.test3(Exception28.java:55)
	at com.anurag.exceptionhadalling.checked_and_uncheced.Exception28.test2(Exception28.java:49)
	at com.anurag.exceptionhadalling.checked_and_uncheced.Exception28.test1(Exception28.java:43)
	at com.anurag.exceptionhadalling.checked_and_uncheced.Exception28.main(Exception28.java:36)

*/