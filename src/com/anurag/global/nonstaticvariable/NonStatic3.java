package com.anurag.global.nonstaticvariable;
/**
 * @author Anurag
 *  Concept:- Non static member can not use directly inside static block.
 *            And we can not be use by class name also.
 */
public class NonStatic3 {
	int i;
	void test(){
		System.out.println("done");
	}
	public static void main(String[] args) {
		// i=10; We can not call directly
		// test(); We can not call directly
	}
}
