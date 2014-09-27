package com.anurag.inheritance.staticinheritance;
/**
 *  @author Anurag
 *  
 *  Concept:- Simple if extends keyword will available on the class then super class will be load
 *  first and this class SIB will be execute first then only subclass will get chance to execute.
 */

class Inhertance6_O{
	static{
		System.out.println("Inhertance6_O SIB");
	}
}

class Inhertance6_P extends Inhertance6_O{
	static{
		System.out.println("Inhertance6_P SIB");
	}
}
class Inhertance6_Q extends Inhertance6_P{
	static{
		System.out.println("Inhertance6_Q SIB");
	}
}

class Inhertance6_R extends Inhertance6_Q{
	static{
		System.out.println("Inhertance6_R SIB");
	}
	
	public static void main(String[] args) {
		System.out.println("Inhertance6_R Main Begining");
		Inhertance6_P p1 = new Inhertance6_P();
		System.out.println("Inhertance6_r Main_end");
	}
}

class Inhertance6_S extends Inhertance6_R{
	static{
		System.out.println("Inhertance6_S SIB");
	}
}
public class Inhertance6  extends Inhertance6_Q{
	static{
		System.out.println("Inhertance6 SIB");
	}
	
	public static void main(String[] args) {
		System.out.println("Inhertance6 Main_begin");
		
		Inhertance6_Q q1 = new Inhertance6_Q();
		
		System.out.println("Inhertance6 Main End");
		
	}
}


/*			Output:-
			
			Inhertance6_O SIB
			Inhertance6_P SIB
			Inhertance6_Q SIB
			Inhertance6 SIB
			Inhertance6 Main_begin
			Inhertance6 Main End
*/