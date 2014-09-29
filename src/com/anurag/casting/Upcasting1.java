package com.anurag.casting;
/**
 * @author Anurag
 *
 *    concept:- This program is for auto up casting.
 */
public class Upcasting1 {
	public static void main(String[] args) {
		A a1 = new A();
		B b1 = new B();
		C c1 = new C();
		D d1 = new D();
		E e1 = new E();
		
		A a2 =a1;
		B b2 =b1;
		C c2 =c1;
		D d2 =d1;
		E e2 =e1;
		
		test(a1);
		test(b1);
		test(c1);
		test(d1);
		test(e1);
		System.out.println("Done");
		
	}
	
	static void test(A a1){
			a1.check();
	}
}
/*		
		Output:-
		
		Check- A
		Check- B
		Check- C
		Check- D
		Check- E
		Done

*/