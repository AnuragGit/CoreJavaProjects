package com.anurag.casting;
/**
 * @author Anurag
 *
 *   Concept:-  instanceof Operator is checking scope of the reference variable  and it will give true 
 *              result from base class to top most subclass.
 */
public class InstanceOfOperator1 {
	
	public static void main(String[] args) {
		A a1= new A();
		A a2 = new B();
		
		System.out.println(a1 instanceof Object);
		System.out.println(a1 instanceof A);
		System.out.println(a1 instanceof B);
		System.out.println(a2 instanceof Object);
		System.out.println(a2 instanceof A);
		System.out.println(a2 instanceof B);
		
		System.out.println("=================================");
		
		A a3 = new C();
		System.out.println(a3 instanceof A);
		System.out.println(a3 instanceof B);
		System.out.println(a3 instanceof C);
		System.out.println(a3 instanceof D);
		System.out.println(a3 instanceof E);
		
	}
}

	
	
/*		Output:-
		
		true
	true
	false
	true
	true
	true
	=================================
	true
	true
	true
	false
	false
		
*/
