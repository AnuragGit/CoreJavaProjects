package com.anurag.methodoverloading;
/**
 * @author Anurag
 *	 Concept:-  Method Overloading means:-
 *            1) All method have same name with unique signature means method argument must
 *               be different .
 *            2) All method have same or different return type.
 *            3) All method have same or different Access level.
 *            4) No matter static or non static
 */
public class MethodOverload2 {
    void test(){
    	System.out.println("test()");
    }
    
    void test(int i){
    	System.out.println("test("+i+")");
    }
    
    double test(double d){
    	return d;
    }
    
    public boolean test(int i,int j){
    	return true;
    }
    
    static protected  void test(char c){
    	System.out.println("test("+c+")");
    }
    
    public static void main(String[] args) {
		
    	MethodOverload2 m = new MethodOverload2();
    	m.test();
    	m.test(10);
    	System.out.println(m.test(10.3));
    	System.out.println(m.test(10, 20));
    	m.test('a');
	}
}

/*		Output:-
		
		test()
		test(10)
		10.3
		true
		test(a)
		
*/

