package com.anurag.garbageCollection;
/**
 * 
 * @author Anurag
 *   
 *   Concept:-
 *   finalize() method
 *   garbage collector call the finalize method then only it remove the abundant object.
 *   garbage collector call the finalize method maximum only one time.
 *   it is user define thread so very less priority it have.
 *   we explicitly request to garbage collector to call finalize method, it may accept or may not accept
 *   request going to ways -
 *   System.gc();
 *   Runtime.getRuntime().gc();
 *
 */

class GarbageCollector1_Relax
{
	@Override
	protected  void finalize()
	{
		System.out.println("finalize");
	}
}
public class GarbageCollector1 
{
	public static void main(String[] args) 
	{
		GarbageCollector1_Relax r = new GarbageCollector1_Relax();
		r=null;
		System.out.println("abandonded");
		Runtime.getRuntime().gc();
		try
		{
			Thread.sleep(10000);
          
		}
		catch (InterruptedException ex)
		{
			System.out.println(ex);
		}
	
		System.out.println("Hello World!");
	}
}


/*Output:-

abandonded
finalize
Hello World!

*/
