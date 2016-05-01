package com.anurag.string;

/**
 * @author Anurag  
 * 
 *      Concept:-     This program is showing indexOf method
 *               
 *               (1) indexOf(char ch)  , if we supply only one character then searching of
 *                                       character will be done by left to right.
 *               
 *               (2)indexOf(char ch,int formindex) , But when we supply character with 
 *                                       index then it will look for character to given
 *                                       index onward from left to right.
 *                                       
 *               (3) indexOf(String s)  , if we supply only String then searching of
 *                                       String will be done by left to right.
 *               
 *               (4)indexOf(String s,int formindex) , But when we supply String with 
 *                                       index then it will look for String to given
 *                                       index onward from left to right.
 *           
 *
 */
public class String11 
{
	public static void main(String[] args) 
	{
		String str = "abc xyz abc xyz";
		            //012345678910 11 12 13 14
		System.out.println(str.length());
		int i=str.indexOf('a');
		System.out.println(i);
		i=str.indexOf('a',4);
		System.out.println(i);
        i=str.indexOf("abc");
		System.out.println(i);
		i=str.indexOf("abc",3);
		System.out.println(i);
	}
}
/*
Output:-

15
0
8
0
8*/


