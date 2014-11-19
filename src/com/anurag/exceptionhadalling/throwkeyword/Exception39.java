package com.anurag.exceptionhadalling.throwkeyword;
import java.util.Scanner;
class AgeIsNegativeException extends ArithmeticException
{
	public AgeIsNegativeException()
	{

	}
	public AgeIsNegativeException(String msg)
	{
		super(msg);
	}
}
public class Exception39 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter the value:");
		Scanner  sc = new Scanner(System.in);
		int age = sc.nextInt();
		if(age<=0)
			throw new AgeIsNegativeException("Age should not be negative");
		System.out.println("Hello World!");
	}
}
/*
Output:-

Enter the value:
-1
Exception in thread "main" com.anurag.exceptionhadalling.throwkeyword.AgeIsNegativeException: Age should not be negative
	at com.anurag.exceptionhadalling.throwkeyword.Exception39.main(Exception39.java:22)

*/