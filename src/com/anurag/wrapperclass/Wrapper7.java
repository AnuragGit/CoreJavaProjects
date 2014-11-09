package com.anurag.wrapperclass;

/**
 * @author Anurag
 *
 *    Concept:-Converting Primitive value to string
 */
public class Wrapper7 {
	
	public static void main(String[] args) {
		
		   int i=20;
		   String str =Integer.toString(i);
		   String str1=String.valueOf(i);
		   String str2=""+i;
		   
		   System.out.println(str);
		   System.out.println(str1);
		   System.out.println(str2);
		   
		   
	}

}
/*		
		Output:-
		
		20
		20
		20
*/