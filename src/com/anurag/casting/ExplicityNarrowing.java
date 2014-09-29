package com.anurag.casting;

/**
 * @author Anurag
 *   
 *   Concept:-
 *   
 *     When we are converting large data type to small data type we need to do explicit casting.
 *     
 *     Here there is chance of loss of data.
 */
public class ExplicityNarrowing {
	public static void main(String[] args) {
		 double d1 =30.9;
		 int i=(int) d1;  // We are doing explicit casting
		 
		 System.out.println(i);
		 //=======================
		 test((float) d1); // We are doing explicit casting
		 
		 //=======================
		 
		 double dd1 = 30.09;
		 int i1=(byte)d1;
		 short s1=(byte)i;
		 long ls=(int)d1;
		 
		 //=======================
		 
		 double d3=90.90;
		 int i3=(short)(byte)(float)(int)d1;
	}
	
	static void test(float f1){
		
	}

}
/*
Output:--

        30
*/