package com.anurag.final_keyword.nonstaticfinalvariable;

/**
 * @author Anurag
 *
 *   Concept:-
 *   
 *      NonStatic final variable can not survive with default value. We have to initialize the explicit in 
		some of the following specific places.

        1. At the declaration statement
        
        2. In the all Constructor
        
        3.In side the Only one IIB
        
   So among of these three we need to choose only one option.

 */
public class Final9 {
	final int i;
	final int z;
	public Final9() {
		i=10;
		//z=10  only one place require
	}
	
	Final9(int i){
		this.i=90;
	}
	
	Final9(double d){
		i=89;
	}
	{
		z=70;
	}
	{
		//i=60; only one place require
	}
	
	public static void main(String[] args) {
		
		System.out.println("i= "+new Final9().i);
		System.out.println("i= "+new Final9(8).i);
		System.out.println(new Final9().z);
	}
}

/*		Output:-
		
		i= 10
		i= 90
		70*/


