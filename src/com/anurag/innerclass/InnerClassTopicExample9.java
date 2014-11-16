package com.anurag.innerclass;

/**
 * @author Anurag
 *		
 *    Concept:- In local inner class we can not use local non final variable.
 */
public class InnerClassTopicExample9 {
	static int z=0;
	int y=90;
	public static void main(String[] args) {
		int i=0;
		final int j=10;
		class InnerClassTopicExample9_F{
			void test(){
				//System.out.println(i); we can not use local non final variable in side local inner class.
				System.out.println("j= "+j);
				System.out.println("z= "+z);
				System.out.println("y= "+new InnerClassTopicExample9().y);
			}
		}
		
		InnerClassTopicExample9_F obj = new InnerClassTopicExample9_F();
		obj.test();
		
		i=20;
		//j=30;  final variable , we can not initialize once again.
		z=30;
		new InnerClassTopicExample9().y=10;
		System.out.println("======================");
		obj.test();
		System.out.println("done");
	}
}

/* Output:-
	
	j= 10
	z= 0
	y= 90
	======================
	j= 10
	z= 30
	y= 90
	done
	
*/