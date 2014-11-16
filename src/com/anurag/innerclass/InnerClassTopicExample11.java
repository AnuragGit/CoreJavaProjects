package com.anurag.innerclass;

/**
 * @author Anurag
 * 
 *     Concept:- Anonymous Inner class always be concrete
 *
 */

class InnerClassTopicExample11_A{
	void test(){
		System.out.println("A-test");
	}
}
public class InnerClassTopicExample11 {
	public static void main(String[] args) {
		InnerClassTopicExample11_A a1 = new InnerClassTopicExample11_A();
		a1.test();
		System.out.println("==============================");
		
		
		InnerClassTopicExample11_A a2 = new InnerClassTopicExample11_A();
		a2.test();
		System.out.println("==============================");
		
		
		InnerClassTopicExample11_A a3 = new InnerClassTopicExample11_A(){
			
		};
		a3.test();
		System.out.println("==============================");
		InnerClassTopicExample11_A a4 = new InnerClassTopicExample11_A(){
			void test(){
				System.out.println("AIC-test");
			}
		};
		a4.test();
		System.out.println("==============================");
		
	}
}

/*Output:-


A-test
==============================
A-test
==============================
A-test
==============================
AIC-test
==============================
*/