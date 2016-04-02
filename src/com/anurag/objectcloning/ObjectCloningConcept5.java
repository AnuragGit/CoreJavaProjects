package com.anurag.objectcloning;

/**
 * @author Anurag
 * 
 *      Concept:-
 *                 
 *                 This program is showing what could be the drawback of  default clone() function
 *                
 *                 default clone function uses Shallow copy and ct2 is affected by any change 
 *                 in the ct1 attributes.
 *                 
 *                 If our Class contains mutable objects, then we need to provide
 *                 the proper implementation of clone() function that uses “Deep Copy”.
 */

import java.util.HashMap;

public class ObjectCloningConcept5 implements Cloneable {
	private int id;

	private String name;

	private HashMap props;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public HashMap getProps() {
		return props;
	}

	public void setProps(HashMap props) {
		this.props = props;
	}

	public static void main(String[] args) throws CloneNotSupportedException {

		ObjectCloningConcept5 ct1 = new ObjectCloningConcept5();
		ct1.setId(1);
		ct1.setName("first");
		HashMap hm = new HashMap();
		hm.put("1", "first");
		hm.put("2", "second");
		hm.put("3", "third");
		ct1.setProps(hm);
		// Using default clone() implementation
		ObjectCloningConcept5 ct2 = (ObjectCloningConcept5) ct1.clone();
		// Check whether the ct1 and ct2 attributes are same or different
		System.out.println("ct1 and ct2 HashMap == test: " + (ct1.getProps() == ct2.getProps()));
		// Lets see the effect of using default cloning
		ct1.getProps().put("4", "fourth");
		System.out.println("ct2 props:" + ct2.getProps());
		ct1.setName("new");
		System.out.println("ct2 name:" + ct2.getName());

	}
}

/*
Output:-

ct1 and ct2 HashMap == test: true
ct2 props:{3=third, 2=second, 1=first, 4=fourth}
ct2 name:first

*/
