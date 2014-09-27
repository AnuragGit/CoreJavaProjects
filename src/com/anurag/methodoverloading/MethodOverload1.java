package com.anurag.methodoverloading;
/**
 * @author Anurag
 *   
 *   Concept:-  Method Overloading means:-
 *            1) All method have same name with unique signature means method argument must
 *               be different .
 *            2) All method have same or different return type.
 *            3) All method have same or different Access level.
 *            4) No matter static or non static
 *             
 */
public interface MethodOverload1 {
	 void test();
	 void test(int i);
	 void test(double d);
	 boolean test(int i ,int j);
	 
	 //method name, list of argument and order of argument
}
