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
 *                   This program showing some different way of getting Class class Object as 
 *                   compared to previous class.
 *
 */
class RefelectionConcept11_G
{
	void test(){}
}
public class RefelectionConcept11  
{
	public static void main(String[] args) throws Exception 
	{
		Class c1 =Class.forName("com.anurag.refelectionAPI.RefelectionConcept11_G");
		Method x[]= c1.getDeclaredMethods();
		for(Method m:x)
			System.out.println(m.getName());
		System.out.println("Hello World!");
	}
}
/*
Output:-
  test
Hello World!


*/
