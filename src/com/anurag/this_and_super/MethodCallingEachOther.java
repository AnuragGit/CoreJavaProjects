package com.anurag.this_and_super;
/**
 * 
 * @author Anurag
 *  
 *  Concept:- This program compile time will be success but Runtime it will be give
 *  Exception in thread "main" java.lang.StackOverflowError 
 */
public class MethodCallingEachOther {
   void test1(){
	   test2();
   }
   void test2(){
	   test1();
   }
   
   public static void main(String[] args) {
	  MethodCallingEachOther mceo = new MethodCallingEachOther();
	  mceo.test1();
}
}
