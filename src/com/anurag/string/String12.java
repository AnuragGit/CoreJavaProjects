package com.anurag.string;

/**
 * @author Anurag
 *        Concept:-    This program is showing indexOf method
 *               
 *               (1) lastIndexOf(char ch)  , if we supply only one character then searching of
 *                                       character will be done by right to left.
 *               
 *               (2)lastIndexOf(char ch,int formlastlastIndex) , But when we supply character with 
 *                                       index then it will look for character to given
 *                                       index onward from right to left.
 *                                       
 *               (3)lastIndexOf(String s)  , if we supply only String then searching of
 *                                       String will be done by right to left.
 *               
 *               (4)lastIndexOf(String s,int from lastlastIndex) , But when we supply String with 
 *                                       index then it will look for String to given
 *                                       index onward from right to left.
 *                                       
 *          Important point::-In this method Searching Order only will be right to left but
 *                            String order is always left to right.
 *           
 */
public class String12
{
	public static void main(String[] args) 
	{
		String str = "abc xyz abc xyz";
		                 //123456789
		int i=str.lastIndexOf('a');
		System.out.println(i);
		i=str.lastIndexOf('a',4);
		System.out.println(i);
       i=str.lastIndexOf("abc");
		System.out.println(i);
		i=str.lastIndexOf("abc",3);
		System.out.println(i);
		System.out.println("Hello World!");
	}
}
/*
Output:-

8
0
8
0
Hello World!

*/