package com.anurag.interfacepro;

/**
 * 
 * @author Anurag
 *
 *  Concept:- We need to implement interface in particular class and the method that we are
 *  going to implement , visibility must be public.
 *  
 */

interface Interface2_M{
	void test1();
	void test2();
}
class Interface2_M_impl implements Interface2_M{
	public void test1(){
		System.out.println("test1");
	}
	
	public void test2(){
		System.out.println("test2");
	}
}
public class Interface2 {
      public static void main(String[] args) {
    	  Interface2_M_impl i1 = new Interface2_M_impl();
    	  
    	  i1.test1();
    	  i1.test2();
    	  System.out.println("Done");
	}
}

/*		Output:-
		
		test1
		test2
		Done
*/