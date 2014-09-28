package com.anurag.this_and_super;
/**
 * 
 * @author Anurag
 *    
 *    Concept:-
 *    
 *    While using static member we can use along  with class name , If at all we not use static member
 *    with class name then complier internally put the class name before static member.  
 */

class ThisConcept4_D{
	int i;
	static int j;
	void print(){
		System.out.println(i);
		System.out.println(j);
		System.out.println(this.i);
		System.out.println(ThisConcept4_D.j);
	}
	
	void setI(int i){
		this.i=i;
	}
	
	void setJ(int j){
		ThisConcept4_D.j=j;
	}
}
public class ThisConcept4 {
	
	public static void main(String[] args) {
		ThisConcept4_D td = new ThisConcept4_D();
		td.print();
		System.out.println("==============");
		td.setI(90);
		td.setJ(190);
		td.print();
	}

}
/*
    Output:-
    
    0
    0
    0
    0
    ==============
    90
    190
    90
    190
*/