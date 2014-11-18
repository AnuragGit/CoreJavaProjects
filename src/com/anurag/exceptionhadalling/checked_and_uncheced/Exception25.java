package com.anurag.exceptionhadalling.checked_and_uncheced;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author Anurag
 * 
 *   Concept:- This program show checked Exception SQLException , so we need to use 
 *              surrounding try and catch or throws statement.
 *
 */
public class Exception25 {
	
	public static void main(String[] args) throws SQLException {
		Connection con=DriverManager.getConnection("");
	}
}
