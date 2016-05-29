package com.anurag.collections.arraylist;
//
//
import java.util.ArrayList;
/**
 * @author Anurag
 *        Concept:-This program is showing Replace the value of existing 
 *                 one to another new .
 *                  
 *                  by using set() method  that will replace the existing value
 *                  with new value by specifying  index value with new value on set
 *                  method.
 */
public class ArrayList10 
{
	public static void main(String[] args) 
	{
		ArrayList list = new ArrayList();
		list.add("hello");
		list.add("how");
		list.add("are");
		list.add("you");
		System.out.println(list);
		for(Object obj :list)
		System.out.print(obj+" ");
		list.set(0,"Hello");
		list.set(1,"I");
		list.set(2,"am");
		list.set(3,"fine");
		System.out.println("\n");
		System.out.println(list);
		for(Object obj:list)
			System.out.print(obj+" ");
	}
}


/*
Output:-

[hello, how, are, you]
hello how are you 

[Hello, I, am, fine]
Hello I am fine 

*/

