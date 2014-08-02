package com.anurag.sib;
/**
 * 
 * @author Anurag
 * 
 *    Concept:- static variable initialization  
 */
public class Sib8 {
	
	static int i=10;
	static int j;
	static{
		System.out.println(i);
		System.out.println(j);
		i=1;
		j=2;
	}
	
	public static void main(String[] args) {
		System.out.println("main begin");
		System.out.println(i);
		System.out.println(j);
		System.out.println("end main");
	}
	
}

/**
 *   Output:-
 *   
 *       	10
			0
			main begin
			1
			2
			end main
 */
