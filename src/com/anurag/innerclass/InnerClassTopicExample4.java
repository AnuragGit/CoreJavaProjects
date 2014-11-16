package com.anurag.innerclass;
/**
 * 
 * @author Anurag
 *		
 *		Concept:- Inside the non static inner class we can not declare & define static member.
 *                Inside the static inner class we can able to declare static and non static member also.
 */
public class InnerClassTopicExample4 {

	class InnerClassTopicExample4_A{
		int i;
	//	static int j;  non static class we can not declare static variable
		void  test1(){
			
		}
		/*  in side non static inner class we can not declare static method
		static void test2(){
			
		}*/
	}
	
	static class InnerClassTopicExample4_B{
		int m;
		static int j;
		void test3(){
			
		}
		static void test4(){
			
		}
	}
}
