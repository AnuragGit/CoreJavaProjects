package com.anurag.refelectionAPI;
import java.lang.reflect.Method;

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
 *
 */

class RefelectionConcept10_B
{
	private void test1(){}
	protected void test2(){}
	void test3(){}
	public void test4(){}
}
class RefelectionConcept10_C
{
	void method1(){}
	void method2(){}
	void method3(){}
	void method4(){}
}
public class RefelectionConcept10 
{
	public static void main(String[] args) 
	{
		RefelectionConcept10_B b1 = new RefelectionConcept10_B();
		RefelectionConcept10_C c1 =new RefelectionConcept10_C();
		Class cl1=b1.getClass();
		Class cl2=c1.getClass();
		Method x[] =cl1.getDeclaredMethods();
		Method y[] =cl2.getDeclaredMethods();
		for(Method m1:x)
			System.out.println(m1.getName());
		System.out.println("-------------------");
	    for(Method m2:y)
			System.out.println(m2.getName());
		
	}
}
/*
Output:-

test1
test2
test3
test4
-------------------
method1
method2
method3
method4
*/
