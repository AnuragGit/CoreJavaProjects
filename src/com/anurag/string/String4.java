package com.anurag.string;
/**
 * 
 * @author Anurag
 *         Concept:- Exercise in constant pool and non constant pool
 */
public class String4 
{
	public static void main(String[] args) 
	{
		String s1 ="ja";//constant pool
		String s2 ="va";//constant pool
		String s3 ="java";//constant pool
		String s4 =s1+s2;//Non constant pool because permanent variable is their.
		String s5 ="ja"+s2;//Non constant pool
		String s6=s1+"va";// NonConstant pool;
		String s7="ja"+"va"; //Constant pool;
		System.out.println("s3= "+s3+" , s4= "+s4+" --->  "+(s3==s4)+" s3 hascode is "+s3.hashCode()+" s4 hascode is "+s4.hashCode());
		System.out.println("s3= "+s3+" , s5= "+s5+" --->  "+(s3==s5)+" s3 hascode is "+s3.hashCode()+" s5 hascode is "+s5.hashCode());
		System.out.println("s3= "+s3+" , s6= "+s6+" --->  "+(s3==s6)+" s3 hascode is "+s3.hashCode()+" s6 hascode is "+s6.hashCode());
		System.out.println("s3= "+s3+" , s7= "+s7+" --->  "+(s3==s7)+" s3 hascode is "+s3.hashCode()+" s7 hascode is "+s7.hashCode());
		System.out.println("s4= "+s4+" , s5= "+s5+" --->  "+(s4==s5)+" s4 hascode is "+s4.hashCode()+" s5 hascode is "+s5.hashCode());
		System.out.println("s4= "+s4+" , s6= "+s6+" --->  "+(s4==s6)+" s4 hascode is "+s4.hashCode()+" s6 hascode is "+s6.hashCode());
		System.out.println("s4= "+s4+" , s7= "+s7+" --->  "+(s4==s7)+" s4 hascode is "+s4.hashCode()+" s7 hascode is "+s7.hashCode());
		System.out.println("s5= "+s5+" , s5= "+s5+" --->  "+(s5==s5)+" s5 hascode is "+s4.hashCode()+" s5 hascode is "+s5.hashCode());
		System.out.println("s5= "+s5+" , s6= "+s6+" --->  "+(s5==s6)+" s5 hascode is "+s4.hashCode()+" s6 hascode is "+s6.hashCode());
		System.out.println("s5= "+s5+" , s7= "+s7+" --->  "+(s5==s7)+" s5 hascode is "+s4.hashCode()+" s7 hascode is "+s7.hashCode());
		System.out.println("Hello World!");
	}
}
/*
Output:- 

s3= java , s4= java --->  false s3 hascode is 3254818 s4 hascode is 3254818
s3= java , s5= java --->  false s3 hascode is 3254818 s5 hascode is 3254818
s3= java , s6= java --->  false s3 hascode is 3254818 s6 hascode is 3254818
s3= java , s7= java --->  true s3 hascode is 3254818 s7 hascode is 3254818
s4= java , s5= java --->  false s4 hascode is 3254818 s5 hascode is 3254818
s4= java , s6= java --->  false s4 hascode is 3254818 s6 hascode is 3254818
s4= java , s7= java --->  false s4 hascode is 3254818 s7 hascode is 3254818
s5= java , s5= java --->  true s5 hascode is 3254818 s5 hascode is 3254818
s5= java , s6= java --->  false s5 hascode is 3254818 s6 hascode is 3254818
s5= java , s7= java --->  false s5 hascode is 3254818 s7 hascode is 3254818
Hello World!*/
