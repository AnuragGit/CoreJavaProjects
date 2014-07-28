package com.anurag.initial;

/**
 * @author Anurag
 * 
 * Concept:-  (1) return statement must be in last statement in block ,method or any program.
 *            (2) return means just return the control
 *            (3) main method return type is void so we put only retrun and it is totally optionally.
 */
public class Basic19 {

	static void test(){
		System.out.println("test begin");
		if(true){
			return;
		}
		System.out.println("test end"); // not reachable statement.
	}
	
	public static void main(String[] args){
		System.out.println("main");
		test();
		return; //optionally 
	}
}

/**
 *  Output:-
 *     main
	   test begin

 */
