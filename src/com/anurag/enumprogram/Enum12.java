package com.anurag.enumprogram;

/**
 * @author Anurag
 * 
 *         Concept:- This program show Different constructor with member variable.
 *
 */
public class Enum12 {
	
	enum Enum12_Test{
		A,B(10),C("abc");
		int i;
		String s1;
		
		Enum12_Test(){
			
		}
		
		Enum12_Test(int i){
			this.i=i;
		}
		
		Enum12_Test(String s1){
			this.s1=s1;
		}
	}
	
	public static void main(String[] args) {
		Enum12_Test t =Enum12_Test.C;
		System.out.println(t.i);
		System.out.println(t.s1);
		
		System.out.println("===============");
		
		Enum12_Test t1 =Enum12_Test.A;
		System.out.println(t1.i);
		System.out.println(t1.s1);
		
		System.out.println("===============");
		
		
		Enum12_Test t2 =Enum12_Test.B;
		System.out.println(t2.i);
		System.out.println(t2.s1);
		
		System.out.println("===============");
	}
}
/*
	output:-
	
	0
	abc
	===============
	0
	null
	===============
	10
	null
	===============

*/