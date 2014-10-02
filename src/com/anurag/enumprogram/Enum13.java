package com.anurag.enumprogram;

/**
 * @author Anurag
 *
 *         Concept:- We can not use the static member inside the enum
 *         constructor.
 * 
 *         Reason:- While loading constant corresponding constructor has to
 *         execute, on that time static attribute not available . so compiler
 *         will give error.
 */
public class Enum13 {
	enum Enum13_En {
		A, B, C;
		static int i;

		Enum13_En() {
			// i=15; This statement show error.
		}
	}

	public static void main(String[] args) {
		Enum13_En e1 = Enum13_En.C;
		System.out.println("done");
	}
}

/*
 * Output:-
 * 
 * Done
 */