package com.anurag.objectcloning;
/**
 * 
 * @author Anurag
 *    Concept:- Example of deepCopy in clone.    
 *              All primitive or immutable Objects perform deepCopy operation by its clone().
 *              
 *              So cloned object is totally separate  from original object and changing the 
 *              value of clone object is not reflecting in original object. This concept is 
 *              known as deep copy in clone and it can be achieve if and only if object attribute
 *              having primitive or immutable .
 *
 */

public class ObjectCloningConcept2  implements Cloneable
{
	Integer i;
	String arg;
	int j;
	ObjectCloningConcept2(Integer i,int j,String arg)
	{
		this.i=i;
		this.j=j;
		this.arg=arg;
	}
	public static void main(String[] args) throws CloneNotSupportedException
	{
		ObjectCloningConcept2 m1 = new ObjectCloningConcept2(10,20,"anurag");
		ObjectCloningConcept2 m2=(ObjectCloningConcept2) m1.clone();
		System.out.println("m1.i="+m1.i);
		System.out.println("m1.j="+m1.j);
		System.out.println("m1.arg="+m1.arg);
		System.out.println("m2.i="+m2.i);
		System.out.println("m2.j="+m2.j);
		System.out.println("m2.arg="+m2.arg);
		m2.i=100;
		m2.j=200;
		m2.arg="update anurag";
		System.out.println("---------After changed the value of clone object-------------");
       System.out.println("m1.i="+m1.i);
		System.out.println("m1.j="+m1.j);
		System.out.println("m1.arg="+m1.arg);
		System.out.println("m2.i="+m2.i);
		System.out.println("m2.j="+m2.j);
		System.out.println("m2.arg="+m2.arg);
		
		m1.i=1001;
		m1.j=2001;
		m1.arg="anurag soni";
	    System.out.println("---------After changed the value of original object-------------");
        System.out.println("m1.i="+m1.i);
		System.out.println("m1.j="+m1.j);
		System.out.println("m1.arg="+m1.arg);
		System.out.println("m2.i="+m2.i);
		System.out.println("m2.j="+m2.j);
		System.out.println("m2.arg="+m2.arg);


		System.out.println("Hello World!");
	}
}
/*
Output:-

m1.i=10
m1.j=20
m1.arg=anurag
m2.i=10
m2.j=20
m2.arg=anurag
---------After changed the value of clone object-------------
m1.i=10
m1.j=20
m1.arg=anurag
m2.i=100
m2.j=200
m2.arg=update anurag
---------After changed the value of original object-------------
m1.i=1001
m1.j=2001
m1.arg=anurag soni
m2.i=100
m2.j=200
m2.arg=update anurag
Hello World!
*/