package com.anurag.constructor.iib;
/**
 * 
 * @author Anurag
 * 
 *            Concept:-
 *            
 *            Instance initializers are a useful alternative to instance variable initializers whenever:

			 initializer code must catch exceptions, or

			perform fancy calculations that can't be expressed with 
			an instance variable initializer. You could, of course, always write
		     such code in constructors.

             But in a class that had multiple constructors, you would have to repeat the code in
             each constructor. With an instance initializer, you can just write the code once,
             and it will be executed no matter what constructor is used to create the object.
             Instance initializers are also useful in anonymous inner classes, which can't 
             declare any constructors at all.
 *
 */
public class Constructor22 {

	
	Constructor22(){
		System.out.println("Constructor22()");
	}
	
	Constructor22(int i){
		System.out.println("Constructor22(int)");
	}
	
	{
		System.out.println("IIB");
	}
	
	static{
		System.out.println("SIB");
	}
	
	static void test(){
		System.out.println("test()");
	}
	
	public static void main(String[] args) {
		test();
		System.out.println("==================");
		Constructor22 c1 = new Constructor22();
		System.out.println("==================");
		Constructor22 c2 = new Constructor22(10);
		
	}
}


/*		Output:-
		
		
		SIB
		test()
		==================
		IIB
		Constructor22()
		==================
		IIB
		Constructor22(int)*/
