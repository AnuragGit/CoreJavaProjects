package com.anurag.methodoverriding;
/**
 * 
 * @author Anurag
 *  
 *  Concetp:-
 *       
 *          While overriding  a method  you can use in subclass wider level of access specifier.
 *          
 *          superclass - Default
 *          subclass - Protected or Public 
 *          
 *          superclass - public
 *          subclass -   Public 
 *          
 *          superclass -protected
 *          subclass -  Protected or Public 
 *          
 *          superclass - private
 *          subclass -   any access specifier
 *          
 *          
 */

class MethodOverride4_base{
	void test1(){
		System.out.println("test1()");
	}
	
	public void test2(){
		System.out.println("test2()");
	}
	
	protected void test3(){
		System.out.println("test3()");
	}
	
	private void test4(){
		System.out.println("test4()");
	}
}

class MethodOverride4_main extends MethodOverride4_base{
	
	// Access level can be protected or public or default by default
	protected void test1(){
		System.out.println("Overloaded test1()");
	}
	
	//Access level only public
	public void test2(){
		System.out.println("Overloaded test2()");
	}
	//Access level can be protected or public
	protected void test3(){
		System.out.println("Overloaded test3()");
	}
	
	//Any access specifier
	void test4(){
		System.out.println("Overloaded test4()");
	}
}
public class MethodOverride4 {
	public static void main(String[] args) {
		MethodOverride4_main  mm = new MethodOverride4_main();
		mm.test1();
		mm.test2();
		mm.test3();
		mm.test4();
		System.out.println("Done");
		
		
	}
}

/*		Output:-
		
		Overloaded test1()
		Overloaded test2()
		Overloaded test3()
		Overloaded test4()
		Done
		
*/
