package com.anurag.string;

/**
 * @author Anurag
 * 
 *         Concept:-
 *             concat()method always assign object is nonconstant pool.
 * 
 *
 */
public class String6 
{
	public static void main(String[] args) 
	{
        String s1 ="ja";//constant pool
		String s2 ="va";//constant pool
		String s3 ="java";//constant pool
		String s4 =s1.concat(s2);//Non constant pool because permanent variable is their.
		String s5 ="ja".concat(s2);//Non constant pool
		String s6=s1.concat("va");// NonConstant pool;
		String s7="ja".concat("va"); //Also Non Constant pool becasue internally using "this.ja.concat("va")";
		System.out.println("s3= "+s3+" , s4= "+s4+" --->  "+(s3==s4));
		System.out.println("s3= "+s3+" , s5= "+s5+" --->  "+(s3==s5));
		System.out.println("s3= "+s3+" , s6= "+s6+" --->  "+(s3==s6));
		System.out.println("s3= "+s3+" , s7= "+s7+" --->  "+(s3==s7));
		System.out.println("s4= "+s4+" , s5= "+s5+" --->  "+(s4==s5));
		System.out.println("s4= "+s4+" , s6= "+s6+" --->  "+(s4==s6));
		System.out.println("s4= "+s4+" , s7= "+s7+" --->  "+(s4==s7));
		//System.out.println("s5= "+s5+" , s5= "+s5+" --->  "+(s5==s5));
		System.out.println("s5= "+s5+" , s6= "+s6+" --->  "+(s5==s6));
		System.out.println("s5= "+s5+" , s7= "+s7+" --->  "+(s5==s7));
		System.out.println("s6= "+s6+" , s7= "+s7+" --->  "+(s6==s7));
		System.out.println("Hello World!");
	}
}
/*
Output:-

s3= java , s4= java --->  false
s3= java , s5= java --->  false
s3= java , s6= java --->  false
s3= java , s7= java --->  false
s4= java , s5= java --->  false
s4= java , s6= java --->  false
s4= java , s7= java --->  false
s5= java , s6= java --->  false
s5= java , s7= java --->  false
s6= java , s7= java --->  false
Hello World!

*/