package com.anurag.initial;

/**
 * @author Anurag
 *	Concept: return statement example with unary operator .
 */
public class Basic23 {

	 static  int test1(int i){
		 return i++;
	 }
	 
	 static int test2(int i){
		 return ++i;
	 }
	 
	 public static void main(String[] args) {
		
		 int i=0;
		 
		 i= i++ + test1(i++) +i++ +test2(i++) + ++i  + test1(++i) + ++i + test2(++i)  +i;
		 
		 // 0   +1           + 2   + 4        + 5    + 6          + 7    +9  + 8 
		 
		 System.out.println(i);
	}
}

/**
 *  Output:-
 *         42
 */
