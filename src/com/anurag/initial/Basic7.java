package com.anurag.initial;
/**
 * 
 * @author Anurag
 * concept: How to initialization common type of variable in single line.
 */
public class Basic7 {
	public static void main(String[] args) {
		int i,j,k;
		i=j=k=10;
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
		
		//So here initialization sequences is k=10; then j=k and i=j;
	}
}
