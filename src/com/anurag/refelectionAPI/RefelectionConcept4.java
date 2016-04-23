package com.anurag.refelectionAPI;

/**
 * 
 * @author Anurag
 * 
 *        concept :- This program is showing how to get class information
 *                   back by object of class.
 *                   
 *                   And  this  program is also showing the usage of  getFields() method. 
 *                   This method is available on "Class"  class , we able to fetch all public fields of 
 *                   class as well as parent class also.
 *                   
 *                   //Get all the public fields included inherited one.
                     //getFields();
 *                   
 *
 */

import java.util.Arrays;
import java.lang.reflect.Field;
class RefelectionConcept4_A 
{
	public int a,b,c;
	int x,y,z;
	public float f;
	private int m,n;
}

public class RefelectionConcept4 extends RefelectionConcept4_A
{
    public int p,q,r;
	int s;
	private int l,k;
	public static void main(String[] args) 
	{
		RefelectionConcept4  m = new RefelectionConcept4();
		Class c =m.getClass();
		Field x[]=c.getFields();// return all the public field include inherited onces.
		System.out.println(Arrays.toString(x));
		for(Field f:x)
			System.out.println("The field is:"+f.getName());
	}
}

/*Output:-

[public int com.anurag.refelectionAPI.RefelectionConcept4.p, public int com.anurag.refelectionAPI.RefelectionConcept4.q, public int com.anurag.refelectionAPI.RefelectionConcept4.r, public int com.anurag.refelectionAPI.RefelectionConcept4_A.a, public int com.anurag.refelectionAPI.RefelectionConcept4_A.b, public int com.anurag.refelectionAPI.RefelectionConcept4_A.c, public float com.anurag.refelectionAPI.RefelectionConcept4_A.f]
The field is:p
The field is:q
The field is:r
The field is:a
The field is:b
The field is:c
The field is:f*/
