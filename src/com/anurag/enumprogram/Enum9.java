package com.anurag.enumprogram;

/**
 * @author Anurag
 *		
 *		Concept:-   For every enum constant corresponding   constructor executing.
 *                  If we not keep constructor compiler keep default constructor.
 *                  
 *                  when enum load to memory every constant load into memory. while loading the enum
 *                  constant the corresponding constructor loading in memory.
 */
public class Enum9 {

	enum Enum9_En{
		C1,C2,C3,C4;
		
		Enum9_En(){
			System.out.println("En()");
		}
	}
	
	public static void main(String[] args) {
		Enum9_En e1= Enum9_En.C3;
		System.out.println(e1);
	}
}

/*
		Output:-
		
		En()
		En()
		En()
		En()
		C3


*/
