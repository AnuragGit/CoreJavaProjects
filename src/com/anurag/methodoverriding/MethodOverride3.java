package com.anurag.methodoverriding;
/**
 * 
 * @author Anurag
 *  
 *  Concept:-  covariant Concept
 *  
 *            In case of override or implement we can choose either same direved data type or subclass
 *            derived datatype while overriding or implementation .
 *            
 *             Choosing a subclass derived data type is called co-variant concept.
 *             
 *             This covariant concept introduce in jdk1.5
 */

class MethodOverride3_U{
	
	MethodOverride3_U(){
		System.out.println("MethodOverride3_U()");
	}
}

class MethodOverride3_V extends MethodOverride3_U{
	MethodOverride3_V(){
		System.out.println("MethodOverride3_V()");
	}
}
class MethodOverride3_X{
	MethodOverride3_U test(){
		MethodOverride3_U mu = new MethodOverride3_U();
		return mu;
	}
}

class MethodOverride3_Y extends MethodOverride3_X{
	//  This is simple override concept
	  
	 /* MethodOverride3_U test(){
		
		System.out.println("Overirde test method");
		MethodOverride3_U mu = new MethodOverride3_U();
		return mu;
	 }*/
	
	// This is covariant Concept
	MethodOverride3_V test(){
		
		System.out.println("Overirde test() method by covariant concept");
		MethodOverride3_V mv = new MethodOverride3_V();
		return mv;
	}
	
	
}
public class MethodOverride3 {
	public static void main(String[] args) {
		MethodOverride3_Y my = new MethodOverride3_Y();
		my.test();
		System.out.println("Done");
	}
}

/*		Output:-
		Overirde test() method by covariant concept
		MethodOverride3_U()
		MethodOverride3_V()
		Done
*/