package com.anurag.inheritance.nonstaticinheritance;
/**
 * @author Anurag
 *
 *   Concept:-Here base class doesn't have default constructor then on subclass constructor we will have
 *   to keep super(arg) constructor explicit because compiler is keeping by default super() but there is
 *   no constuctor like that on superclass.
 *   
 *             
 */

class Inheritance10_base{
	Inheritance10_base(int i){
		System.out.println("Inheritance10_base(int)");
	}
}
public class Inheritance10 extends Inheritance10_base {

	Inheritance10() {
		super(10);// Here we will have to put statement like this only .
		System.out.println("Inheritance10()");
	}
	
	public static void main(String[] args) {
		Inheritance10 i1 = new Inheritance10();
	}
        
}

/*		Output:-
		
		Inheritance10_base(int)
		Inheritance10()
*/
