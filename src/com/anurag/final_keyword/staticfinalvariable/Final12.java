package com.anurag.final_keyword.staticfinalvariable;

/**
 * @author Anurag
 *  
 *      Concept:- 
 *      
 *     static final variable also not survive  with default value.Developer has to be provide
       explicit value in either of one options
       
       1. In place of declaration 
        
                or
       2. In one SIB

 */
public class Final12 {
		static final int i;
		static final int j=20;
		static{
			i=10;
			//j=20;  
		}
		
		static{
			//i=20;  initialize static final variable only once.
		}
		
		public static void main(String[] args) {
			System.out.println(i);
			System.out.println(j);
		}
}

/*	
	Output:-
	10
	20
*/