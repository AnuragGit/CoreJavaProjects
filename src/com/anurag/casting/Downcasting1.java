package com.anurag.casting;
/**
 * 
 * @author Anurag
 *
 *    Concept:- When right side subclass object or reference is going to assign left side superclass reference
 *              this is knows as Down casting .
 *              
 *              Here we need to cast explicit, there is no automation like up casting.
 */
public class Downcasting1 {

	public static void main(String[] args) {
		A a1 = new B();
		a1.check();
		B b1 =(B) a1;   // This is Down casting
		b1.check();
		
		System.out.println("==============");
		
		B b2= new E();
		b2.check();
		C c1 =(C)b2;
		c1.check();
		D d1 =(D)b2;
		d1.check();
		E e1=(E)b2;
		e1.check();
		
		System.out.println("=================");
		
		Object o1=new D();
		A a3=(B)o1;      // (o1 is super class reference ) then Downcasting require to make -left side is superclass and right side is subclass
		a3.check();
		C c3=(D)o1;      // (o1 is super class reference ) then Downcasting require to make -left side is superclass and right side is subclass
		c3.check();
		D d3=(D)o1;      // (o1 is super class reference ) then Downcasting require to make -left side is superclass and right side is subclass
		d3.check();
		
		System.out.println("==================");
		
		Object o2 = new B();
		
	//	C c4=(C)o2;                // This line will give class cast exception because o2 is pointing to 
		                           // B class this object don't know about class C.
		
		B b4=(B)o2;
		b4.check();
		A a4=(A)o2;
		b4.check();
		
		System.out.println("Done");
	}
}

/*	Output:-
	
	Check- B
	Check- B
	==============
	Check- E
	Check- E
	Check- E
	Check- E
	=================
	Check- D
	Check- D
	Check- D
	==================
	Check- B
	Check- B
	Done*/