package com.anurag.interfacepro;

/**
 * @author Anurag
 *   
 *   Concept:-  extends and implements both  in single class
 */

interface Interface5_base{
	void test();
}
class NonInterface5_first{
	public void test(){
		System.out.println("test");
	}
}

class NonInterface5_second extends NonInterface5_first implements Interface5_base{
	
}
public class Interface5 {
     public static void main(String[] args) {
    	 NonInterface5_second nf = new NonInterface5_second();
    	 nf.test();
    	 System.out.println("Done");
	}
}
/*
Output:-

test
Done*/

