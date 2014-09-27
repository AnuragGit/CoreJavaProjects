package com.anurag.inheritance.nonstaticinheritance;
/**
 * * @author Anurag
 *   Concept:- If Constructor first statement is other than this statement then compiler keep
 *             super() statement and after this IIB.
 *             
 *             While executing is subclass object super class constructor execute first then subclass
 *             constructor will execute.
 */

class Inheritance7_base {
	Inheritance7_base(){
		System.out.println("Inheritance7_base()");
	}
}
public class Inheritance7 extends Inheritance7_base {

	Inheritance7(){
		System.out.println("Inheritance7()");
	}
	
	public static void main(String[] args) {
		Inheritance7 i1= new Inheritance7();
		System.out.println("================");
		Inheritance7_base i2 = new Inheritance7_base();
	}
}

/*		Output:-
		
		Inheritance7_base()
		Inheritance7()
		================
		Inheritance7_base()
*/