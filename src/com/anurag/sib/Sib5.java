package com.anurag.sib;
/**
 * 
 * @author Anurag
 * 
 *   Concept:- 
 *   
 *     Whenever we are trying to use a class, class loader load the class. while loading 
 *     the class it is considering the static method and member but SIB is not loaded to 
 *     memory .It execute at time of initialization . It doesn't have identifier . So we can not called the SIB.
 *     It use By default under the initialization of class.
 *   
 */
public class Sib5 {
	static{
		System.out.println("SIB");
	}
}

/**
 *  output:-
 *  
 *    SIB
 *    Exception in therad, "Main java.lang.nosuchmethod found"
 */
