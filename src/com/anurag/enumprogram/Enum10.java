package com.anurag.enumprogram;
/**
 * @author Anurag
 *		
 * Concept:- 
 * 		
 * 		
 * 
 */

enum Enum10_En{
	CON,A(90),B("abc"),CON2(50.90);
	
	Enum10_En(){
		System.out.println("CON");
	}
	Enum10_En(int i){
		System.out.println("En(int)"+i);
	}
	
	Enum10_En(String s){
		System.out.println("En(Sting)"+s);
	}
	
	Enum10_En(double d){
		System.out.println("En(double)"+d);
	}
	
	
}
public class Enum10 {
		public static void main(String[] args) {
			Enum10_En e1 = Enum10_En.B;
			System.out.println(e1);
		}
		
		
}
/*
Output:-

CON
En(int)90
En(Sting)abc
En(double)50.9
B

*/