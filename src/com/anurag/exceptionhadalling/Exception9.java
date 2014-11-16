package com.anurag.exceptionhadalling;
import java.io.*;
/**
 * @author Anurag
 *
 *   Concept:- This program show how and when FileNotFoundException will come.
 */
public class Exception9 
{
	public static void main(String[] args) 
	{
		try
		{   System.out.println(1);
			FileInputStream fish =new FileInputStream("Manager6.class");
		    System.out.println(2);
		}
		catch (FileNotFoundException ex)
		{
			System.out.println(ex);
			System.out.println(3);
		}

		System.out.println("Hello World!");
	}
}

/*Output:-

1
java.io.FileNotFoundException: Manager6.class (The system cannot find the file specified)
3
Hello World!
*/