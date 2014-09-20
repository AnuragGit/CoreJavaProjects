package com.anurag.inheritance;
/**
 *  * @author Anurag
 *  
 *  Concept:- Inheritance4_base is called superclass and Inheritance4  is called
 *  a subclass. Inheritance4_base is Generalized class and Inheritance4 is 
 *  Specialized class.
 *
 */

class Inheritance4_base{
	int x;
	void test1(){
		System.out.println("test1");
	}
}
public class Inheritance4 extends Inheritance4_base {

	int y;
	void test2(){
		System.out.println("test2");
	}
	
	public static void main(String[] args) {
		Inheritance4_base i1 = new Inheritance4_base();
		i1.x=10;
		i1.test1();
		System.out.println("===========================");
		Inheritance4 i2 = new Inheritance4();
		i2.x=20;
		i2.y=40;
		i2.test1();
		i2.test2();
		
		System.out.println(i1.x);
		System.out.println(i2.x);
		System.out.println(i2.y);
		
	}
}

/*		Output:-
		
		test1
		===========================
		test1
		test2
		10
		20
		40*/
