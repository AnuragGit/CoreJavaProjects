package com.anurag.inheritance;
/**
 *  @author Anurag
 *  
 *  Conept:- When Inheritance5 load in the memory it check any superclass is available 
 *  then Inheriatance5_base load fist so Inheriatance5_base SIB load first.
 */

class Inheritance5_base{
	static{
		System.out.println("Inheritance5_base -SIB");
	}
	
	void test1(){
		System.out.println("test1");
	}
}
public class Inheritance5 extends Inheritance5_base {
	
	public static void main(String[] args) {
		System.out.println("main begain");
		Inheritance5_base i1 = new Inheritance5_base();
		i1.test1();
		System.out.println("main end");
	}
	
	static{
		System.out.println("Inheritance5 SIB");
	}
}


/*	Output:-
	
	Inheritance5_base -SIB
	Inheritance5 SIB
	main begain
	test1
	main end
*/