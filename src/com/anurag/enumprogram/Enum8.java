package com.anurag.enumprogram;
/**
 * 
 * @author Anurag
 *		
 *		Concept:- By default case is always take integer number but here switch argument is enum 
 *                type then case Contain any enum constant.
 */
public class Enum8 {

	enum Enum8_En{
		A,B,C,D;
	}
	
	public static void main(String[] args) {
		Enum8_En e1 = Enum8_En.C;
		switch(e1){
		case A:
		{
			System.out.println("Con A");
			break;
		}
		case B:
		{
			System.out.println("Con B");
			break;
		}
		case C:
		{
			System.out.println("Con c");
			break;
		}
		case D:
		{
			System.out.println("Con D");
			break;
		}
		}
	}
}

/*

		Output:-
		Con c

*/