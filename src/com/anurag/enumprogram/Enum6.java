package com.anurag.enumprogram;
/**
 * 
 * @author Anurag
 *	
 *		Concept:- value() is a static method ,this will return every constant to array.
 */
public class Enum6 {
	enum Enum6_En{
		C1,C2,C3,C4;
	}
	
	public static void main(String[] args) {
		
		Enum6_En x[]=Enum6_En.values();
		for(int i=0;i<x.length;i++){
			System.out.println(x[i]);
		}
	}
}

/*
		Output:--
		
		C1
		C2
		C3
		C4
*/