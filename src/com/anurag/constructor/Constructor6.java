package com.anurag.constructor;

/**
 * 
 * @author Anurag
 * 
 *         Concept:-
 * 
 *         This program will show Constructor overloading...
 */
public class Constructor6 {

	Constructor6() {
		System.out.println("Constructor6()");
	}

	Constructor6(int i) {
		System.out.println("Constructor6(int i)");
	}

	Constructor6(int i, int j) {
		System.out.println("Constructor6(int i ,int j)");
	}

	public static void main(String[] args) {
		Constructor6 c1 = new Constructor6();
		System.out.println("=====================");
		Constructor6 c2 = new Constructor6(10);
		System.out.println("=====================");
		Constructor6 c3 = new Constructor6(10, 20);
		System.out.println("=====================");
	}

}

/*		Output:-
		
		Constructor6()
		=====================
		Constructor6(int i)
		=====================
		Constructor6(int i ,int j)
		=====================
*/
