package com.anurag.global.nonstaticvariable;
/**
 * 
 * @author Anurag
 *      Concept:- How to use one class to another class
 */
public class NonStatic14 {

	public static void main(String[] args) {
		NonStatic14_sub ns = new NonStatic14_sub();
		ns.i=10;
		System.out.println(ns.i);
	}
}

class NonStatic14_sub{
	int i;
}

/*
 *  Output: 10
 */
