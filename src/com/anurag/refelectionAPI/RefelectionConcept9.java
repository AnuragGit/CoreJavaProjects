package com.anurag.refelectionAPI;


/**
 * 
 * @author Anurag
 * 
 *        concept :- This program is showing how to get class information
 *                   back by object of class.
 *                   
 *                   And  this  program is also showing the usage of  getMethod() method. 
 *                   This method is available on "Class"  class , we able to call specific public methods of 
 *                   class as well as parent class also.
 *                   
					//Get specific  public method  include inherited once
					//getMethod();
 *                   
 *
 */


import java.lang.reflect.Method;
class  RefelectionConcept9_E
{
	public void test(int a)
	{
		System.out.println("I am int parameter test "+a);
	}
}
public class RefelectionConcept9 extends RefelectionConcept9_E 
{
	public void clear()
	{

	}
    void use()
	{

	}
    public void test(double a)
	{
		System.out.println("I am double prameter test "+a);
	}
	public static void main(String[] args)throws Exception 
	{
		RefelectionConcept9 m = new RefelectionConcept9();
        Class c = m.getClass();
         Method x= c.getMethod("test",int.class);
		 Object obj =c.newInstance();
		 x.invoke(obj,10);  // call the method
	     System.out.println(x.getName());
	     
	     Method y = c.getMethod("test", double.class);
	     
	     y.invoke(obj, 12.2);
	     
	     System.out.println(y.getModifiers()+" "+y.getReturnType()+" "+y.getName());
		
	}
}

/*Output:-

I am int parameter test 10
test
I am double prameter test 12.2
1 void test
*/