package com.anurag.refelectionAPI;

/**
 * 
 * @author Anurag
 * 
 *        concept :- This program is showing how to get class information
 *                   back by object of class.
 *                   
 *                   And also this program is showing the usage of  getField()  method. 
 *                   This method is present on "Class" class and  we able to fetch specific
 *                   public fields of  class as well as parent class also.
 *                   
 *                  //Get Specific the public fields included inherited one.
                   //getField(string);
 *                   
 *
 */

import java.util.Arrays;
import java.lang.reflect.Field;
class RefelectionConcept5_B
{
	public int a,b,c;
	int x,y,z;
	public float f;
}

public class RefelectionConcept5 extends RefelectionConcept5_B
{
    public int p,q,r;
	int s;
	private int m,n;
	public static void main(String[] args) throws Exception 
	{
		RefelectionConcept5  m = new RefelectionConcept5();
		Class c =m.getClass();
		Field x=c.getField("a");// return defined the public field include inherited onces.
		
	    System.out.println("The field is:"+x.getName());
	}
}
/*
Output:-

The field is:a


*/