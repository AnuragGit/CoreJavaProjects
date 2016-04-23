package com.anurag.refelectionAPI;

/**
 *   @author Anurag 
 *       This program is showing the concept of getDeclaredField() method available on "Class"
 *       class. And here we can get only declared specify field on present class only.
 *       
 *       //Get specific the Declared field
        //getDeclaredField();
 */

import java.lang.reflect.Field;
class D
{
	public int a,b,c;
	int x,y,z;
	public float f;
}

public class RefelectionConcept7 extends D
{
    public int p,q,r;
	int s;
	public static void main(String[] args) throws Exception
	{
		RefelectionConcept7 m = new RefelectionConcept7();
		Class c =m.getClass();
		Field x=c.getDeclaredField("s");// return all the public field include inherited onces.
		
		System.out.println("The field is:"+x.getName());
	}
}

/*Output:-

The field is:s
*/

