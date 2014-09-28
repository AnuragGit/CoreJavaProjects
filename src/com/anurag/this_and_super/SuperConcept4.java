package com.anurag.this_and_super;
/**
 * @author Anurag
 *
 *    Concept:-
 *       
 *       this and super keyword both can not be used static definition block It is only used in nonstatic
 *       definition block.
 *           
 *         
 */
public class SuperConcept4 {

	 int i;
	 
	 static{
		 
		// we can not use this inside the static block , compiler by default using this. 
		// i=10;
	 }
	 
	 void test1(){
		 
	 }
	 static void test2(){
		// we can not use this inside the static block
		// this.test1();
	 }
	 public static void main(String[] args) {
		// we can not use this inside the static block
		 //System.out.println(this.i); 
	}
	 
}
