package com.anurag.exceptionhadalling.checked_and_uncheced;
import java.sql.SQLException;

/**
 * @author Anurag
 * 
 *         Concept:-
 * 
 *         Principle of throws while overriding 
 *         (1)if parent class method throw  checked exception then subclass 
 *            Override method throw same checked exception.
 *            
 *         (2)if parent class method throw unchecked exception then
 *         subclass override method throw any unchecked exception.
 *         
 *         (3)if parent  class method not throw any exception then subclass override
 *           method can throw any unchecked exception.
 *           
 *         (4)if parent class method throw  Exception then subclass override method
 *          can throw any checked or unchecked exception.
 * 
 * 
 * 
 *
 */
class A
{
	void test1(){ }
	void test2 () throws NullPointerException { }
	void test3() throws ClassNotFoundException { }
	void test4() throws Exception { }

}
class B extends A
{
	void test1() throws ArithmeticException { }
	void test2() throws ClassCastException { }
	void test3() throws NullPointerException ,ClassNotFoundException{ }
	void test4() throws NumberFormatException ,SQLException { }
}
public class Exception33 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}

/*
 *   Output:- Hello World!
 * 
 */
