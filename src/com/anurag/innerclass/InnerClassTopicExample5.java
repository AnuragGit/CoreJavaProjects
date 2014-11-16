package com.anurag.innerclass;

/**
 * @author Anurag
 * 
 * Concept:-This program is describing the static inner class and non static inner class difference.
 *
 */
public class InnerClassTopicExample5 {
	int i;
	static int j;
	void test1(){
		
	}
	static void test2(){
		
	}
	
	class InnerClassTopicExample5_A{
		int k;
		//static int l;       static member can not be declare in nonstatic class.
		void test3(){
			i=1;
			j=2;
			test1();
			test2();
			k=1;
			//l=2;
			InnerClassTopicExample5_B b1 = new InnerClassTopicExample5_B();
		}
		//static member can not be declare in nonstatic class.
		/*static void test4(){
			i=1;
			j=2;
			test1();
			test2();
			test3();
			test4()
			k=1;
			//l=2;
			InnerClassTopicExample5_B b2 = new InnerClassTopicExample5_B();
		}*/
		}
	
	static class InnerClassTopicExample5_B{
		int p;
		static int q;
		void test5(){
			//i=1; outer non static member can not be access without references.
			j=2;
			//test1(); outer non static member can not be access  without references.
			test2();			
			test5();
			test6();
			p=2;
			q=3;
			//InnerClassTopicExample5_A a1 = new InnerClassTopicExample5_A(); 
			//outer non static member can not be access  without references.
			
		}
		
		static void test6(){
			//i=1; outer non static member can not be access  without references.
			j=2;
			//test1(); outer non static member can not be access  without references.
			test2();
			//test5(); outer non static member can not be access  without references.
			//p=2; outer non static member can not be access  without references.
			q=3;
			//InnerClassTopicExample5_A a1 = new InnerClassTopicExample5_A(); 
			//outer non static member can not be access  without references.
		}
	}
	}

