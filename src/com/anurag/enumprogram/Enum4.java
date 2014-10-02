package com.anurag.enumprogram;
/**
 * 
 * @author Anurag
 *		
 *		Concept:- Enum also by default static .Because it contains static constant.
 */

class Enum4_A{
	enum B{
		C1,C2,C3,C4;
	}
}
public class Enum4 {
	public static void main(String[] args) {
		Enum4_A.B b1 = Enum4_A.B.C1;
		System.out.println(b1);
		Enum4_A.B b2 = Enum4_A.B.C3;
		System.out.println(b2);
	}
}

/*Output:-

C1
C3

*/
