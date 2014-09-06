package com.anurag.constructor.use_this;

public class Constructor14 {
	Constructor14(){
		System.out.println("Constructor14()");
	}
	
	Constructor14(int i){
		this();
		System.out.println("Constructor14(int)");
	}
	
	Constructor14(int i,int j){
		this(10);
		System.out.println("Constructor14(int ,int )");
	}
	
	public static void main(String[] args) {
		Constructor14 c1 =new Constructor14();
		System.out.println("==================");
		Constructor14 c2 =new Constructor14();
		System.out.println("==================");
		Constructor14 c3 =new Constructor14(20);
		System.out.println("==================");
		Constructor14 c4 =new Constructor14(30);
		System.out.println("==================");
		Constructor14 c5 =new Constructor14(1,2);
		System.out.println("==================");
		Constructor14 c6 =new Constructor14(100,45);
		System.out.println("==================");
	}
}

/*
Output:-


Constructor14()
==================
Constructor14()
==================
Constructor14()
Constructor14(int)
==================
Constructor14()
Constructor14(int)
==================
Constructor14()
Constructor14(int)
Constructor14(int ,int )
==================
Constructor14()
Constructor14(int)
Constructor14(int ,int )
==================

*/