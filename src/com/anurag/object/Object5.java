package com.anurag.object;
/**
 * @author Anurag
 *    
 *      Concept:- This program show the same concept like equal method internally using == operator.
 */
class Object5_E
{
	int i,j;
	Object5_E(int i,int j)
	{
		this.i=i;
		this.j=j;
	}

}
public class Object5 
{
	public static void main(String[] args) 
	{
		Object5_E e1 = new Object5_E(10,20);
		Object5_E e2 = new Object5_E(10,20);
		Object5_E e3=e1;
		System.out.println(e1==e2);
		System.out.println(e2==e3);
		System.out.println(e3==e1);
		System.out.println("-----------------");

		System.out.println(e1.equals(e2));
		System.out.println(e2.equals(e3));
		System.out.println(e3.equals(e1));

		System.out.println("Hello World!");
	}
}

/*Output:-

false
false
true
-----------------
false
false
true
Hello World!
*/
