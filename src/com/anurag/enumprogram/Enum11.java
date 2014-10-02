package com.anurag.enumprogram;
/**
 * @author Anurag
 *	
 *  Concept:- When enum constraint are loading to the memory it treat as object of class and 
 *            all nonstatic member also loading to the memory.
 *            
 *            enum--> similar to class
 *            
 *            constant--> Object to class
 *            
 *            enum Constant --> always static
 *            
 *            enum method and attribute--> may be static or non static
 */
public class Enum11 {
	enum Enum11_Month{
		JAN(31),FEB(29),MAR(31);
		int days;
		Enum11_Month(int days){
			this.days=days;
		}
		public int getDays() {
			return days;
		}
	}
	
	public static void main(String[] args) {
		Enum11_Month m1 = Enum11_Month.FEB;
		System.out.println(m1);
		System.out.println(m1.getDays());
		System.out.println(m1.days);
	}
}
/*		
		Output:-
		
		FEB
		29
		29
*/
