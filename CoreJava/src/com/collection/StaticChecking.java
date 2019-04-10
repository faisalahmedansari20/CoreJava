package com.collection;

public class StaticChecking {

//	static int i = 30;
	  static StaticChecking checking = new StaticChecking();
	static
	{
		
//		m1();
//		System.out.println(i);
		System.out.println("hi how are you");
	}
	StaticChecking()
	{
		System.out.println("in the constructor");
	}
	public static void main(String[] args)
	{
		
	}
	public static void m1()
	{
//		System.out.println(i);
	}

}
