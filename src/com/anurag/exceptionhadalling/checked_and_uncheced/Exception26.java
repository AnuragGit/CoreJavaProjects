package com.anurag.exceptionhadalling.checked_and_uncheced;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * @author Anurag
 *
 *   Concept:- This program show Checked Exception FileNotFoundException.
 */
public class Exception26 {
		public static void main(String[] args) throws FileNotFoundException {
			FileReader fin = new FileReader(""); 
		}
}
