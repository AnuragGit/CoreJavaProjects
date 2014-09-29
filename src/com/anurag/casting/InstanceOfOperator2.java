package com.anurag.casting;
/**
 * 
 * @author Anurag
 *
 */

class InstanceOfOperator2_Util{
	public static void test(Object obj){
		if(obj instanceof A){
			System.out.println("in to  A");
			A a1 = (A)obj;
		}
		if(obj instanceof B){
			System.out.println("in to  B");
			B b1 = (B)obj;
		}
		if(obj instanceof C){
			System.out.println("in to  C");
			C c1 = (C)obj;
		}
		if(obj instanceof D){
			System.out.println("in to  D");
			D d1 = (D)obj;
		}
		if(obj instanceof E){
			System.out.println("in to  E");
			E e1 = (E)obj;
		}
		
	}
}
public class InstanceOfOperator2 {
	public static void main(String[] args) {
		A a1 = new C();
		InstanceOfOperator2_Util.test(a1);
		
		System.out.println("======================");
		
		B b1 = new D();
		InstanceOfOperator2_Util.test(b1);
	}
}

	/*Output:-
	
	in to  A
	in to  B
	in to  C
	======================
	in to  A
	in to  B
	in to  C
	in to  D
*/
