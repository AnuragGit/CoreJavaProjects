package com.anurg.innerclass;

/**
 * @author Anurag
 * 
 *    concept:- Anonymous inner class concept
 *
 */
class InnerClassTopicExample10_G{
	void test1(){
		System.out.println("InnerClassTopicExample10_G test1");
	}
	void test2(){
		System.out.println("InnerClassTopicExample10_G test2");
	}
}


class InnerClassTopicExample10_H extends InnerClassTopicExample10_G{
	void test1(){
		System.out.println("InnerClassTopicExample10_H test1");
	}
	
}


class InnerClassTopicExample10_I extends InnerClassTopicExample10_G{
	void test2(){
		System.out.println("InnerClassTopicExample10_I test2");
	}
	
}


class InnerClassTopicExample10_J extends InnerClassTopicExample10_G{
	void test1(){
		System.out.println("InnerClassTopicExample10_J test1");
	}
	void test2(){
		System.out.println("InnerClassTopicExample10_J test2");
	}
	
}
public class InnerClassTopicExample10 {
	public static void main(String[] args) {
		InnerClassTopicExample10_G g1 = new InnerClassTopicExample10_G(){ // this is anonymous inner class
			void test1(){
				System.out.println("AIC -test1");
				
			}
		};
		g1.test1();
		g1.test2();
		System.out.println("Done");
	}
}



/*	Output:-
	
	AIC -test1
	InnerClassTopicExample10_G test2
	Done*/