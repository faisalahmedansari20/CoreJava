package com.arrays;

public class Var {

	public static void m1(int...x)
	{
		System.out.println("in the var args");
	}
	/*public static  void m1(Integer... x)
	{
		System.out.println("in the array");
	}*/
	/*public static  void m1(Integer[] x)
	{
		System.out.println("in the array");
	}*/
	
	     public final static synchronized strictfp  void  main(String[] args)
	{
		m1(3,4,5);
		m1(new int[]{2,3});
		
		
		/*m1(new Integer(4));
		m1(new Integer[]{3,4});
		m1(new int[]{3,4});
		m1(new int[]{new Integer(4),new Integer(5)});*/
	}
}

