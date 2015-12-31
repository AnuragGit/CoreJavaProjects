package com.anurag.objectcloning;

/**
 * 
 * @author Anurag
 *    Concept:- This example is showing shallow copy operation.
 *              Any mutable and Derived Data type except  Wrapper Class clone method 
 *              perform shallow copy.Shallow means not 100% disjoint.    
 *
 */

class ObjectCloningConcept3_Test
{
	int i;

}
public class ObjectCloningConcept3 implements Cloneable
{
	int j;
	ObjectCloningConcept3_Test t;
	ObjectCloningConcept3(int j,ObjectCloningConcept3_Test t)
	{
       this.j=j;
	   this.t=t;
	}
	public static void main(String[] args) throws CloneNotSupportedException
	{
		ObjectCloningConcept3_Test t = new ObjectCloningConcept3_Test();
		t.i=10;
		ObjectCloningConcept3 m1= new ObjectCloningConcept3(20,t);
		ObjectCloningConcept3 m2 =(ObjectCloningConcept3) m1.clone();
		System.out.println("m1.j="+m1.j);
		System.out.println("m1.t.i="+m1.t.i);
		System.out.println("m2.j="+m2.j);
		System.out.println("m2.t.i="+m2.t.i);

		m2.j=100;
		m2.t.i=300;
		System.out.println("-----------After Changing the cloned object value------------------");
		System.out.println("m1.j="+m1.j);
		System.out.println("m1.t.i="+m1.t.i);
		System.out.println("m2.j="+m2.j);
		System.out.println("m2.t.i="+m2.t.i);
		System.out.println("Hello World!");
	}
}

/*Output:-
m1.j=20
m1.t.i=10
m2.j=20
m2.t.i=10
-----------After Changing the cloned object value------------------
m1.j=20
m1.t.i=300
m2.j=100
m2.t.i=300
Hello World!
*/