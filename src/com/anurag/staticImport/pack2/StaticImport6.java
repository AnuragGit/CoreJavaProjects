package com.anurag.staticImport.pack2;

import static java.lang.System.out;
/**
 * @author Anurag
 *		Concept:-  Providing complete package details of pack1 classes
 */
public class StaticImport6 {

	public static void main(String[] args) {
		out.println(com.anurag.staticImport.pack1.StaticImport3.i);
		out.println(com.anurag.staticImport.pack1.StaticImport4.j);
		out.println(com.anurag.staticImport.pack1.StaticImport5.CON1);
		System.out.println("Hello World!");
	}
}


/*		Output:-
		
		10
		20
		CON1
		Hello World!
*/
