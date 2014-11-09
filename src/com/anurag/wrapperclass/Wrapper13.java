package com.anurag.wrapperclass;

/**
 * @author Anurag
 *   
 *     Concept:-  int hascode()
 *     
 *        Each wrapper class override the hascode() method  from the object class.
 *        
 *        The Override method  return a hashvalue  based on the primitive value in the wrapper object.
 */
public class Wrapper13 {
	
	public static void main(String[] args) {
		
		Integer i= new Integer(10);
		
		System.out.println("new Integer(10)--->"+i.hashCode());
		
		Integer i1 =Integer.valueOf(11);
		
		System.out.println("Integer.valueOf(11)------>"+i1.hashCode());
		
		Short s = new Short((short)12);
		
		System.out.println("new Short((short)12)------->"+s.hashCode());
		
		Short s1  =Short.valueOf((short)11);
		
		System.out.println("Short.valueOf((short)11)----->"+s1.hashCode());
		
		Character c1 = new Character('a');
		
		System.out.println("new Character('a')--------->"+c1.hashCode());
		
         Character c2 = Character.valueOf('b');
		
		System.out.println("Character.valueOf('b')--------->"+c2.hashCode());
		
		Boolean b1 = new Boolean(true);
		
		System.out.println("new Boolean(true)----->"+b1.hashCode());
		
		Boolean b2 = Boolean.valueOf(false);
		
		System.out.println("Boolean.valueOf(false)------>"+b2.hashCode());
		
		Float f1 = new Float(23.9);
		
		System.out.println("new Float(23.9)--------->"+f1.hashCode());
		
		
		Float f2 = Float.valueOf(40.45f);
		
		System.out.println("new Float(40.45)--------->"+f2.hashCode());

		Double d1 = new Double(134);
		
		System.out.println("new Double(134)---------->"+d1.hashCode());
		
		Double d2 = Double.valueOf(431.89);
		
		System.out.println("Double.valueOf(431.89)------>"+d2.hashCode());
		
		Long l1 = new Long(345);
		System.out.println(" new Long(345)--------->"+l1.hashCode());
		
		
		Long l2 = Long.valueOf(546);
		
		System.out.println("Long.valueOf(546)----------->"+l2.hashCode());
		
		Byte b = new Byte((byte) 7);
		System.out.println("new Byte((byte) 7)------->"+b.hashCode());
		
		Byte b3 =Byte.valueOf((byte) 12);
		
		System.out.println("Byte.valueOf((byte) 12)------>"+b3.hashCode());
		
	
	}

}


		/*Output:-
		
		new Integer(10)--->10
		Integer.valueOf(11)------>11
		new Short((short)12)------->12
		Short.valueOf((short)11)----->11
		new Character('a')--------->97
		Character.valueOf('b')--------->98
		new Boolean(true)----->1231
		Boolean.valueOf(false)------>1237
		new Float(23.9)--------->1103049523
		new Float(40.45)--------->1109511373
		new Double(134)---------->1080082432
		Double.valueOf(431.89)------>819538231
		 new Long(345)--------->345
		Long.valueOf(546)----------->546
		new Byte((byte) 7)------->7
		Byte.valueOf((byte) 12)------>12
*/