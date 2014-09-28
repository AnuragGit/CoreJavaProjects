package com.anurag.casting;
/**
 * @author Anurag
 *
 *Concept:-
 *
 *          When small data type is assign to large data type compiler will perform 
 *          auto upcasting by default.
 *          
 *          Here there is no chance of loss of data.
 * 
 */
public class AutoCasting1 {
       public static void main(String[] args) {
		int i=10;
		double d=i;  // Auto upcasting
		
		//=================================
		byte b=10;
		int i1=b;  // Auto upcasting
		
		float f =i1; // Auto upcasting
		
		double d1 =f;   // Auto upcasting
   		//===================================
		
		test(i);   // Auto upcasting for i
		
		byte b1=10;
		test1(b);
		
		//==================================
		
		int j=10;
		double dd =(double)i; // explicit keeping not require
		
		double d3 =(double)(float)(long)i; // explicit we can do any number of conversation.
	}
       
      static void test(double d){
    	  
      }
      
      static float test1(short s){
    	  return test2(s);
      }
      
      static long test2(int i){
    	  return i;
      }
}
