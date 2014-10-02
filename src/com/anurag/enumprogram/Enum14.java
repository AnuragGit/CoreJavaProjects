package com.anurag.enumprogram;

/**
 * 
 * @author Anurag
 *
 *         Concept:- This program show the enum member method for all constant and specific 
 *         constant also.
 */
public class Enum14 {
	enum Enum14_En {
		A, B, C {
			void printf1() {//Constant specific class body line override.
				System.out.println("C-PrintF");
			}
		},
		D, E;

		void printf() {
			System.out.println("General");
		}
	}

	public static void main(String[] args) {
		Enum14_En e1 = Enum14_En.A;
		e1.printf();
		Enum14_En e2 = Enum14_En.B;
		e2.printf();
		Enum14_En e3 = Enum14_En.C;
		e3.printf();
		Enum14_En e4 = Enum14_En.D;
		e4.printf();
		Enum14_En e5 = Enum14_En.E;
		e5.printf();

	}
}
/*	
	Output:-
	
	General
	General
	C-PrintF
	General
	General
	
*/