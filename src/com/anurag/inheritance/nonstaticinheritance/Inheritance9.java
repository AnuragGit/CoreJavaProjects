package com.anurag.inheritance.nonstaticinheritance;
/**
 ** @author Anurag
 *
 *   Concept:-
 *   
 *   The first statement of constructor is this() or super() statement .If First is this then
 *   IIB will be not is the second statement but if the first statement is not a this then compiler by
 *   default put the first statement is super and then IIB.
 *   
 *   
 *   super() and this() , these are the first statement of the constructor and Complier keeping by default
 *   super() on a first statement of the constructor and if we want to keep super() then we also need to keep
 *   first statement only otherwise compile time error will be come. 
 *   
 *   The same rule is applicable of this() also but this() we need to keep explicit compiler is not
 *   keeping this() by default
 *   
 *   This is a example of constructor chaining .
 *   
 *   Chain of constructor are involve   while initializing an object.
 */

class Inheritance9_c{
	Inheritance9_c(){
		System.out.println("Inheritance9_c()");
	}
	{
		System.out.println("Inheritance9_c() IIB1");
	}
	{
		System.out.println("Inheritance9_c() IIB2");
	}
	{
		System.out.println("Inheritance9_c() IIB3");
	}
}

class Inheritance9_d extends Inheritance9_c{
	Inheritance9_d(){
		System.out.println("Inheritance9_d()");
	}
	
	{
		System.out.println("Inheritance9_d() IIB1");
	}
	{
		System.out.println("Inheritance9_d() IIB2");
	}
}
public class Inheritance9 {
	
	public static void main(String[] args) {
		Inheritance9_d d1 = new Inheritance9_d();
		System.out.println("====================");
		Inheritance9_c c1 = new Inheritance9_c();
		
	}
}


/*		Output:-
		
		Inheritance9_c() IIB1
		Inheritance9_c() IIB2
		Inheritance9_c() IIB3
		Inheritance9_c()
		Inheritance9_d() IIB1
		Inheritance9_d() IIB2
		Inheritance9_d()
		====================
		Inheritance9_c() IIB1
		Inheritance9_c() IIB2
		Inheritance9_c() IIB3
		Inheritance9_c()*/
