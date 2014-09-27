package com.anurag.inheritance.nonstaticinheritance;
/**
 * @author Anurag
 *
 * Concept:-
 *  While executing is subclass object super class constructor execute first then subclass
 *  constructor will execute.
 *  
 *  And we know if consturctor first statement is not a "this" then it is super and after this IIB.
 *  
 *  java.lang.Object  is a most super class of every class. So every class have Object class member.
 */
class Inheritance8_base1{
	Inheritance8_base1(){
		System.out.println("Inheritance8_base1()");
	}
	
	{
		System.out.println("Inheritance8_base1() IIB");
	}
}

class Inheritance8_base2 extends Inheritance8_base1{
	
	Inheritance8_base2(){
		System.out.println("Inheritance8_base2()");
	}
	
	{
		System.out.println("Inheritance8_base2() IIB");
	}
}
public class Inheritance8 extends Inheritance8_base2 {
	
	Inheritance8(){
		System.out.println("Inheritance8()");
	}
	{
		System.out.println("Inheritance8() IIB");
	}

	public static void main(String[] args) {
		
		Inheritance8_base1 i1 = new Inheritance8_base1();
		
		System.out.println("==============================");
		
		Inheritance8_base2 i2 = new Inheritance8_base2();
		
		System.out.println("=================================");
		
		Inheritance8 i3 = new Inheritance8();
		
	}
}

/*			Output:-
			
			Inheritance8_base1() IIB
			Inheritance8_base1()
			==============================
			Inheritance8_base1() IIB
			Inheritance8_base1()
			Inheritance8_base2() IIB
			Inheritance8_base2()
			=================================
			Inheritance8_base1() IIB
			Inheritance8_base1()
			Inheritance8_base2() IIB
			Inheritance8_base2()
			Inheritance8() IIB
			Inheritance8()
*/