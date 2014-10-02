package com.anurag.final_keyword.nonstaticfinalvariable;
/**
 * 
 * @author Anurag
 *
 *  Concept:- So Every final variable has to be initialize by developer.
 */
public class Final8 {
	final int i;
	
	Final8(int i){
		this.i=10;
		
		i=10;// this won't work because this is local variable of parameterized constructor,so
		     // we have to use this.i for initialize final variable i.
	}
	Final8(){
		i=20;
	}
	
	public static void main(String[] args) {
		System.out.println(new Final8().i);
		System.out.println(new Final8(50).i);
	}
}
/*
Output:-

20
10

*/