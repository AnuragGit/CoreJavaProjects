package com.anurag.collections.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author Anurag
 *    Concept:- 
 *             iterator is a interface.
 *             
 *             we use this iterator to fetch the element of collection(List,Set..) whose
 *             extending the collection interface.
 *             
 *             Returns an iterator over the elements in this list in proper sequence.
 *             
 *      Rule:- 
 *      
 *             Iterator is a  Fail-Fast
 *             Once we get the iterator object form collection like (list,set ,Queue) 
 *             then we can not perform any operation on collection, Otherwise, we will 
 *             get concurrent modification exception. 
 *             
 *              So rule is we have to iterate the all object first , then only we can able 
 *              to perform any operation on collection.
 *              
 *              thats why iterator is fail-fast.
 *             
 *             
 */
public class ArrayList19 
{
	public static void main(String[] args) 
	{
		ArrayList list = new ArrayList();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		Iterator it = list.iterator();
		//list.add(9);  java.util.ConcurrentModificationException  [ because of fail-fast ]
		
		//Now we need to iterate first  then we can able to perform any operations.
		while(it.hasNext())          //hasNext() method return boolean
		{
			Object obj= it.next();     // next() method return object
			System.out.println(obj);     //remove method return object next example show the use of remove() method.
		}
		
		list.add(9);
		
		System.out.println(list);
		System.out.println("Hello World!");
	}
}
/*
Output:-

1
2
3
4
5
6
7
8
[1, 2, 3, 4, 5, 6, 7, 8, 9]
Hello World!

*/
