package com.anurg.innerclass;

/**
 * 
 * @author Anurag
 *		Concept:-Designing a class inside another class is called inner class.
 */
public class InnerClassTopicExample2 {

	class InnerClassTopicExample2_C {

	}

	static class InnerClassTopicExample2_D {

	}

	int i = 10;
	static int j = 20;

	void test1() {
		i = 10;
		j = 20;
		InnerClassTopicExample2_C obj1 = new InnerClassTopicExample2_C();
		InnerClassTopicExample2_D obj2 = new InnerClassTopicExample2_D();
		test2();
	}

	static void test2() {
		// i=10; non static member can not use directly in static block

		new InnerClassTopicExample2().i = 10;

		j = 20;

		// InnerClassTopicExample2_C obj1 = new InnerClassTopicExample2_C();
		// non static member can not use directly in static block

		InnerClassTopicExample2_C obj1 = new InnerClassTopicExample2().new InnerClassTopicExample2_C();
		InnerClassTopicExample2_D obj2 = new InnerClassTopicExample2_D();

		// test1(); non static member can not use directly in static block

		new InnerClassTopicExample2().test1();
	}

}
