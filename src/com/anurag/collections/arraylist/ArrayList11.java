package com.anurag.collections.arraylist;
//
//contains(element) is a method 
//that return true if element is available in side the array list.
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Anurag
 *        Concept:-This program is showing 
 *                  How to avoid the duplicate insertion in side the arraylist
 *                  
 *                  (1) By the help of contains() method we can check if element
 *                      is available or not in list.
 *                  (2) If element is available on list then contains method will return
 *                       true .
 *                  (3) If element is not present then contain method will return false. 
 */
public class ArrayList11 
{
	public static void main(String[] args) 
	{
		ArrayList list = new ArrayList();
		Scanner sc = new Scanner(System.in);
		String decider;
		do
		{
			System.out.println("Enter the somethings:");
			Object element= sc.next();
			if(!list.contains(element))
			{
				list.add(element);
			}
			System.out.println("add one more (y/n)");
			decider=sc.next();
		}
		while ("y".equals(decider));
		System.out.println(list);
		System.out.println("Hello World!");
	}
}
/*
Output:-

Enter the somethings:
a1
add one more (y/n)
y
Enter the somethings:
a2
add one more (y/n)
y

Enter the somethings:
a1
add one more (y/n)
y
Enter the somethings:
a2
add one more (y/n)
n
[a1, a2]
Hello World!
*/
