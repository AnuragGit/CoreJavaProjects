package com.anurag.casting;
/**
 * 
 * @author Anurag
 *
 *    Concept:- 
 *      If the right side is the subclass and left side is the superclass then compiler automatic
 *      doing upcasting this example will show the same things
 */
public class Upcasting2 {

	public static void main(String[] args) {
		A a1 = new B();
		B b1 = new C();
		C c1 = new D();
		
		A a2 =b1;
		B b2=c1;
		
		//no need to write like this because compiler automatic does for us in case of Autoupcasting.		
		A a3 =(A) new B();
		B b3 =(B) new C();
		C c3 =(C) new D();	
		A a4 =(A)b3;
		B b4 =(B)c3;
		
		//Object is super most class of all class
		Object o1 =new A();
		A a5 = new C();
		B b5 = new E();
		
		E e1 = new E();
		Object obj =test1(e1);
		
	}
	
	static A test1(D d1){
		return test2(d1);
	}
	
	static B test2(C c1){
		return c1;
	}
}
