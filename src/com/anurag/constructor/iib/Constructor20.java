package com.anurag.constructor.iib;
/**
 * 
 * @author Anurag
 *		
 *         Concept:-
 *         
 *         Same constructor block will not execute more than once for one object . Similar 
 *         IIB is only one time execute for one object.
 *         When first statement is this() so multiple constructor is involving the creation of object.So in 
 *         this case compiler will not keep the IIB calling statement.
 */
public class Constructor20 {

	Constructor20(){
		System.out.println("Constructor20()");
	}
	
	{
		System.out.println("IIB1");
	}
	
	Constructor20(int i){
		this();
		System.out.println("Constructor20(int i)");
	}
	
	public static void main(String[] args) {
		
		Constructor20 c1 = new Constructor20();
		System.out.println("=======================");
		Constructor20 c2 = new Constructor20(10);
		System.out.println("=======================");
		Constructor20 c3 = new Constructor20();
		System.out.println("=======================");
		Constructor20 c4 = new Constructor20(25);
		System.out.println("=======================");
		
	}
}


/*	Output:-
	
	
	IIB1
	Constructor20()
	=======================
	IIB1
	Constructor20()
	Constructor20(int i)
	=======================
	IIB1
	Constructor20()
	=======================
	IIB1
	Constructor20()
	Constructor20(int i)
	=======================
	
*/