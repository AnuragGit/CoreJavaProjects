package com.anurag.wrapperclass;

/**
 * @author Anurag
 * 
 *   Concept:-  Converting String to primitive
 */
public class Wrapper8 {
	
	 
	public static void main(String[] args) {
			
		  String str="123";
		  String str1 ="123.23";
		  int i =Integer.parseInt(str);
		  double d1=Double.parseDouble(str1);
		  float f= Float.parseFloat(str1);
		  
		  System.out.println(str);
		  System.out.println(str1);
		  System.out.println(str1);

	}
	
}

/*
	Output:-
	
	123
	123.23
	123.23
*/