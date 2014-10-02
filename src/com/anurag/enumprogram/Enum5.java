package com.anurag.enumprogram;

/**
 * @author Anurag
 *		
 *		Concept:- Ordinal() method return the index of constant
 */
public class Enum5 {
	enum Enum5_En{
		A,B,C,D,E;
	}
	
	public static void main(String[] args) {
		Enum5_En e1 =Enum5_En.A;
		
		System.out.println(e1.ordinal());
		
		Enum5_En e2 =Enum5_En.D;
		
		System.out.println(e2.ordinal());
	}
}

/*		
		Output:-
		0
		3
*/