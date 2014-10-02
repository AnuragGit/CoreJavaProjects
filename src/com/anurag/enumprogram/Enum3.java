package com.anurag.enumprogram;
/**
 * 
 * @author Anurag
 * 
 *		Concept:- Enum can be define inside class also.
 *
 */


public class Enum3 {
	enum Enum3_Gender{
		MALE,FEMALE;
	}
	
	public static void main(String[] args) {
		Enum3_Gender g1 =Enum3_Gender.MALE;
		System.out.println(g1);
		Enum3_Gender g2 =Enum3_Gender.FEMALE;
		System.out.println(g2);
	}
}
/*
Output:-

MALE
FEMALE
*/