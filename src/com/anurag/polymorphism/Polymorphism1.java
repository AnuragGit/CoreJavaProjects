package com.anurag.polymorphism;

/**
 * 
 * @author Anurag
 *
 *         Concept:- If at all method override ,we can achieve polymorphism.
 */

class Polymorphism1_A {
	void test1() {
		System.out.println("Polymorphism1_A test1");
	}

	void test2() {
		System.out.println("Polymorphism1_A test2");
	}
}

class Polymorphism1_B extends Polymorphism1_A {
	void test1() {
		System.out.println("Polymorphism1_B test1");
	}
}

public class Polymorphism1 {
	static void method(Polymorphism1_A a) {
		a.test1();
		a.test2();
	}

	public static void main(String[] args) {
		Polymorphism1_A a1 = new Polymorphism1_A();
		Polymorphism1_A a2 = new Polymorphism1_B(); //Auto upcasting

		method(a1);
		System.out.println("======================");
		method(a2);
	}
}

/*		Output:-
		
		Polymorphism1_A test1
		Polymorphism1_A test2
		======================
		Polymorphism1_B test1
		Polymorphism1_A test2
		
		*/

