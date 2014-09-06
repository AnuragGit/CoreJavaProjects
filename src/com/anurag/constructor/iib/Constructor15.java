package com.anurag.constructor.iib;
/**
 * @author Anurag
 *
 *        Concept:-
 *           Instance creation and object creation both are same. Once instance is created IIB is execute. We can 
 *           put any number of execution block inside the IIB.
 *           
 *           
 *           Every Object creation all non static member on heap side automatically  created in memory.On heap side
 *           automatically constructor start the execution and the first statement of constructor is IIB block . then 
 *           IIB block execute after this control transfer to Constructor again.
 *           
 *           Constructor come to stack during the calling.
 *           
 *           Compiler is keeping as a  first statement of this IIB in constructor body  if this() is not in first 
 *           statement.
 */
public class Constructor15 {
	
	Constructor15(){
		System.out.println("Constructor15()");
	}
	
	{
		System.out.println("IIB");
	}
	
	public static void main(String[] args) {
		Constructor15 c1 = new Constructor15();
		System.out.println("===================");
		Constructor15 c2 = new Constructor15();
		System.out.println("===================");
		Constructor15 c3 = new Constructor15();
		System.out.println("===================");
		
	}
	
}

/*
Output:-

IIB
Constructor15()
===================
IIB
Constructor15()
===================
IIB
Constructor15()
===================
*/