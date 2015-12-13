package com.anurag.object;

class Object13_A{
	int i=10;
}
class Object13_B{
	int i=10;
}
class Object13_C{
	int i=10;
}
public class Object13 extends Object {

	public static void main(String[] args) {
		System.out.println(new Object13_A().hashCode());
		System.out.println(new Object13_B().hashCode());
		System.out.println(new Object13_C().hashCode());
	}
}
