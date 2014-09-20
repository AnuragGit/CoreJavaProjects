package com.anurag.inheritance;
/**
 *  * @author Anurag
 *		Concept:- This is Inheritance
 */

class Inheritance3_base{
	int x;
}
public class Inheritance3 extends Inheritance3_base {

	int y;
	public static void main(String[] args) {
		Inheritance3_base i1 = new Inheritance3_base();
		i1.x=10;
		System.out.println(i1.x);
		System.out.println("============================");
		Inheritance3 i2 = new Inheritance3();
		i2.x=20;
		i2.y=40;
		System.out.println(i2.x);
		System.out.println(i2.y);
	}
}


/*		output:-  
		
		10
		============================
		20
		40
*/