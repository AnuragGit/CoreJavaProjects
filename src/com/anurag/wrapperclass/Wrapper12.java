package com.anurag.wrapperclass;

/**
 * @author Anurag
 *   
 *     Concept:-  int compareTo(WrapperType obj)
 *     
 *        This program for explaining compareTo method
 *        
 *          it return 1 if left side value is greater than right side
 *          it return -1 if left side value is less than right side.
 *          
 *          it return 0 if both value are same.
 *          
 *        
 *        
 */
public class Wrapper12 {

		 public static void main(String[] args) {
			
			   Integer i1 = new Integer(11);
			   Integer i2 = new Integer(10);
			   
			   int value =i2.compareTo(i1);
			   int value1 =i1.compareTo(i2);
			   int value2 =i1.compareTo(11);
			   
			   System.out.println(value);
			   System.out.println(value1);
			   System.out.println(value2);
		}
}
/*

	Output:-
	
	-1
	1
	0

*/