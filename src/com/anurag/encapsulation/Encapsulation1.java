package com.anurag.encapsulation;
/**
 *  * @author Anurag
 *  
 *    Encapsulation:- 
 *    
 *            Whatever entity are require in your normal operation list out
 *            all the property and behavior. Every property is knows as attribute
 *            and behavior is knows as method.
 *            putting this property and behavior in side single entity knows as encapsulation. 
 */


class Person{
	String name;
	int age;
	double weight;
	double height;
}

public class Encapsulation1 {

	public static void main(String[] args) {
		Person p1 = new Person();
		p1.name="abc";
		p1.age=20;
		p1.weight=55.09;
		p1.height=5.4;
		
		Person p2 = new Person();
		p2.name="ramu";
		p2.age=30;
		p2.weight=75.096;
		p2.height=6.4;
		
		System.out.println(p1.name);
		System.out.println(p1.age);
		System.out.println(p1.weight);
		System.out.println(p1.height);
		
		System.out.println("====================");
		
		System.out.println(p2.name);
		System.out.println(p2.age);
		System.out.println(p2.weight);
		System.out.println(p2.height);
		
		
	}
	
}

/*   
 *     Output:-
 *           
                abc
				20
				55.09
				5.4
				====================
				ramu
				30
				75.096
				6.4

 *  
 *  
 *  
 *  
 *  
 *  */
   

