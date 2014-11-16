package com.anurag.innerclass;

/**
 * @author Anurag
 *
 *           Concept:- This program show Anonymous inner class for interface
 */

interface InnerClassTopicExample13_C{
	void test();
}
public class InnerClassTopicExample13 {
	public static void main(String[] args) {
		InnerClassTopicExample13_C  obj = new InnerClassTopicExample13_C(){

			@Override
			public void test() {
				System.out.println("test");
				
			}
		
	};
	
	obj.test();
	System.out.println("Done");
		
	}
}

/*Output:-

test
Done
*/