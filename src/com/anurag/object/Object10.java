package com.anurag.object;
/**
 * 
 * @author Anurag
 *    
 *    Concept:- This program show how to override equals and hashcode method. 
 */
class Object10_S
{
	int i;
	Object10_S(int i)
	{
		this.i=i;
	}
	public String toString()
	{
		return "i="+i;
	}
	public boolean equals(Object obj)
	{
		System.out.println("Calling Equal method");
		if(!(obj instanceof Object10_S))
		{
			return false;
		}
		return i==((Object10_S)obj).i;
	}
	public int hashCode()
	{
		System.out.println("Calling HashCode method");
       return Integer.toString(i).hashCode();
	}
}
public class Object10 
{
	public static void main(String[] args) 
	{
		Object10_S s1 = new Object10_S(90);
		Object10_S s2= new Object10_S(90);
		Object10_S s3 =s1;
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s1.equals(s2));
		System.out.println(s2.equals(s3));
		System.out.println(s3.equals(s1));

		System.out.println("--------------");
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());	
		
		System.out.println("Hello World!");
	}
}

/*Output:-
i=90
i=90
i=90
Calling Equal method
true
Calling Equal method
true
Calling Equal method
true
--------------
Calling HashCode method
1815
Calling HashCode method
1815
Calling HashCode method
1815
Hello World!
*/
