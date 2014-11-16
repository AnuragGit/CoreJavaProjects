package com.anurag.exceptionhadalling;

import java.util.Scanner;

/**
 * @author Anurag
 * 
 *         Concept:- This program show one try can have multiple catch but under
 *         some rule:-
 * 
 *         1) In between one catch to another catch we should not keep any
 *         statement. 2) While keeping multiple catch we should not use
 *         duplicate catch . 3) one try can have any number of unique catches.
 *         4) Superclass of any Exception class can not come first if related
 *         subclass is using on catch block.
 */
public class Exception14 {
	public static void main(String[] args) {
		System.out.println(1);
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println(2);
			System.out.println("Enter the somethings");
			String s1 = sc.next();
			System.out.println(3);
			int i = Integer.parseInt(s1);
			System.out.println(4);
			int j = i / (i - 9);
			System.out.println(5);
		} /*
		 * catch (Exception ex) { //This catch will give error because downside
		 * catch is a subclass of this Exception class so this is voilating the
		 * rue of catch , no superclass can come first if subclass is using
		 * below. System.out.println(7); System.out.println(ex); }
		 */

		catch (NumberFormatException ex) {
			System.out.println(6);
			System.out.println(ex);
		} catch (ArithmeticException ex) {
			System.out.println(7);
			System.out.println(ex);
		}

		System.out.println(8);
		System.out.println("Hello World!");
	}

}
/*
 * Output:-
 * 
 * 1. For entering stirng value:
 * 
 * 1 2 Enter the somethings dfdj 3 6 java.lang.NumberFormatException: For input
 * string: "dfdj" 8 Hello World!
 * 
 * 2. For entring numeric integer 9
 * 
 * 1 2 Enter the somethings 9 3 4 7 java.lang.ArithmeticException: / by zero 8
 * Hello World!
 * 
 * 3. For entering numeric integer other than 9
 * 
 * 1 2 Enter the somethings 15 3 4 5 8 Hello World!
 */