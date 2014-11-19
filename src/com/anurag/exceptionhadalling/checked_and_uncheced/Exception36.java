package com.anurag.exceptionhadalling.checked_and_uncheced;

import java.sql.SQLException;

/**
 * 
 * @author Anurag
 * 
 *   Concept:- How throws will work on constructor at a time of inheritance.
 *
 */

class Exception36_1{
	Exception36_1()throws SQLException{
		
	}
}

class Exception36_2 extends Exception36_1{
	/*Exception36_2(){
	  try{
		 super(); 
	  }catch(SQLException e){
		  
	  }
	}*/
	/**
	 * This is not going to work because subclass constructor automatically call to super
	 * class constructor. But again we get compile time error
	 *  because super is not a first statement. 
	 *  
	 *  So here only one way that is throws keyword.
	 */
	
	Exception36_2()throws SQLException{
		
	}
}
public class Exception36 {

}
