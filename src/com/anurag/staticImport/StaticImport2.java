package com.anurag.staticImport;

import static java.lang.System.exit;
import static java.lang.System.out;
/**
 * @author Anurag
 *   
 *       Concept:-Here we imported two static member of system class.
 *                And because of exit(0) , program is terminated forcibly  
 *                exit() is a static method inside System class.
 *                
 *                
 *                if you want to import all static member inside a class you can use wild card
 *                like if System class all static member import syntax is :
 *                
 *                import static java.lang.System.*;
 */
public class StaticImport2 {
	public static void main(String[] args) {
		out.println("begin");
		exit(0);
		System.out.println("Hello World!");
	}
}
/*
Output:-

 begin
*/