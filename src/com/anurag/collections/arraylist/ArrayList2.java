package com.anurag.collections.arraylist;
import java.util.ArrayList;
/**
 * @author Anurag
 *     Concept:- This Program shows Arraylist, to allow to 
 *               (1) add any type of value including null also.
 *               (2) allow to add duplicate value also.
 *               Inside ArrayList Class toString method got Override.
 *               Which ever Order we are adding element ,same order it is printing.
 *     
 *     
 *
 */
public class ArrayList2
{
	public static void main(String[] args) 
	{
		ArrayList list = new ArrayList();
		list.add("abc");
		list.add(null); //null also allow
		list.add(12);
		list.add('c');
		list.add(12.98);
		list.add(12.0);
		list.add("abc");//duplicate value are allow here
		list.add(null);
		list.add(true);
		list.add(null);
		System.out.println(list);
		System.out.println("Hello World!");
	}
}

/*Output:- [abc, null, 12, c, 12.98, 12.0, abc, null, true, null]
Hello World!
*/