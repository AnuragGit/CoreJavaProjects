package com.anurag.wrapperclass;

/**
 * @author Anurag
 *
 *         Concept:-
 */
public class Wrapper16 {

	static void test(int i) {
		System.out.println("int");
	}

	static void test(byte i) {
		System.out.println("byte");
	}

	static void test(long i) {
		System.out.println("long");
	}

	static void test(short i) {
		System.out.println("short");
	}

	static void test(Byte i) {
		System.out.println("Byte obj");
	}

	static void test(Integer i) {
		System.out.println("Integer");
	}

	static void test(Object i) {
		System.out.println("object");
	}

	static void test(Number i) {
		System.out.println("number");
	}

	static void test(Double i) {
		System.out.println("Double");
	}

	static void test(byte... agrs) {
		System.out.println("varargs");
	}

	public static void main(String[] args) {
		byte b = (byte) 127;
		System.out.println(b);
		test(b);
		System.out.println("Hello World!");
	}
}


	/*	Output:-
		
		127
		byte
		Hello World!
		
		*/