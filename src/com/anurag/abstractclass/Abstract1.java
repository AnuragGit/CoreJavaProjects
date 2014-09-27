package com.anurag.abstractclass;
/**
 * @author Anurag
 *  Concept:-
 *  
 *        Concreate class which is ready to create object but Abstract class is not ready to 
 *        create object abstract means it is not fully implemented we can not use strike away to 
 *        abstract class to create object.
 */

abstract class Abstract1_first{
	abstract void test1();   // unimplemented method
	void test2(){
		
	}
}
public class Abstract1 {

	public static void main(String[] args) {
		
		//Abstract1_first a1 = new Abstract1_first();
		
		//The top line will give compile time error.
	}
}
