package com.anurag.interfacepro;
/**
 *  * @author Anurag
 *    
 *    Concept:-  Developing class by using multiple interface.
 *    
 *    
 */

interface Interface3_first{
	void test1();
}

interface Interface3_second{
	void test2();
}

class Interface3_class implements Interface3_first,Interface3_second{
	
	// method visibility must be public
	public void test1(){
		System.out.println("test1()");
	}
	public void test2(){
		System.out.println("test2()");
	}
}
public class Interface3 {
		public static void main(String[] args) {
			Interface3_class ic = new Interface3_class();
			ic.test1();
			ic.test2();
			
		}
}
