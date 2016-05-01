package com.anurag.string;
/** 
 * @author Anurag
 *        
 *    Concept:- String object are immutable and here  we are 
 *              showing When String Object create in NonConstantpool and when String
 *              Object are creating in constant pool .
 *              
 *              and During the append any value on string object it will be create one
 *              new Object for that reason string is immutable.
 *              
 *              We are also showing How to append on integer value in side a string
 */
public class String3
{
	public static void main(String[] args) 
	{
		String s1="abc"; // It create Object in constant pool 
		System.out.println(s1+" and hashcode is "+s1.hashCode());
		s1=s1+123;// it create Object in NonConstant pool  because + operator found one permanent reference variable.
		System.out.println(s1+" and hashcode is "+s1.hashCode());
		
		String s2="abc";
		System.out.println(s2+" and hashcode is "+s2.hashCode());
		
		s2="abc"+123; // new Object got created in constant pool.
		
		System.out.println(s2+" and hashcode is "+s2.hashCode());
		
		String s3="abc123";
		
		System.out.println(s2==s3);
		
		System.out.println("Hello World!");
	}
}

/*
Output:-

abc and hashcode is 96354
abc123 and hashcode is -1424436592
abc and hashcode is 96354
abc123 and hashcode is -1424436592
true
Hello World!

*/