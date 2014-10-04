package com.anurag.staticImport.pack2;

import static java.lang.System.out;
import com.anurag.staticImport.pack1.StaticImport3;
import com.anurag.staticImport.pack1.StaticImport4;
import com.anurag.staticImport.pack1.StaticImport5;
/**
 * @author Anurag
 * 
 *       Concept:- Simple import of classes of pack1 package .
 *
 */
public class StaticImport7 {
	
	public static void main(String[] args) {
		out.println(StaticImport3.i);
		out.println(StaticImport4.j);
		out.println(StaticImport5.CON1);
		System.out.println("Hello World!");
	}
}
/*		
		Output:-
		10
		20
		CON1
		Hello World!
*/