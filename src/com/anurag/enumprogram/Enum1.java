package com.anurag.enumprogram;
/**
 * 
 * @author Anurag
 *	
 *		Concept:- all enum constant are by default public, static,final
 */

enum Enum1_Day{
	MON,TUES,WED,THRS,FRI,SAT,SUN;
}
public class Enum1 {
	public static void main(String[] args) {
		
		Enum1_Day  d1 =Enum1_Day.FRI;
		System.out.println(d1);
	}
}
/*
Output:-

FRI
*/