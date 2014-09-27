package com.anurag.interfacepro;
/**
 * 
 * @author Anurag
 *
 *   Concept:- Using extends and implements keyword at one time
 *   
 *            so extends will come first then after we can use implements.
 */

interface Interface4_first{
	void test1();
}
interface Interface4_second{
	void test2();
}
class NonInterface4_first{
	void test3(){
		System.out.println("test3");
	}
}

class NonInterface4_second extends NonInterface4_first implements Interface4_first,Interface4_second{
	
	public void test1(){
		System.out.println("test1");
	}
	
	public void test2(){
		System.out.println("test2");
	}
}
public class Interface4 {
	public static void main(String[] args) {
		NonInterface4_second nf =new NonInterface4_second();
	    nf.test1();
	    nf.test2();
	    nf.test3();
	    
	    System.out.println("Done");
	}
}

/*		Output:-
		
		test1
		test2
		test3
		Done
*/