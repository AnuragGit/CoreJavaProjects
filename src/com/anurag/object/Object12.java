package com.anurag.object;

/**
 * @author Anurag
 *   
 *   Concept:- This program show what is use of hascode() and equals() method and we need to follow convention like whenever we are 
 *             overriding hashcode() method we need to override equals() method as well and same opposite also. 
 * 
 */
import java.util.HashSet;

class Object12_U {
	int i;

	public String toString() {
		return "i=" + i;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("equal() method is calling");
		if (!(obj instanceof Object12_U)) {
			return false;
		}
		return i == ((Object12_U) obj).i;
	}

	@Override
	public int hashCode() {
		System.out.println("hashcode() method is calling");
		String s1 = Integer.toString(i);
		return s1.hashCode();
	}

}

public class Object12 {
	public static void main(String[] args) {
		Object12_U u1 = new Object12_U();
		Object12_U u2 = new Object12_U();
		Object12_U u3 = new Object12_U();
		Object12_U u4 = new Object12_U();
		Object12_U u5 = new Object12_U();
		Object12_U u6 = new Object12_U();

		u1.i = u2.i = u3.i = 100;
		u4.i = 120;
		u5.i = 160;
		u6.i = 120;
		HashSet set = new HashSet();
		System.out.println("Going to add u1 object to set with value= " + u1.i);
		System.out.println(
				"hashcode() mehtod will call and after this it won't call equal() because "
				+ "there is no hashcode avialble with same value");
		set.add(u1);
		System.out.println("=====");
		System.out.println("Going to add u2 object to set with value= " + u2.i);
		System.out.println(
				"Before add, hascode() method will be call but ,same hashcode is already "
				+ "available then it will call equals() method and now same process will "
				+ "apply for further addition in rest of elements. If hascode is not avialable it wonn't call equals method()");
		set.add(u2);
		System.out.println("=====");
		System.out.println("Going to add u3 object to set with value= " + u3.i);
		set.add(u3);
		System.out.println("=====");
		System.out.println("Going to add u4 object to set with value= " + u4.i);
		set.add(u4);
		System.out.println("=====");
		System.out.println("Going to add u5 object to set with value= " + u5.i);
		set.add(u5);
		System.out.println("=====");
		System.out.println("Going to add u6 object to set with value= " + u6.i);
		set.add(u6);
		System.out.println("=====");
		System.out.println(set.size() + "  " + set);
		System.out.println("Hello World!");
	}
}
/*
Output:-

Going to add u1 object to set with value= 100
hashcode() mehtod will call and after this it won't call equal() because there is no hashcode avialble with same value
hashcode() method is calling
=====
Going to add u2 object to set with value= 100
Before add, hascode() method will be call but ,same hashcode is already available then it will call equals() method and now same process will apply for further addition in rest of elements. If hascode is not avialable it wonn't call equals method()
hashcode() method is calling
equal() method is calling
=====
Going to add u3 object to set with value= 100
hashcode() method is calling
equal() method is calling
=====
Going to add u4 object to set with value= 120
hashcode() method is calling
=====
Going to add u5 object to set with value= 160
hashcode() method is calling
=====
Going to add u6 object to set with value= 120
hashcode() method is calling
equal() method is calling
=====
3  [i=160, i=120, i=100]
Hello World!
*/
