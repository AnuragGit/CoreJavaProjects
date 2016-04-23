package com.anurag.refelectionAPI;

/**
 *   @author Anurag 
 *       This program is showing the concept of getDeclaredFields() method available on "Class"
 *       class. And here we can get only declared field on present class only.
 *       
 *       //Get all the Declared fields 
         //getDeclaredFields();
 */

import java.util.Arrays;
import java.lang.reflect.Field;
class RefelectionConcept6_C
{
	public int a,b,c;
	int x,y,z;
	public float f;
}

public class RefelectionConcept6 extends RefelectionConcept6_C
{
    public int p,q,r;
	int s;
	public static void main(String[] args) 
	{
		RefelectionConcept6  m = new RefelectionConcept6();
		Class c =m.getClass();
		Field x[]=c.getDeclaredFields();// return all the Declared field 
		Arrays.toString(x);// this is not work
		for(Field f:x)
			System.out.println("The field is:"+f.getName());
	}
}

/*
Output:-

The field is:p
The field is:q
The field is:r
The field is:s

*/