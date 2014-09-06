package com.anurag.constructor.iib;
/**
 * 
 * @author Anurag
 *
 */
public class Constructor18 {
	{
		System.out.println("IIB1");
	}
	
	Constructor18(){
		System.out.println("Constructor18()");
	}
	
	{
		System.out.println("IIB2");
	}
	
	Constructor18(int i){
		System.out.println("Constructor18(int )");
	}
	
	
	Constructor18(double d){
		System.out.println("Constructor18(double)");
	}
	
	public static void main(String[] args) {
		Constructor18 c1 = new Constructor18();
		System.out.println("=======================");
		Constructor18 c2 = new Constructor18();
		System.out.println("=======================");
		Constructor18 c3 = new Constructor18(1);
		System.out.println("=======================");
		Constructor18 c4 = new Constructor18(1);
		System.out.println("=======================");
		Constructor18 c5 = new Constructor18(10.9);
		System.out.println("=======================");
		Constructor18 c6 = new Constructor18(20.9);
		System.out.println("=======================");
	}
	
	
}


/*		output:-
		
		
		IIB1
		IIB2
		Constructor18()
		=======================
		IIB1
		IIB2
		Constructor18()
		=======================
		IIB1
		IIB2
		Constructor18(int )
		=======================
		IIB1
		IIB2
		Constructor18(int )
		=======================
		IIB1
		IIB2
		Constructor18(double)
		=======================
		IIB1
		IIB2
		Constructor18(double)
		=======================
*/