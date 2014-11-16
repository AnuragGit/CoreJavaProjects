package com.anurag.innerclass;
/**
 * 
 * @author Anurag
 *
 *          Concept:-
 *          
 *               1) In side static we can not use non static member without reference variable.
 *               2) Static member can be use any where.
 */
public class InnerClassTopicExample1 {
	int i;
	static int j;
	void test1(){
		i=10;
		j=20;
		test1();
		test2();
	}
	
	static void test2(){
		//i=30;          non static member can not use directly in static block
		j=40;
		//test1();       non static member can not use directly in static block
		test2()	;
	}
}
