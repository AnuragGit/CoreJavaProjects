package com.anurag.interfacepro;
/**
 * 
 * @author Anurag
 * 
 * Concept:- 
 * 
 *        If we want to design a member in a package to 100% abstract then we can not achieve 
 *        through class. It will be achieve by Interface.
 *        
 *        Inside the interface we can only define constant and abstract method
 *        
 *        We can not declare SIB and IIB and Constructor in side the interface.
 *        
 *        Inside the class abstract keyword is mandatory to make difference between abstract and concrete class.
 *        
 *        But in Interface abstract keyword is optional. Every method is public and abstract by default.
 *        
 *        Before method only return type is require
 *        
 *        Compiler will develop .class file for interface also.
 */
public interface Interface1 {
		void test1();
		abstract void test2();
		public abstract void test3();
		abstract public void test4();
}
