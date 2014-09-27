package com.anurag.abstractclass;
/**
 * @author Anurag
 *  
 *  Concept:-Even though we not able to create a object of abstract class but it is possible to create a 
 *  Object of subclass of abstract class .So while executing the constructor of subclass, superclass
 *  constructor will also execute. 
 *  
 *   It is 100% possible to give constructor definition in abstract class also.
 *   
 *   But constructor can not be abstract.It is always concreate.
 *   
 *   So no abstract class will be 100% abstract because of the Constructor.
 */

abstract class Abstract4_base{
	Abstract4_base(){
		System.out.println("Abstract4_base()");
	}
}

class NonAbstract4 extends Abstract4_base{
	NonAbstract4(){
		System.out.println("NonAbstract4()");
	}
}

public class Abstract4 {
	public static void main(String[] args) {
		NonAbstract4 na = new NonAbstract4();
		System.out.println("Done");
	}
}

/*  Output:-
	
	Abstract4_base()
	NonAbstract4()
	Done
*/