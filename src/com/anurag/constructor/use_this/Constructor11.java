package com.anurag.constructor.use_this;
/**
 * 
 * @author Anurag
 *          Concept:-
 *          
 *              this() - by this we can give a call to one constructor to another constructor
 *              
 *              This should be the first line of constructor , if it is available.
 */
public class Constructor11 {

	         int i;
	         Constructor11(){
	        	 this(10);
	        	 System.out.println("Constructor11()");
	         }
	         
	         Constructor11(int x){
	        	 System.out.println("Constructor11(int x)");
	        	 i=x;
	         }
	         
	         public static void main(String[] args) {
				Constructor11 c1 = new Constructor11();
				System.out.println("==================");
				Constructor11 c2 = new Constructor11(20);
				System.out.println("====================");
				
				System.out.println("C1 object initilization:-"+c1.i);
				System.out.println("C2 object initilization:-"+c2.i);
			}
	
}

/*Output:-

		Constructor11(int x)
		Constructor11()
		==================
		Constructor11(int x)
		====================
		C1 object initilization:-10
		C2 object initilization:-20
*/
