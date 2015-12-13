package com.anurag.object;

/**
 * * @author Anurag 
 * Concept:- Hashcode is a Object class method it return memory
 *           address in form of integer.
 */
class Object9_R {
	int i;

	Object9_R(int i) {
		this.i = i;
	}
}

public class Object9 {
	public static void main(String[] args) {
		Object9_R r1 = new Object9_R(90);
		Object9_R r2 = new Object9_R(90);
		System.out.println(r1.hashCode());
		System.out.println(r2.hashCode());
		Object9_R r3 = r2;
		System.out.println(r3.hashCode());
		System.out.println("Hello World!");
	}
}

/*Output:-
33311724
14452073
14452073
Hello World!*/