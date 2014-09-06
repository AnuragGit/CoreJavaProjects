package com.anurag.encapsulation;

/**
 * @author Anurag
 *
 *         This example show call by reference technique
 */

class Encapsulation2_sub {
	
}

public class Encapsulation2 {
	int i;

	static void test(Encapsulation2 e) {
		e.i = 10;
	}
	public static void main(String[] args) {
			
		Encapsulation2 es = new Encapsulation2();
		es.i=1;
		System.out.println("Before method call="+es.i);
		test(es);
		System.out.println("After method call="+es.i);
	}

}

/*
 * 
 *    Output:-
 *      Before method call=1
		After method call=10

 */
