package com.anurag.polymorphism;

/**
 * @author Anurag
 *
 *		Concept:- Polymorphism  concept
 */

class Polymorphism2_C {
	void test() {
		System.out.println("Polymorphism2_C test");
	}
}

class Polymorphism2_D extends Polymorphism2_C {
	void test() {
		System.out.println("Polymorphism2_D test");
	}
}

public class Polymorphism2 {
	public static void main(String[] args) {
		Polymorphism2_C c1 = new Polymorphism2_C();
		Polymorphism2_D d1 = new Polymorphism2_D();
		Polymorphism2_C c2 = new Polymorphism2_D(); // Auto upcasting
		Polymorphism2_C x[] = new Polymorphism2_C[3];
		//Polymorphism2_C x[] = new Polymorphism2_D[3];
		
		//if we use commented code we will get java.lang.ArrayStoreException 
		//because array is not eligible to store superclass reference .
		
		x[0] = c1;
		x[1] = d1; // Auto upcasting
		x[2] = c2;

		for (int i = 0; i < x.length; i++) {
			x[i].test();
		}
		
	}
}


/*		Output:-
		
		Polymorphism2_C test
		Polymorphism2_D test
		Polymorphism2_D test
*/