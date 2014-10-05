package com.anurg.innerclass;
/**
 * 
 * @author Anurag
 *		
 *    Concept:- Local member can not be declare with static and access modifier but it can be final.
 *              And local inner class can not be declare as static.
 *              And access level also not allow in local inner class.
 *              And we can make local class to final.
 *              
 */
public class InnerClassTopicExample8 {
	public static void main(String[] args) {
		//static int i=0;  // we can not declare static member inside the local block.
		//public int i=0;   // we can not declare any access modifier in side local block.
		final int i=0;   //local member can be declare as final.
		
		
		//============================
		
		/*  local class can not be static
		static class E{
			
		}*/
		
		/*  local class can not declare with access specifiers
		protected class E{
			
		}*/
		
		// local class allow final  non access modifier
		final  class E{
			
		}
		
	}
}
