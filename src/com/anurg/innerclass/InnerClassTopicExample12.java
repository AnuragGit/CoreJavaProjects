package com.anurg.innerclass;

/**
 * @author Anurag
 *            Concept:- This program show Anonymous inner class for abstract class.
 */

abstract class InnerClassTopicExample11_B{
	abstract void test();
}
public class InnerClassTopicExample12 {
	public static void main(String[] args) {
		InnerClassTopicExample11_B b1 = new InnerClassTopicExample11_B() {
			
			@Override
			void test() {
				System.out.println("test1");
			}
		};
		b1.test();
		System.out.println("Done");
	
	}
}
/*
Output:-

test1
Done

*/