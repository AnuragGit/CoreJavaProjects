package com.anurag.collections.arraylist.advance;
//Sorting the content of ArrayList
//Data type of arraylist must be same and no null value here
import java.util.ArrayList;
import java.util.Collections;
public class ArrayList25 
{
	public static void main(String[] args) 
	{
		ArrayList list = new ArrayList();
		list.add(112);
		list.add(912);
		//list.add(12.1); classcastException occurs
		list.add(152);
		list.add(512);
		list.add(212);
		list.add(132);
		list.add(145);
		//list.add(null); NullPointerException occurs
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		System.out.println("Hello World!");
	}
}
