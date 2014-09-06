package com.anurag.constructor;
/**
 * 
 * @author Anurag
 *  Concept:- 
 *  
 *          We are using constructor of integer argument but we didn't put
 *          any this type of constructor and complier is not responsible to keep 
 *          argument constructor , it will only responsible to keep default constructor
 *          with some conditions. So we will get compile time errors.
 *          
 *        
 */
public class Constructor4 {
	public static void main(String[] args) {
	//	Constructor4 c1 = new Constructor4(10);  compile time error
		System.out.println("===================");
	//	Constructor4 c2 = new Constructor4(10);  compile time error
		System.out.println("====================");
		
		
	}
}
