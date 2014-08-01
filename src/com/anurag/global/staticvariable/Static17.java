package com.anurag.global.staticvariable;
/**
 * 
 * @author Anurag
 *  Concept:-
 *  
 *     Global variable can be called as attribute ,field or properties .
 *     Here i,j,k all three are global variable inside a class Static17
 *     
 *      First java command say to load the class . Then class loader will 
 *      load class to memory when class loading to memory all attribute loading with 
 *      the default value. Only static member & method loading in the memory , while loading
 *       static variable get default value.
 *       
 *         Once loading operation is got over then initializer process do fro top to bottom. 
 *         
 *         After this class is eligible to use.
 */
public class Static17 {
	
	 static int i =10;
	 static int j;
	 
	 static int k=test();
	 static int test(){
		 System.out.println("test");
		 return i+j;
	 }
	 
	 public static void main(String[] args) {
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
	 }

}


/**
 * OUtput:- 
 * 
 *         test
 *         10
 *         0
 *         10
 */
 

