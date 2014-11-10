package com.anurag.wrapperclass;

/**
 * @author Anurag
 *    
 *      Concept:-  This program show AutoBoxing and AutoUnBoxing ..
 *
 */
public class Wrapper14 {
	
	public static void main(String[] args) {
		
		int i=test1();  //AutoBoxing
		
		Integer obj= test2();
		
		test3(i);
		
		test4(obj);
		
		
		Boolean b1 =false;   // AutoBoxing
		boolean b2 =new Boolean(true);   // AutoUnboxing
		
		if(b1){
			      /*
			       *    If block require boolean primitive variable . Here compiler automatic
			       *    convert derived  to primitive. Here Unboxing is happening. 
			       */
		}
		
		if(b2){
			
		}
	}
	
	static Integer test1(){
		return new Integer(90);
	}
	
	static int test2(){
		return 90;
	}
	
	static void test3(Integer obj){  // AutoBoxing 
		
	}
	
	static void test4(int i){  //Auto unboxing
		
	}

}
