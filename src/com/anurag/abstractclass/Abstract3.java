package com.anurag.abstractclass;
/**
 *  * @author Anurag
 *    
 *    
 *    Concept:-  If all method is implemented in a class but we want to restrict the object creation of
 *    the particular class then we can go with abstract .
 *    
 *    So In order to restrict  creating a object of class we can declare class to abstract.
 *    
 *    But if any method is abstract in side the class then class must be abstract.
 *    
 *    
 */


abstract class  Abstract3_base_first{
	void test1(){
		System.out.println("test1()");
	}
	
	abstract void test2();
	abstract void test3();
}

abstract class Abstract3_base_second extends Abstract3_base_first{
	void test2(){
		System.out.println("test2()");
	}
}

abstract class Abstract3_base_third extends Abstract3_base_second{
	void test3(){
		System.out.println("test3()");
	}
}

class NonAbstract3 extends Abstract3_base_third{
	
}

public class Abstract3 {
		public static void main(String[] args) {
	           NonAbstract3 na = new NonAbstract3();
	           na.test1();
	           na.test2();
	           na.test3();
		}
}

/*Output:-

test1()
test2()
test3()*/
