package com.anurag.staticImport.pack2;

import static java.lang.System.out;

import static com.anurag.staticImport.pack1.StaticImport3.*;
import static com.anurag.staticImport.pack1.StaticImport4.j;
import static com.anurag.staticImport.pack1.StaticImport5.*;

/**
 * @author Anurag
 *
 *         Concept:- In case of static import we able to import the static
 *         member of class only. So we can use static member without using class
 *         name as a prefix.
 */
public class StaticImport8 {
	public static void main(String[] args) {
		out.println(i);
		out.println(j);
		out.println(CON1);
		test();

		// StaticImport8.test() ; will give compile time error because we
		// imported static member of class
		// not a class it self;
		System.out.println("Hello World!");
	}

}
/*	
	Output:-
	
	10
	20
	CON1
	I am form test
	Hello World!
*/


