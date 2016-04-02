package com.anurag.objectcloning;

import java.util.HashMap;
import java.util.Iterator;

public class ObjectCloningConcept6 implements Cloneable{

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

	@Override
	public ObjectCloningConcept6 clone() {
		System.out.println("invoking overridden clone method");
		HashMap<String,String> hm = new HashMap<String,String>();
		String key;
		Iterator<String> it = this.props.keySet().iterator();
		// Deep Copy of field by field
		while (it.hasNext()) {
		key = it.next();
		hm.put(key, this.props.get(key).toString());
		}
		ObjectCloningConcept6 ct = new ObjectCloningConcept6();
		ct.setId(this.id);
		ct.setName(this.name);
		ct.setProps(hm);
		return ct;
		}
	public static void main(String[] args) throws CloneNotSupportedException {

		ObjectCloningConcept6 ct1 = new ObjectCloningConcept6();
		ct1.setId(1);
		ct1.setName("first");
		HashMap hm = new HashMap();
		hm.put("1", "first");
		hm.put("2", "second");
		hm.put("3", "third");
		ct1.setProps(hm);
		// Using default clone() implementation
		ObjectCloningConcept6 ct2 = (ObjectCloningConcept6) ct1.clone();
		// Check whether the ct1 and ct2 attributes are same or different
		System.out.println("ct1 and ct2 HashMap == test: " + (ct1.getProps() == ct2.getProps()));
		// Lets see the effect of using default cloning
		ct1.getProps().put("4", "fourth");
		System.out.println("ct2 props:" + ct2.getProps());
		ct1.setName("new");
		System.out.println("ct2 name:" + ct2.getName());

	}
}
