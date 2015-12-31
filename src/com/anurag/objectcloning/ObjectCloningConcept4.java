package com.anurag.objectcloning;

/**
 *  @author Anurag
 *    
 *     Concept:-clone achieve to some different way
 */

class Smart implements Cloneable
{
	int i;
	Smart(int i)
	{
		this.i=i;
	}
	public Object getDuplicate()throws CloneNotSupportedException
	{
		return super.clone();
	}

}
public class ObjectCloningConcept4 
{
	public static void main(String[] args) throws CloneNotSupportedException
	{
		Smart s1 = new Smart(10);
		
		Smart s2=(Smart) s1.getDuplicate();
		System.out.println(s1.i);
		System.out.println(s2.i);
		s2.i=30;
		System.out.println(s2.i);

		System.out.println("Hello World!");
	}
}
