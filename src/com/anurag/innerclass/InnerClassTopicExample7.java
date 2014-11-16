package com.anurag.innerclass;

/**
 * 
 * @author Anurag
 *      Concept:- This program show how to use local inner class.
 */
public class InnerClassTopicExample7 {
	
	   public static void main(String[] args) {
		class InnerClassTopicExample7_C{
			int i=10;
		}
		
		InnerClassTopicExample7_C obj = new InnerClassTopicExample7_C();
		System.out.println(obj.i);
		
	}
}
