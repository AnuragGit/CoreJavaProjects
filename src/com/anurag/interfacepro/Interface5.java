package com.anurag.interfacepro;

/**
 * @author Anurag
 *   
 *   Concept:-  extends and implements both  in single class
 */

interface Interface5_base{
	void test();
}
class NonInterface5_first{
	public void test(){
		System.out.println("test");
	}
}

class NonInterface5_second extends NonInterface5_first implements Interface5_base{
	
}
public class Interface5 {
     public static void main(String[] args) {
    	 NonInterface5_second nf = new NonInterface5_second();
    	 nf.test();
    	 System.out.println("Done");
	}
}
/*
Output:-

test
Done*/

/* Why do we have only public static final variables in interfaces?
An interface defines a protocol of behavior and not how you should be implemented. A class that implements an interface adheres to the protocol defined by that interface.

All fields declared within an interface are implicity public, static, and final. Why?

Any implementations can change value of fields if they are not defined as final. Then they would become a part of the implementation.An interface is a pure specification without any implementation.
If they are static, then they belong to the interface, and not the object, nor the run-time type of the object.
An interface provide a way for the client to interact with the object. If variables were not public, the clients would not have access to them.
In general, a field declaration may include the following modifiers: public, protected, private, final, static, transient, volatile. But only public, final, and static are permitted for interface's variable.

Every field declaration in the body of an interface is implicitly public, static, and final. It is permitted to redundantly specify any or all of these modifiers for such fields. Every field in the body of an interface must have an initialization expression, which need not be a constant expression. The variable initializer is evaluated and the assignment performed exactly once, when the interface is initialized.

*/