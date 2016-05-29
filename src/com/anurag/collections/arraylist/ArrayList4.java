package com.anurag.collections.arraylist;
import java.util.ArrayList;
/**
 * @author Anurag
 *        Concept:- This program demonstrate the return type of get method is object and
 *                  add() method also take only object data type.
 *                  
 *              Object type are argument of add() method that why it is possible to add all
 *              the datatype here.
 *              
 *              When ever we add to string value automatic it is up-casting to Object type.
 *              When ever we added to int value its automatic boxing to Integer Object .
 *              
 *               get() method return type is Object .
 *               
 *               so
 *               
 *               int i  =list.get(1) ; will give compile time error
 *               int i =(Integer) list.get(1); //Ok down casting is here.
 *               
 *               All collection object require only derived data type . Converting 
 *               primitive to derived wrapper class require .The main importance
 *               of wrapper class is converting primitive to derived datatype while adding 
 *               Object to collection.
 *               
 *                  
 */
public class ArrayList4  
{
	public static void main(String[] args) 
	{
		ArrayList list = new ArrayList();
		list.add(12);
		int i=(Integer) list.get(0);
		System.out.println(i);
		System.out.println("Hello World!");
	}
}

/*Output:-

12
Hello World!
*/