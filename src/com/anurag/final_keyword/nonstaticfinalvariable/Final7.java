package com.anurag.final_keyword.nonstaticfinalvariable;

/**
 * 
 * @author Anurag
 *
 *    Concept:- non static final global variable should be initialize either one of the initialization
 *               block. but not in multiple. 
 */
public class Final7 {
	final int i;
	final int j=20;
	final int z;
	Final7(){
		i=10;
		
	}
	{
		z=30;
	}
	
	public static void main(String[] args) {
		
		System.out.println(new Final7().i);
		System.out.println(new Final7().j);
		System.out.println(new Final7().z);
	}
}
/*
	Output:-
	
	10
	20
	30
*/