package com.anurag.enumprogram;

/**
 * @author Anurag
 *
 *    Concept:- valueOf() method return Enum constant.
 */
public class Enum7 {
	enum Enum7_En{
		CON1,CON2,CON3;
	}
	
	public static void main(String[] args) {
		
		Enum7_En e1 = Enum7_En.valueOf("CON3");
		System.out.println(e1);
	}
}

		/*
		
		Output:-
		CON3
		
		*/