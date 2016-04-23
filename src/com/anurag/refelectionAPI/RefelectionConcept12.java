package com.anurag.refelectionAPI;

/**
 * 
 * @author Anurag
 * 
 *        concept :- This program is showing how to get class information
 *                   back by object of class.
 *                   
 *                   And  this  program is also showing the usage of  getDeclaredMethods() method. 
 *                   This method is available on "Class"  class , we able to get present class every methods.                  
 *                   
 *                   This program showing some different way of getting Class class Object as 
 *                   compared to previous class.
 *                   
 *                   Here we are passing class name and method name dynamic from console but 
 *                   that name should be available on classpath.
 *
 */
import java.lang.reflect.Method;
import java.util.Scanner;
class RefelectionConcept12_H
{
	public void test1()
	{
		System.out.println("from test1");
	}
	public void test2()
	{
		System.out.println("from test2");
	}
}
class RefelectionConcept12_I
{
	public void method1()
	{
		System.out.println("from  method1");
	}
	public void method2()
	{
		System.out.println("from method2");
	}
}

public class RefelectionConcept12 
{
	public static void main(String[] args) throws Exception 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the class Name");
		String cn=sc.next();
		System.out.println("Enter the method Name");
		String mn =sc.next();
		Class c1 = Class.forName("com.anurag.refelectionAPI."+cn);
		Method m1 =c1.getDeclaredMethod(mn);
		Object obj = c1.newInstance();
		m1.invoke(obj);
		System.out.println("Hello World!");
	}
}
/*
Output:-

Enter the class Name

RefelectionConcept12_I
Enter the method Name
method1
from  method1
Hello World!
*/