package com.anurag.exceptionhadalling.checked_and_uncheced;

import java.sql.SQLException;

/**
 * 
 * @author Anurag
 * 
 *     Concept:- If constructor of any class is throwing checked exception then at the 
 *                time of creating the object of this class we should handle either by
 *                try catch or throws keyword.
 *
 */

class Exception35_1{
	Exception35_1() throws SQLException{
		
	}
}
public class Exception35 {
	public static void main(String[] args) throws SQLException {
		
		Exception35_1 e = new Exception35_1();
	}
	
}
