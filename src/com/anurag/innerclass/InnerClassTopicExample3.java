package com.anurag.innerclass;

/**
 * 
 * @author Anurag
 * 
 *  Concept:-  This example show how to use non static inner class inside the static block.
 */
public class InnerClassTopicExample3 {

	class InnerClassTopicExample3_InstanceInner {
		void test() {
			System.out.println("test of InnerClassTopicExample3_InstanceInner");
		}
	}

	static class InnerClassTopicExample3_StaticInner {
		void test() {
			System.out.println("test of InnerClassTopicExample3_StaticInner");
		}
	}

	public static void main(String[] args) {
		InnerClassTopicExample3_StaticInner obj1 = new InnerClassTopicExample3_StaticInner();
		obj1.test();
		System.out.println("==========================");
		InnerClassTopicExample3_InstanceInner obj2 = new InnerClassTopicExample3().new InnerClassTopicExample3_InstanceInner();
		obj2.test();

	}
}

/*
	Output:-
	
	test of InnerClassTopicExample3_StaticInner
	==========================
	test of InnerClassTopicExample3_InstanceInner

*/