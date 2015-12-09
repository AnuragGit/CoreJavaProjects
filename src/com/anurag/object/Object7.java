package com.anurag.object;

/**
 * @author Anurag
 * 
 *  Concept:- This program show how to override the equals method
 *         of object class with more than one attribute. And will describe which 
 *         scenario class cast exception will come here.
 */
class Object7_G {
	int i, j;

	Object7_G(int i, int j) {
		this.i = i;
		this.j = j;
	}

	public boolean equals(Object obj) {
		System.out.println("Calling Object7_G equlas method ");
		 Object7_G g=(Object7_G)obj;
		 boolean flag =(i==g.i && j==g.j);
		 return flag;
		
		 // single line
		//return (i == ((Object7_G) obj).i) && (j == ((Object7_G) obj).j);
	}

}

class Object7_H {
	int i, j;

	Object7_H(int i, int j) {
		this.i = i;
		this.j = j;
	}

	public boolean equals(Object obj) {
		System.out.println("Calling Object7_H equlas method ");
		Object7_H h=(Object7_H)obj;
		 boolean flag =(i==h.i && j==h.j);
		 return flag;		
		
	}

}
public class Object7 {
	public static void main(String[] args) throws InterruptedException {
		Object7_G g1 = new Object7_G(10, 20);
		Object7_G g2 = new Object7_G(10, 20);
		Object7_H h1 = new Object7_H(10, 20);
		Object7_H h2 = new Object7_H(10, 20);

		System.out.println(g1 == g2);
		System.out.println(g1.equals(g2));
		System.out.println("=====================");
		try{
			System.out.println(g1.equals(h2));
		}catch(Exception e){
			e.printStackTrace();
		}
		
		try{
			System.out.println(h2.equals(g1));
		}catch(Exception e){
			e.printStackTrace();
		}
		
		System.out.println("Hello World!");
	}
}

/*Output:-

false
Calling Object7_G equlas method 
true
=====================
Calling Object7_G equlas method 
java.lang.ClassCastException: com.anurag.object.Object7_H cannot be cast to com.anurag.object.Object7_G
	at com.anurag.object.Object7_G.equals(Object7.java:19)
	at com.anurag.object.Object7.main(Object7.java:57)
Calling Object7_H equlas method 
java.lang.ClassCastException: com.anurag.object.Object7_G cannot be cast to com.anurag.object.Object7_H
	at com.anurag.object.Object7_H.equals(Object7.java:39)
	at com.anurag.object.Object7.main(Object7.java:63)
Hello World!

*/