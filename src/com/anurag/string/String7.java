package com.anurag.string;
/**
 * 
 * @author Anurag
 *         Concept:- This program show How to sure String object are immutable;
 */
class String7_A 
  {
	int i;
  }
public class String7 
{
	public static void main(String[] args) 
	{
		String str="hello";
		System.out.println(str.hashCode());
		str="hello";//value not change
		System.out.println(str.hashCode());  // hashcode same as previous
		str="Hello"; //value change
		System.out.println(str.hashCode());  // different hashcode means string object are imutable.
	     String7_A a1 = new String7_A();
		 a1.i=10;
		 System.out.println("a1.i="+a1.i+" And HashCode is:  "+a1.hashCode());
		 a1.i=12;
		 System.out.println("a1.i="+a1.i+" And HashCode is:  "+a1.hashCode()); //same hash code as previous that is why any class except String are mutable;
		System.out.println("Hello World!");
	}
}
/*
Output:-

99162322
99162322
69609650
a1.i=10 And HashCode is:  31845311
a1.i=12 And HashCode is:  31845311
Hello World!
*/
