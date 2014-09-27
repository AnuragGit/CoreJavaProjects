package com.anurag.inheritance.nonstaticinheritance;
/**
 * @author Anurag
 *  
 *  
 *  Concept:- This is also chain of constructor executing example.
 */

class Inheritance11_I{
	Inheritance11_I(){
		System.out.println("Inheritance11()");
	}
	{
		System.out.println("Inheritance11_I IIB");
	}
	
	Inheritance11_I(int x){
		System.out.println("Inheritance11_I(int) ");
	}
}

class Inheritance11_J extends Inheritance11_I{
	{
		System.out.println("Inheritance11_J() IIB");
	}
	
	Inheritance11_J(int x){
		System.out.println("Inheritance11_J(int)");
	}
	
	Inheritance11_J(){
		super(20);
		System.out.println("Inheritance11_J()");
	}
}

class Inheritance11_K extends Inheritance11_J{
	Inheritance11_K(){
		super(100);
		System.out.println("Inheritance11_K()");
	}
	{
		System.out.println("Inheritance11_K() IIB");
	}
	
	Inheritance11_K(int i){
		this();
		System.out.println("Inheritance11_K(int)");
	}
}
public class Inheritance11 {
	public static void main(String[] args) {
		Inheritance11_I i1 = new Inheritance11_I();
		System.out.println("=======================");
		Inheritance11_I i2 = new Inheritance11_I(20);
		System.out.println("=========================");
		
		Inheritance11_J j1 = new Inheritance11_J(20);
		System.out.println("===========================");
		Inheritance11_J j2 = new Inheritance11_J();
		System.out.println("=============================");
		
		Inheritance11_K k1  = new Inheritance11_K(20);
		System.out.println("===============================");
		Inheritance11_K k2 = new Inheritance11_K();
		System.out.println("=====================================");
		
	}
}

/*		Output:-
		
		Inheritance11_I IIB
		Inheritance11()
		=======================
		Inheritance11_I IIB
		Inheritance11_I(int) 
		=========================
		Inheritance11_I IIB
		Inheritance11()
		Inheritance11_J() IIB
		Inheritance11_J(int)
		===========================
		Inheritance11_I IIB
		Inheritance11_I(int) 
		Inheritance11_J() IIB
		Inheritance11_J()
		=============================
		Inheritance11_I IIB
		Inheritance11()
		Inheritance11_J() IIB
		Inheritance11_J(int)
		Inheritance11_K() IIB
		Inheritance11_K()
		Inheritance11_K(int)
		===============================
		Inheritance11_I IIB
		Inheritance11()
		Inheritance11_J() IIB
		Inheritance11_J(int)
		Inheritance11_K() IIB
		Inheritance11_K()
		=====================================
		
*/