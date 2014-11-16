package com.anurag.exceptionhadalling;
/**
 * @author Anurag
 *
 *   Concept:- This program show how and when CloneNotSupportedException will come
 */
public class Exception10  
{
	public static void main(String[] args) throws Exception 
	{
		try
		{
			Exception10 m1 = new Exception10();
		    m1.clone();
		}
		catch (CloneNotSupportedException e)
		{
			System.out.println(e);
		}
		
		System.out.println("Hello World!");
	}
}


/*Output:-

java.lang.CloneNotSupportedException: com.anurag.exceptionhadalling.Exception10
Hello World!
*/