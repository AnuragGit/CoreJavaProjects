package com.anurag.casting;
/**
 * * @author Anurag
 *
 */

class A{
	void check(){
		System.out.println("Check- A");
	}
}
class B extends A{
	void check(){
		System.out.println("Check- B");
	}
}
class C extends B{
	void check(){
		System.out.println("Check- C");
	}
}
class D extends C{
	void check(){
		System.out.println("Check- D");
	}
}

class E extends D{
	void check(){
		System.out.println("Check- E");
	}
}
public class DerivedDataType {
	
	
}
