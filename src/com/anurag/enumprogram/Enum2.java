package com.anurag.enumprogram;
/**
 * 
 * @author Anurag
 *	Concept:- To provide the uniqueness among the developer while choosing constant. 
 *
 */

enum Enum2_Month{
	JAN,FEB,MAR,APR,MAY,JUN,JUL,AUG,SEP,OCT,NOV,DEC;
}
public class Enum2 {
	public static void main(String[] args) {
		Enum2_Month m1 = Enum2_Month.OCT;
		System.out.println(m1);
		Enum2_Month m2 = Enum2_Month.NOV;
		System.out.println(m2);
	}
}
/*
Output:-

OCT
NOV
*/