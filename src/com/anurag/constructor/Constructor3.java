package com.anurag.constructor;

/**
 * 
 * @author Anurag
 * 
 * Concept:- This class only contain main method . According to the
 *           contract every class have constructor but developer doesn't
 *           give any constructor so compiler will be keep no args(default constructor)
 *           So compiler kept only empty body constructor.  
 */
public class Constructor3 {
	public static void main(String[] args) {
			
		Constructor3 c1 = new Constructor3();
		System.out.println("===============");
		Constructor3 c2 = new Constructor3();
		System.out.println("================");
	}
}

/*		Output:-
		
		===============
		================
*/