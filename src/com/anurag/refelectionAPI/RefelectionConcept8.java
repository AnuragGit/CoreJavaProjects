package com.anurag.refelectionAPI;

/**
 * 
 * @author Anurag
 * 
 *        concept :- This program is showing how to get class information
 *                   back by object of class.
 *                   
 *                   And  this  program is also showing the usage of  getMethods() method. 
 *                   This method is available on "Class"  class , we able to fetch all public methods of 
 *                   class as well as parent class also.
 *                   
 *                   //Get all the public method  include inherited once.
                     //getMethods();
 *                   
 *
 */


import java.lang.reflect.Method;
class  RefelectionConcept8_E
{
	public void test()
	{

	}
	
	private void privateTestE(){
		
	}
}
public class RefelectionConcept8 extends RefelectionConcept8_E 
{
	public void clear()
	{

	}
    void use()
	{

	}
    
    private void privateTestF(){
		
	}
	public static void main(String[] args) 
	{
		RefelectionConcept8 m = new RefelectionConcept8();
        Class c = m.getClass();
         Method x[]= c.getMethods();
	   for(Method  mth :x)
		   System.out.println(mth.getName());
		
	}
}
/*
Output:-

main
clear
test
wait
wait
wait
equals
toString
hashCode
getClass
notify
notifyAll

*/
