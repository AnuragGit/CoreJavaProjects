package com.anurag.enumprogram;

/**
 * @author Anurag
 *
 *         Concept:- For every enum constant corresponding constructor
 *         executing. If we not keep constructor compiler keep default
 *         constructor.
 * 
 *         when enum load to memory every constant load into memory. while
 *         loading the enum constant the corresponding constructor loading in
 *         memory.
 *         
 *         We have to define the constructor as per type of enum constant.Below
 *         program is showing the same trick.
 * 
 * 
 * 
 */

enum Enum10_En {
	CON, A(90), B("abc"), CON2(50.90);

	Enum10_En() {
		System.out.println("CON");
	}

	Enum10_En(int i) {
		System.out.println("En(int)" + i);
	}

	Enum10_En(String s) {
		System.out.println("En(Sting)" + s);
	}

	Enum10_En(double d) {
		System.out.println("En(double)" + d);
	}

}

public class Enum10 {
	public static void main(String[] args) {
		Enum10_En e1 = Enum10_En.B;
		System.out.println(e1);
	}

}
/*
 * Output:-
 * 
 * CON
 * En(int)90
 * En(Sting)abc
 * En(double)50.9 B
 */