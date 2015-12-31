package com.anurag.objectcloning;

/**
 * @author Anurag
 *  
 *     Concept:-
 *     Clone Operation is secure operation we require the marker interface.
 *     That is Cloneable Interface.
 *     It throw one checked exception CloneNotSupportException. 
 *     
 *
 */
public class ObjectCloningConcept1 implements Cloneable {
	int i;
	public static void main(String[] args) throws CloneNotSupportedException {
		ObjectCloningConcept1 m1 = new ObjectCloningConcept1();
		m1.i = 100;
		ObjectCloningConcept1 m2 = (ObjectCloningConcept1) m1.clone();
		System.out.println(m1.i);
		System.out.println(m2.i);
		System.out.println("Hello World!");
	}
}
/*
Output:-
100
100
Hello World!

*/