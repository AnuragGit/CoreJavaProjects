package com.anurag.polymorphism;

/**
 * @author Anurag
 * 
 *         Concept:- This program showing static method is not overriding ,hence
 *         polymorphism not work in case of static method.
 * 
 *         If at all method override then only we can achieve polymorphism
 *
 */

class Polymorphism3_E {
	static void test() {
		System.out.println("Polymorphism3_E test");
	}
}

class Polymorphism3_F extends Polymorphism3_E {
	static void test() {
		System.out.println("Polymorphism3_F test"); //This is not override method.
	}
}

public class Polymorphism3 {

	static void method(Polymorphism3_E obj) {
		obj.test();  
	}

	public static void main(String[] args) {
		Polymorphism3_E obj1 = new Polymorphism3_E();
		Polymorphism3_F obj2 = new Polymorphism3_F();
		obj2.test();
		System.out.println("=============================");

		method(obj1);
		System.out.println("===== Because of static method not overriding we are getting super class method execute===============");
		method(obj2);
	}
}
