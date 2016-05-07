package com.anurag.array.multidimentional;
class Multidimentional28 
{
	public static void main(String[] args) 
	{
		int x[][]={{1,2},{1},{},{3,4,5,10,30,50}};
		System.out.println(x.length);
		System.out.println(x[3].length);
		System.out.println("------------------");
		for(int [] y:x)
			for(int c:y)
			     System.out.println(c);
			     System.out.println("------------------");
         for(int i=0; i<x.length; i++){
			 for(int j=0; j<x[i].length;j++){
			      System.out.print(x[i][j]+" ");
				  }
				  System.out.println();
		 }

		System.out.println("Hello World!");
	}
}
