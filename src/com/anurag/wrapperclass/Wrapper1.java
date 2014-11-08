package com.anurag.wrapperclass;

/**
 * @author Anurag
 *   
 *   Concept:- This is program for Boxing and unboxing concept
 *   
 *      Convert primitive to Object is known as a boxing.
 *      Convert Object to primitive is known as unboxing.
 */
public class Wrapper1 {
	public static void main(String[] args) {
		 int i=10;
		 Integer obj = new Integer(i); //This is Boxing
		 //primitive content keeping inside the box is called boxing operation.
		 //primitive content storing inside a object is known as boxing.
		 System.out.println("Boxing :-"+obj); 
		 
		 int j=obj.intValue();
		 System.out.println("Unboxing:- "+j);
		 
		 Double d1 = new Double(10.9); //Boxing
		 double d2=d1.doubleValue(); //Unboxing
		 
		 
		 
		 
		 
	}
}
