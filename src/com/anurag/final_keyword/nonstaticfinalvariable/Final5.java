package com.anurag.final_keyword.nonstaticfinalvariable;
/**
 * 
 * @author Anurag
 * 
 *    Concept:- Non static final variable can not survive with default value, we have to initialize
 *            explicit but only one place.
 *
 */
public class Final5 {
	final int i=10;
	void test(){
		//i=0;  This line will show the compile time error.
	}
}
