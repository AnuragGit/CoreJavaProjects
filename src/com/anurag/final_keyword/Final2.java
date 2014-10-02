package com.anurag.final_keyword;
/**
 * 
 * @author Anurag
 * 
 *    Concept:-  The final variable can not be initialize more than once.
 *    
 *          In this example array initialization is final not a member of array.
 */
public class Final2 {
	public static void main(String[] args) {
		final int x[]={10,20,30};
		System.out.println(x[0]);
		System.out.println(x[1]);
		System.out.println(x[2]);
		
		x[0]=100;
		x[1]=300;
		x[2]=500;
		
		System.out.println("======================");
		
		System.out.println(x[0]);
		System.out.println(x[1]);
		System.out.println(x[2]);
		
	//	x=new int[3];   error will be occur by this statement because we can not reinitialize. 
	}
}
