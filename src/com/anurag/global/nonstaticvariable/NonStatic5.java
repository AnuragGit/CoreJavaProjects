package com.anurag.global.nonstaticvariable;
/**
 * 
 * @author Anurag
 *  Concept:- Non static method can not be used inside static content 
 *             directly. 
 */
public class NonStatic5 {
		void test(){
			System.out.println("Hello word");
		}
		
		static{
		//	test();  We can not call directly
		}
}
