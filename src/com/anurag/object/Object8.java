package com.anurag.object;
/**
 ** @author Anurag
 *    Concept:-
 *             This program show how to safe our program by class casting exception.                                                                                                          
 */
class Object8_X
{
	int i;
	Object8_X(int i)
	{
		this.i=i;
	}
	public boolean equals(Object obj)
	{
		if(!(obj instanceof Object8_X))
		{  
			return false;
		}
		return i==((Object8_X)obj).i;
	}
}
class Object8_Y
{
	int i;
	Object8_Y(int i)
	{
		this.i=i;																																																																																																																																																																																																																																																																																																																																																																																													
	}
	public boolean equals(Object obj)
	{
		if(!(obj instanceof Object8_Y))
		{
			return false;
		}
	
		return i==((Object8_Y)obj).i;
	}
}
public class Object8 
{
	public static void main(String[] args) 
	{
		Object8_X x1 = new Object8_X(10);
		Object8_X x2 = new Object8_X(10);
		Object8_Y y1 = new Object8_Y(10);
		Object8_Y y2 = new Object8_Y(10);

		System.out.println(x1.equals(x2));
		System.out.println(y1.equals(y2));
		System.out.println(x1.equals(y1));
		System.out.println(x2.equals(y2));
		System.out.println(x1==x2);
	//	System.out.println(x1==y1); giving compile time error
		System.out.println("Hello World!");
	}
}

/*Output:-
true
true
false
false
false
Hello World!
*/

