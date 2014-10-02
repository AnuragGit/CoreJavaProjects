package com.anurag.final_keyword.method;

/**
 * @author Anurag
 * 
 *      Concept:- In order to restrict the overriding a method we can declare method as final.
 *               only non final method can be override , we can not override final variable.
 *
 */
class Final13_E{
	final void test1(){
		System.out.println("Final13_E test1");
	}
	void test2(){
		System.out.println(" Final13_E test2");
	}
}

class Final13_F extends Final13_E{
	/* void test1(){   // final method can not be override
		System.out.println("Final13_F test1");
	}*/
	void test2(){
		System.out.println("Final13_F test2");
	}
	
	/*Final13 test1(){   // (1) First compiler will check override concept ,here code is failing on override concept itself.
					     // (2) If first condition is ok then it will check method is declare final on superclass if it is
					      *     then still override concept is not satisfy.
		System.out.println("Final13_F test1");
		return new Final13();
	}*/
}
public class Final13 {
	
}
