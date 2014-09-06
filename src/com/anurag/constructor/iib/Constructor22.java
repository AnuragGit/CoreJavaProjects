package com.anurag.constructor.iib;
/**
 * 
 * @author Anurag
 *
 */
public class Constructor22 {

	
	Constructor22(){
		System.out.println("Constructor22()");
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
		Constructor22 c2 = new Constructor22();
		
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
		Constructor22()*/
