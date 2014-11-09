package com.anurag.wrapperclass;
/**
 * @author Anurag
 *   
 *      Concept:- String to wrapper object by overloaded valueOf() method
 */
public class Wrapper5 {
	
	public static void main(String[] args) {
		
		Integer obj1 = Integer.valueOf("1111", 2);
		Integer obj2 =Integer.valueOf("13", 8);
		Integer obj3 =Integer.valueOf("1a", 16);
		Integer obj4 =Integer.valueOf("11", 10);
		
		System.out.println("obj1:- "+obj1);
		System.out.println("obj2:- "+obj2);
		System.out.println("obj3:- "+obj3);
		System.out.println("obj4:- "+obj4);
		
	}

}
