package com.anurag.polymorphism;
/**
 * @author Anurag
 *	Concept:-
 *
 *            If static method not inside in subclass then compiler automatic look inside the superclass
 *            and it will replace sup class to super class.
 *            
 *            So in below example subclass don't have method any method and static method also not able
 *            to inherit also but compiler automatic look static method to super class if it is not
 *            available on subclass.
 */

class Polymorphism4_G{
	static void test(){
		System.out.println("Polymorphism4_G");
	}
}

class Polymorphism4_H extends Polymorphism4_G{
	
}
public class Polymorphism4 {
	public static void main(String[] args) {
		Polymorphism4_G.test();
		Polymorphism4_H.test();
	}
}
/*
	Ouput:-
	
	Polymorphism4_G
	Polymorphism4_G

*/