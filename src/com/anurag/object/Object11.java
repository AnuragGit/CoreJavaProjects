package com.anurag.object;
/**
 * * @author Anurag
 *
 *     Concept:- This program is showing the way of overriding the hashcode method.
 */
class Object11_T
{
	
	 int i,j;
	 double d;
	 String s1;
	 Object11_T(int i, int j, double d, String s1)
	{
		 this.i=i;
		 this.j=j;
		 this.d=d;
		 this.s1 =s1;
	}
	public int hashCode()
	{
		String str1=Integer.toString(i);
		String str2=Integer.toString(j);
		String str3=Double.toString(d);
		int hash =str1.hashCode()+str2.hashCode()+str3.hashCode()+s1.hashCode();
		return hash;
	}
}
public class Object11 
{
	public static void main(String[] args) 
	{
		Object11_T t1 = new Object11_T(12,20,40.9,"abc");
		Object11_T t2 = new Object11_T(12,20,40.9,"abc");
		Object11_T t3 = new Object11_T(12,20,40.9,"abc");
		Object11_T t4 = new Object11_T(13,20,40.9,"abc");
	    System.out.println(t1.hashCode());
	    System.out.println(t2.hashCode());
	    System.out.println(t3.hashCode());
	    System.out.println(t4.hashCode());
		System.out.println("Hello World!");
	}
}
/*
Output:-

1696264
1696264
1696264
1696265
Hello World!
*/
