package com.anurag.inheritance.nonstaticinheritance;

/**
 *@author Anurag
 *
 *Concept:-
 *        Combination of SIB and IIB and Inheritance concept
 *
 */

class Inheritance12_L{
	static{
		System.out.println("Inheritance12_L SIB");
	}
	
	{
		System.out.println("Inheritance12_L IIB");
	}
	
	Inheritance12_L(int i){
		System.out.println("Inheritance12_L(int)");
	}
}

class Inheritance12_M extends Inheritance12_L{
	
	static{
		System.out.println("Inheritance12_M SIB");
	}
	{
		System.out.println("Inheritance12_M IIB");
	}
	Inheritance12_M(){
		super(10);
		System.out.println("Inheritance12_M()");
	}
}
public class Inheritance12 {
	public static void main(String[] args) {
		Inheritance12_M obj = new Inheritance12_M();
		System.out.println("=====================");
		Inheritance12_L obj1 = new Inheritance12_L(10);
		
	}
}

/*			Output:-
			
			Inheritance12_L SIB
			Inheritance12_M SIB
			Inheritance12_L IIB
			Inheritance12_L(int)
			Inheritance12_M IIB
			Inheritance12_M()
			=====================
			Inheritance12_L IIB
			Inheritance12_L(int)*/
